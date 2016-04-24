package npnets.simulator.commands;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import npnets.simulator.simulate.Simulator;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
//import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionWithALCodeImpl;

public class TransitionAddALCodeCommand extends Command {
	private Transition transition;
	private TransitionWithALCode tr;
	private NPNSymbolTransitionSN symbol;
	Object model;

	@Override
	public void execute() {

		Node node = null;
		ArcTP arc = null;
		FileDialog id = new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		String path = id.open();
		if (path!=null) {
			String code = readFile(path);
			System.out.println("code = " + code);
			tr = reset(transition);
			tr.setCode(code);
			transition = tr;
			Simulator.changed = true;
		}
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

	public void setTransition(NPNSymbolTransitionSN transition) {
		symbol = transition;
		this.transition = (Transition) transition.getModel();
	}
	
	private void resolveArcs(Transition tr) {
		for(int i=0;i<transition.getInArcs().size();i++){
			transition.getInArcs().get(i).setTarget(tr);
		}
		for(int i=0;i<transition.getOutArcs().size();i++){
			transition.getOutArcs().get(i).setSource(tr);
		}
		
	}
	
	 protected TransitionWithALCode reset(Transition input) {
		  TransitionWithALCode ts = new TransitionWithALCodeImpl();
		  ts.setUuid(input.getUuid());
		  ts.setName(input.getName());
		  ts.setComment(input.getComment());
		  ts.setNet(input.getNet());
		  ts.setFirstTimeConstraint(input.getFirstTimeConstraint());
		  ts.setSecondTimeConstraint(input.getSecondTimeConstraint());
		  resolveArcs(ts);
		  symbol.setModel(ts);
		  transition.getNet().getNodes().remove(transition);
		  transition.setNet(null);
		  return ts;
	  }
}
