package npnets.simulator.al;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class ALCodeLinker {
	private HashMap<String, TransitionWithALCode> nameToTrans;
	private HashMap<String, TransitionWithALCode> uuidToTrans;
	private HashMap<String, String> uuidToCode;
	private List<TransitionWithALCode> transitions;
	private final String TASK = "task";
	private final String LBRACKET = "{";
	private final String RBRACKET = "}";
	private final String CONFIRMATION = "confirmation";
	private final String LINEBREAK = "\n";
	private final String COLON = ":";
	private final String ARROW = "->";
	private final String QUOTE = "\"";
	private final String CONFIRMATIONTEXT = "OK";
	private int taskNumber = 0;
	
	public String extractCodeFromElementNet(HighLevelPetriNet net){
		
		StringBuilder code = new StringBuilder();
		try{
		for(Node node: net.getNodes()){
			if(node.getName() != null && node.getName().equals("begin")){
				Transition transition = (Transition)node;
				Place place = transition.getOutArcs().get(0).getTarget();
				code.append(getTasksWorkflowFromConcurrentPlace(place));
			}
		}
		} catch(NullPointerException ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage()); //REMOVE
			return "no";
		}
		return code.toString();
		
	}
	
	
	private String getTasksWorkflowFromConcurrentPlace(Place place){
		String s = "";
		String taskName = TASK + taskNumber++;
		List<TransitionWithALCode> targetTransitions = getTargetTransitions(place.getOutArcs());
		s = createCodeForConcurrentTransitions(taskName, targetTransitions);
		return s;
	}
	
	
	private String createCodeForConcurrentTransitions(String taskName, List<TransitionWithALCode> transitions){
		
		if(transitions.size() == 0){
			return "";
		}
		
		StringBuilder code = new StringBuilder(TASK + " " + taskName + LBRACKET + LINEBREAK);
		List<String> nextTasks = new ArrayList<>();
		int transitionNumber = transitions.size();
		fillNewTaskNames(nextTasks, transitionNumber);
		
		System.out.println("transition number = " + transitionNumber); //REMOVE
		for(int i = 0; i<transitionNumber; ++i){
			String partOfCode = extractCodeFromTransition(transitions.get(i));
			System.out.println("partOfCode = ---"); //REMOVE
			System.out.println(partOfCode);
			partOfCode = insertConfirmationIntoPart(nextTasks.get(i), partOfCode);
			code.append(LINEBREAK);
			code.append(partOfCode);
		}
		
		code.append(RBRACKET);
		
		for(int i = 0; i < transitionNumber; ++i){
			List<TransitionWithALCode> transitionsForTheNextTask = createNewListWithoutTransition(transitions, transitions.get(i));
			System.out.println("SIZE=" + transitionsForTheNextTask.size()); //REMOVE
			code.append(createCodeForConcurrentTransitions(nextTasks.get(i), transitionsForTheNextTask));
		}
		
		
		return code.toString();
	}
	
	private void fillNewTaskNames(List<String> list, int size) {
		for(int i = 0; i<size; ++i){
			list.add(TASK + taskNumber++);
		}
	}
	private List<TransitionWithALCode> createNewListWithoutTransition(List<TransitionWithALCode> list, TransitionWithALCode trans){
		List<TransitionWithALCode> out = new ArrayList<TransitionWithALCode>(list);
		out.remove(trans);
		return out;
	}
	private String insertConfirmationIntoPart(String confirmTask, String part){
		int placeToInsert = part.lastIndexOf('}');
		StringBuilder out = new StringBuilder(part);
		String confirmation = CONFIRMATION + COLON + LINEBREAK + 
				QUOTE + CONFIRMATIONTEXT + QUOTE + ARROW + confirmTask + LINEBREAK;
		out.insert(placeToInsert, confirmation);
		return out.toString();
	}
	
	private List<Transition> getSourceTransitions(List<ArcTP> arcs){
		List<Transition> outList = new ArrayList<Transition>();
		for(ArcTP arc: arcs){
			outList.add(arc.getSource());
		}
		return outList;
	}
	
	private List<TransitionWithALCode> getTargetTransitions(List<ArcPT> arcs){
		List<TransitionWithALCode> outList = new ArrayList<TransitionWithALCode>();
		for(ArcPT arc: arcs){
			if(arc.getTarget() != null){
				outList.add((TransitionWithALCode)arc.getTarget());
			}
		}
		return outList;
	}
	private void loadCurrentNetTransitionsToMaps(HighLevelPetriNet net){
		nameToTrans = new HashMap<String, TransitionWithALCode>();
		uuidToTrans = new HashMap<String, TransitionWithALCode>();
		uuidToCode = new HashMap<String, String>();
		transitions = new ArrayList<TransitionWithALCode>();
		for(Node nd: net.getNodes()){
			if(nd instanceof TransitionWithALCode){
				TransitionWithALCode trans = (TransitionWithALCode)nd;
				String code = extractCodeFromTransition(trans);
				String transName = extractNameFromTransition(trans);
				nameToTrans.put(transName, trans);
				uuidToTrans.put(trans.getUuid(), trans);
				uuidToCode.put(trans.getUuid(), code);
			}
		}
	}
	
	private String extractCodeFromTransition(TransitionWithALCode trans){
		if(trans != null){ //REMOVE
			System.out.println("OK\n"+trans.getCode());
		} else{
			System.out.println("Here we are!");
		}
		int lbracket = trans.getCode().indexOf("{");
		int rbracket = trans.getCode().lastIndexOf("}");
		if(lbracket == -1 || rbracket == -1){
			return null;
		}
		return trans.getCode().substring(lbracket + 1, rbracket);
	}
	
	private String extractNameFromTransition(TransitionWithALCode trans){
		int space = trans.getCode().indexOf(" ");
		int equal = trans.getCode().indexOf("=");
		int upTo = Math.min(space, equal);
		return trans.getCode().substring(0, upTo);
	}
	private String getCodeFromTokenTypeElementNet(TokenTypeElementNet eNet){
		StringBuilder bld = new StringBuilder();
		return bld.toString();
	}
}
