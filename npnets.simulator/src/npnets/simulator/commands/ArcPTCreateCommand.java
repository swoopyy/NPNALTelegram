package npnets.simulator.commands;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcTPSNImpl;
import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl;
 
public class ArcPTCreateCommand extends ArcCreateCommand {
  @Override public void execute() {
	((NPNSymbolArcPTSNImpl)arc).setSource((NPNSymbolPlaceSN)source);
	((NPNSymbolArcPTSNImpl)arc).setTarget((NPNSymbolTransitionSN)target);
    ((ArcPT)arc.getModel()).setSource((Place)source.getModel());
    ((ArcPT)arc.getModel()).setTarget((Transition)target.getModel());
    
    net.getModel().getArcs().add(arc.getModel());
    net.getArcs().add(arc);
    arc.setDiagram(net);
    arc.getModel().setNet(net.getModel());
  }
 
  @Override public void undo() {
	((Place)((NPNSymbolArcPTSNImpl)arc).getSource().getModel()).getOutArcs().remove(arc.getModel());
	((ArcPT)arc.getModel()).setSource(null);
	((NPNSymbolArcPTSNImpl)arc).getSource().getOutArcs().remove(arc);
	((NPNSymbolArcPTSNImpl)arc).setSource(null);
    
    ((Transition)((NPNSymbolArcPTSNImpl)arc).getTarget().getModel()).getInArcs().remove(arc.getModel());
	((ArcPT)arc.getModel()).setTarget(null);
	((NPNSymbolArcPTSNImpl)arc).getTarget().getInArcs().remove(arc);
	((NPNSymbolArcPTSNImpl)arc).setTarget(null);
    
	((NPNSymbolArcPTSNImpl)arc).getModel().setNet(null);
	((NPNSymbolArcPTSNImpl)arc).setDiagram(null);
  }
 
  public void setTarget(NPNSymbolTransitionSN target) {
	  this.target = target;
  }
   
  public void setSource(NPNSymbolPlaceSN source) {
    this.source = source;
  }
}
