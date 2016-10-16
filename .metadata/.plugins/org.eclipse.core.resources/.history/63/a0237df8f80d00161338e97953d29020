package npnets.simulator.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import npnets.simulator.simulate.Simulator;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionWithALCode;

public class NPNGraphicalSimulatorCMCompileHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		for(TokenTypeElementNet nt: Simulator.net.getNet().getTypeElementNet()){
			System.out.println(nt.toString());
		}
		for(Node nd: Simulator.net.getNet().getNetSystem().getNodes()){
			if(nd instanceof TransitionWithALCode){
				TransitionWithALCode tr = (TransitionWithALCode)nd;
				System.out.println(((TransitionWithALCode)nd).getCode());
			}
		}
		return null;
	}

}
