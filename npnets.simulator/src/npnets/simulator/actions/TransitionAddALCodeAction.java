package npnets.simulator.actions;

import java.util.List;

import npnets.simulator.parts.TransitionEditPart;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

public class TransitionAddALCodeAction extends SelectionAction {
	public static final String ADD_CODE= "Add AL code";
  public static final String REQ_ADD_CODE = "Add AL code";
  
	Request request;
  
  public TransitionAddALCodeAction(IWorkbenchPart part) {
      super(part);
      setId(ADD_CODE);
      setText("Add AL code");
      request = new Request(REQ_ADD_CODE);
  }
  
  @Override
  public void run() {
      @SuppressWarnings("unchecked") List<TransitionEditPart> editParts = getSelectedObjects();
      CompoundCommand compoundCommand = new CompoundCommand();
      for(TransitionEditPart placeEditPart : editParts) {
          compoundCommand.add(placeEditPart.getCommand(request));
      }
      execute(compoundCommand);
  }
  
  @Override
  protected boolean calculateEnabled() {
      if(getSelectedObjects().isEmpty()) {
          return false;
      }
      for(Object selectedObject : getSelectedObjects()) {
          if(!(selectedObject instanceof TransitionEditPart)) {
              return false;
          }
      }
      return true;
  }

}
