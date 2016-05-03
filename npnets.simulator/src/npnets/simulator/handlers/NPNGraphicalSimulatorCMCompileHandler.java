package npnets.simulator.handlers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredViewerInternals;
import org.json.JSONObject;

import npnets.simulator.al.ALCodeLinker;
import npnets.simulator.simulate.Simulator;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;


public class NPNGraphicalSimulatorCMCompileHandler extends AbstractHandler{
	final String pathToSafe = "/Users/denissamohvalov/Documents/CourseworkMaven/src/main/java/translator/test/generated_test.action";
	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		HighLevelPetriNet net = Simulator.net.getNet().getTypeElementNet().get(0).getNet();
		String code = new ALCodeLinker(net).extractCodeFromElementNet();
		writeToFile(pathToSafe, code);
		return null;
	}
	
	private void writeToFile(String path, String code){
		PrintWriter pntr;
		try {
			pntr = new PrintWriter(path, "UTF-8");
			pntr.println(code);
			pntr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
