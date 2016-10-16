package npnets.simulator.handlers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;

import npnets.simulator.simulate.Simulator;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

import org.json.JSONException;
import org.json.JSONObject;

public class NPNGraphicalSimulatorCMSaveALCodeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		JSONObject obj = null;
		try {
			obj = createJson();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		FileDialog id = new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.SAVE);
		id.setFilterNames(new String[] { "AL Files" });
		id.setFilterExtensions(new String[] { ".json" });
		String path = id.open();
		if (path != null) {
			writeToFile(obj, path);
			Simulator.changed = true;
		}
		return null;
	}

	private void writeToFile(JSONObject obj, String path) {
		try {
			PrintWriter writer = new PrintWriter(path, "UTF-8");
			obj.write(writer);
			writer.close();
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	
	private JSONObject createJson() throws JSONException {
		JSONObject out = new JSONObject();
		NPnet sNet = Simulator.net.getNet();
		JSONObject spnetTrans = new JSONObject();
		for (Node nd : sNet.getNetSystem().getNodes()) {
			if (nd instanceof TransitionWithALCode) {
				spnetTrans.put(nd.getUuid(), ((TransitionWithALCode) nd).getCode());
			}
		}
		out.put("SPnet", spnetTrans);
		
		JSONObject epnets = new JSONObject();
		for (TokenTypeElementNet nt : Simulator.net.getNet().getTypeElementNet()) {
			JSONObject currNet = new JSONObject();
			for (Node nd : nt.getNet().getNodes()) {
				if (nd instanceof TransitionWithALCode) {
					currNet.put(nd.getUuid(), ((TransitionWithALCode) nd).getCode());
				}
			}
			epnets.put(nt.getUuid(), currNet);
		}
		
		out.put("EPnets", epnets);
		return out;
	}
}
