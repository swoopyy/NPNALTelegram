package npnets.simulator.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
 



import npnets.simulator.commands.ArcCreateCommand;
import npnets.simulator.commands.ArcPTCreateCommand;
import npnets.simulator.commands.ArcTPCreateCommand;
import npnets.simulator.factory.ArcFactory;
import npnets.simulator.factory.ArcPTFactory;
import npnets.simulator.factory.ArcTPFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;


 
public class NodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
 
	@Override protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		ArcCreateCommand result;// = (ArcCreateCommand) request.getStartCommand();
		if (getHost().getModel().getClass() != ((ArcCreateCommand)request.getStartCommand()).getSource().getClass()) {
		    if (request.getStartCommand() instanceof ArcPTCreateCommand)  {
		    	result = (ArcPTCreateCommand) request.getStartCommand();
		    	((ArcPTCreateCommand) result).setTarget((NPNSymbolTransitionSN)getHost().getModel());
		    } else {
		    	result = (ArcTPCreateCommand) request.getStartCommand();
		    	((ArcTPCreateCommand) result).setTarget((NPNSymbolPlaceSN)getHost().getModel());
		    }
		} else {
			result = null;
		}
	    return result;
	  }
	 
	  @Override protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
	    ArcCreateCommand result;// = new ArcCreateCommand();
	    ArcFactory factory; //my
	    if (getHost().getModel() instanceof NPNSymbolPlaceSN) {
	    	factory = new ArcPTFactory();
	    	request.setFactory(factory);
	    	result = new ArcPTCreateCommand();
	    	((ArcPTCreateCommand) result).setSource((NPNSymbolPlaceSN)getHost().getModel());
	    } else {
	    	factory = new ArcTPFactory();
	    	request.setFactory(factory);
	    	result = new ArcTPCreateCommand();
	    	((ArcTPCreateCommand) result).setSource((NPNSymbolTransitionSN)getHost().getModel());
	    }
	    
	    NPNSymbolArcSN arc = (NPNSymbolArcSN)factory.getNewObject();
	    result.setArc(arc);
	    result.setNet(((NPNSymbolNodeSN)getHost().getModel()).getDiagram());
	    request.setStartCommand(result);
	    return result;
	  }
	 
	  @Override protected Command getReconnectTargetCommand(ReconnectRequest request) {
	    return null;
	  }
	 
	  @Override protected Command getReconnectSourceCommand(ReconnectRequest request) {
	    return null;
	  }
}