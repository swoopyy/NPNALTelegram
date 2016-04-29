package npnets.simulator.handlers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import npnets.simulator.simulate.Simulator;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionWithALCodeImpl;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTransitionSNImpl;

public class NPNGraphicalSimulatorCMLoadALCodeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		FileDialog id = new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.OPEN);
		id.setFilterNames(new String[] { "AL Files" });
		id.setFilterExtensions(new String[] { "*.al" });
		String path = id.open();
		if (path != null) {
			String alCode = readFile(path);
			try {
				proceedCode(alCode);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Simulator.changed = true;
		}
		return null;
	}

	private void proceedCode(String code) throws JSONException {
		
		JSONTokener tok = new JSONTokener(code);
		JSONObject obj = new JSONObject(tok);

		// SPnet
		JSONObject spNet = (JSONObject) obj.get("SPnet");
		for (NPNSymbolNodeSN nd : Simulator.net.getDiagramNetSystem().getNodes()) {
			if (spNet.has(nd.getModel().getUuid()) && nd instanceof NPNSymbolTransitionSNImpl) {
				String trCode = spNet.getString(nd.getModel().getUuid());
				TransitionWithALCode alTrans = reset((Transition)nd.getModel(), (NPNSymbolTransitionSN)nd);
				alTrans.setCode(trCode);
			}
			
		}

		// EPNet
		JSONObject epNets = (JSONObject) obj.get("EPnets");
		for (TokenTypeElementNet nt : Simulator.net.getNet().getTypeElementNet()) {
			if (epNets.has(nt.getUuid())) {
				
				JSONObject currNet = epNets.getJSONObject(nt.getUuid());
				
				for (NPNSymbolNodeSN nd: nt.getDiagram().getNodes()) {
					
					if (currNet.has(nd.getModel().getUuid()) && nd instanceof NPNSymbolTransitionSNImpl) {
						String trCode = currNet.getString(nd.getModel().getUuid());
						TransitionWithALCode alTrans = reset((Transition)nd.getModel(), (NPNSymbolTransitionSN)nd);
						alTrans.setCode(trCode);
					}
					
				}
			}

		}
	}

	private void resolveArcs(Transition oldTr, TransitionWithALCode newTr) {
		for (int i = 0; i < oldTr.getInArcs().size(); i++) {
			oldTr.getInArcs().get(i).setTarget(newTr);
		}
		for (int i = 0; i < oldTr.getOutArcs().size(); i++) {
			oldTr.getOutArcs().get(i).setSource(newTr);
		}

	}

	protected TransitionWithALCode reset(Transition input, NPNSymbolTransitionSN symbol) {
		TransitionWithALCode ts = new TransitionWithALCodeImpl();
		ts.setUuid(input.getUuid());
		ts.setName(input.getName());
		ts.setComment(input.getComment());
		ts.setNet(input.getNet());
		ts.setFirstTimeConstraint(input.getFirstTimeConstraint());
		ts.setSecondTimeConstraint(input.getSecondTimeConstraint());
		symbol.setModel(ts);
		resolveArcs(input, ts);
		input.getNet().getNodes().remove(input);
		input.setNet(null);
		return ts;
	}

	private String readFile(String path) {
		String code = null;
		File file = new File(path);
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			code = new String(chars);
			reader.close();
			return code;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
