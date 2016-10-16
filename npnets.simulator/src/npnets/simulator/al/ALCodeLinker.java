package npnets.simulator.al;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.Position.Bias;

import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.swt.widgets.TaskBar;
import org.eclipse.ui.PerspectiveAdapter;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.IOP.Codec;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class ALCodeLinker {
	private final String TASK = "task";
	private final String LCURLYBRACKET = "{";
	private final String RCURLYBRACKET = "}";
	private final String CONFIRMATION = "confirmation";
	private final String LINEBREAK = "\n";
	private final String COLON = ":";
	private final String ARROW = "->";
	private final String QUOTE = "\"";
	private final String CONFIRMATIONTEXT = "OK";
	private final String PRELIMINARIES = "preliminaries";
	private int taskNumber = 0;
	
	//hardcoding
	private final String EQUIPMENT = "equipment";
	private final String START = "start";
	private final String VICTIM = "Victim";
	private final String SOS = "SOS";
	private final String ENDUP = "End up the operation";
	private final String BEGIN = "begin";
	private HighLevelPetriNet epNet;
	private HighLevelPetriNet spNet;
	public ALCodeLinker(HighLevelPetriNet epNet, HighLevelPetriNet spNet){
		this(epNet);
		this.spNet = spNet;
	}
	
	public ALCodeLinker(HighLevelPetriNet net){
		this.epNet = net;
	}

	public String extractCodeFromElementNet() {
		StringBuilder code = new StringBuilder();
		try {
					TransitionWithALCode transition = (TransitionWithALCode) findTransitionByName("begin");
					code.append(createPreliminaries(transition));
					Place place = transition.getOutArcs().get(0).getTarget();
					String startTask = newTask();
					String finalTask = newTask();
					code.append(collectConcurrentCodeFromBegin(place, startTask, finalTask));
					return collectCodeFromStart(code.toString(), finalTask);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return code.toString();
	}
	
	private String createPreliminaries(TransitionWithALCode tr){
		String code = extractCodeFromTransition(tr);
		return PRELIMINARIES + LCURLYBRACKET + LINEBREAK + code + LINEBREAK + RCURLYBRACKET;
	}
	
	private String collectCodeFromStart(String previousCode, String startTask){
		StringBuilder builder = new StringBuilder(previousCode);
		builder.append(LINEBREAK);
		TransitionWithALCode start = findTransitionByName(START);
		builder.append(TASK + " " + startTask + LCURLYBRACKET);
		String partOfCode = extractCodeFromTransition(start);
		String sosVictimEndup = newTask();
		partOfCode = insertConfirmationIntoPart(sosVictimEndup, partOfCode); 
		builder.append(partOfCode);
		insertAwaitIfCorrespondsToSPNet(builder, start);
		builder.append(RCURLYBRACKET);
		builder.append(collectVictimSosEndUpCode(startTask, sosVictimEndup));
		return builder.toString();
	}
	
	private String collectVictimSosEndUpCode(String startTask, String initialTask){
		StringBuilder builder = new StringBuilder();
		builder.append(LINEBREAK);
		TransitionWithALCode victim = findTransitionByName(VICTIM);
		TransitionWithALCode endup = findTransitionByName(ENDUP);
		TransitionWithALCode sos = findTransitionByName(SOS);
		builder.append(TASK + " " + initialTask + LCURLYBRACKET);
		String partOfCode = extractCodeFromTransition(sos);
		partOfCode = insertConfirmationIntoPart(initialTask, partOfCode);
		builder.append(partOfCode);
		insertAwaitIfCorrespondsToSPNet(builder, sos);
		partOfCode = extractCodeFromTransition(victim);
		partOfCode = insertConfirmationIntoPart(initialTask, partOfCode); 
		builder.append(partOfCode);
		insertAwaitIfCorrespondsToSPNet(builder, victim);
		partOfCode = extractCodeFromTransition(endup);
		partOfCode = insertConfirmationIntoPart(startTask, partOfCode); 
		builder.append(partOfCode);
		insertAwaitIfCorrespondsToSPNet(builder, endup);
		builder.append(RCURLYBRACKET);
		return builder.toString();
	}
	

	private TransitionWithALCode findTransitionByName(String name){
		for(Node nd: epNet.getNodes()){
			if (nd instanceof TransitionWithALCode && nd.getName().equals(name)){
				return (TransitionWithALCode)nd;
			}
		}
		return null;
	}
	private String collectConcurrentCodeFromBegin(Place beginPlace, String startTask, String finalTask) {
		String s = "";
		List<TransitionWithALCode> targetTransitions = getTargetTransitions(beginPlace.getOutArcs());
		s = createCodeForConcurrentTransitions(startTask, finalTask, targetTransitions);
		return s;
	}

	// main task
	private String createCodeForConcurrentTransitions(String taskName, String finalTaskName, List<TransitionWithALCode> transitions) {
		StringBuilder code = new StringBuilder(TASK + " " + taskName + LCURLYBRACKET + LINEBREAK);
		List<String> nextTasks = new ArrayList<>();
		int transitionNumber = transitions.size();
		
		if (transitionNumber == 1) {
			nextTasks.add(finalTaskName);
		} else {
			fillNewTaskNames(nextTasks, transitionNumber);
		}

		// Task creation
		for (int i = 0; i < transitionNumber; ++i) {
			TransitionWithALCode transition = transitions.get(i);
			String partOfCode = extractCodeFromTransition(transition);
			partOfCode = insertConfirmationIntoPart(nextTasks.get(i), partOfCode);
			code.append(LINEBREAK);
			code.append(partOfCode);
			insertAwaitIfCorrespondsToSPNet(code, transition);
		}
		code.append(RCURLYBRACKET);

		if (transitionNumber == 1) {
			return code.toString();
		}

		// Recursively absorbing
		for (int i = 0; i < transitionNumber; ++i) {
			if(transitions.get(i).getName().equals(EQUIPMENT)){
				List<TransitionWithALCode> transitionsForEquipment = getTargetTransitions(transitions.get(i).getOutArcs().get(0).getTarget().getOutArcs());	
				String equipmentFinalTask = newTask();
				code.append(createCodeForConcurrentTransitions(nextTasks.get(i), equipmentFinalTask, transitionsForEquipment));
				nextTasks.set(i, equipmentFinalTask);
			}
			List<TransitionWithALCode> transitionsForTheNextTask = createNewListWithoutTransition(transitions, transitions.get(i));
			code.append(createCodeForConcurrentTransitions(nextTasks.get(i), finalTaskName, transitionsForTheNextTask));
		}

		return code.toString();
	}

	private void fillNewTaskNames(List<String> list, int size) {
		for (int i = 0; i < size; ++i) {
			list.add(newTask());
		}
	}

	private List<TransitionWithALCode> createNewListWithoutTransition(List<TransitionWithALCode> list, TransitionWithALCode trans) {
		List<TransitionWithALCode> out = new ArrayList<TransitionWithALCode>(list);
		out.remove(trans);
		return out;
	}

	private String insertConfirmationIntoPart(String confirmTask, String part) {
		int placeToInsert = part.lastIndexOf('}');
		StringBuilder out = new StringBuilder(part);
		String confirmation = CONFIRMATION + COLON + LINEBREAK + QUOTE + CONFIRMATIONTEXT + QUOTE + ARROW + confirmTask + LINEBREAK;
		out.insert(placeToInsert, confirmation);
		return out.toString();
	}

	private List<Transition> getSourceTransitions(List<ArcTP> arcs) {
		List<Transition> outList = new ArrayList<Transition>();
		for (ArcTP arc : arcs) {
			outList.add(arc.getSource());
		}
		return outList;
	}

	private List<TransitionWithALCode> getTargetTransitions(List<ArcPT> arcs) {
		List<TransitionWithALCode> outList = new ArrayList<TransitionWithALCode>();
		for (ArcPT arc : arcs) {
			if (arc.getTarget() != null) {
				outList.add((TransitionWithALCode) arc.getTarget());
			}
		}
		return outList;
	}


	private String extractCodeFromTransition(TransitionWithALCode trans) {
		int lbracket = trans.getCode().indexOf("{");
		int rbracket = trans.getCode().lastIndexOf("}");
		if (lbracket == -1 || rbracket == -1) {
			return null;
		}
		return trans.getCode().substring(lbracket + 1, rbracket);
	}

	private String newTask(){
		return TASK + taskNumber++;
	}
	
	private void insertAwaitIfCorrespondsToSPNet(StringBuilder code, TransitionWithALCode tr){
		int indexOfRbracket = code.lastIndexOf(RCURLYBRACKET);
		for(Node nd: spNet.getNodes()){
			if(nd instanceof TransitionWithALCode){
				TransitionWithALCode trans = (TransitionWithALCode)nd;
				if(trans.getName().equals(tr.getName())){
					String transitionCode = trans.getCode();
					int equalIndex = transitionCode.indexOf("=");
					code.insert(indexOfRbracket, transitionCode.substring(equalIndex + 1, transitionCode.length()));
				}
			}
		}
	}
}
