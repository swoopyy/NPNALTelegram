package npnets.simulator.handlers;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import npnets.simulator.exceptions.DeadlineViolationException;
import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.simulate.MarkingAdapter;
import npnets.simulator.simulate.Report;
import npnets.simulator.simulate.Simulator;
import npnets.simulator.simulate.TimeBound;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;

public class NPNGraphicalSimulatorCMSimulateHandler extends AbstractHandler implements IHandler {
	Simulator sim = new Simulator();
	double steps;
	private Map<Transition, Long> timeMap=new HashMap<Transition, Long>();
	private Map<Transition, TimeBound> timeBounds=new HashMap<Transition, TimeBound>(); 
	Date cancelDate=null;
	boolean dirty=true;
	long elapsedTime=0;
	long prevTime=0;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("ХУУУЙ");
		sim.userBindings=false;
		Simulator.userDriven=false;
		prevTime=0;
		dirty=true;
		final Timer timer=new Timer();
		TimerTask timerTask=new TimerTask() {
			
			@Override
			public void run() {
				prevTime=prevTime==0?scheduledExecutionTime():prevTime;
				final long delta=scheduledExecutionTime()-prevTime;
				Date dt=new Date(scheduledExecutionTime());
				final Report report=new Report();
				report.appendLineToReport("Scheduled operation was made at time: " + (delta/1000)+":"+delta%1000 );
          Display.getDefault().asyncExec(new Runnable() {
            public void run() {
  						try {
					if(dirty){
						List<Transition> candidates=sim.getEnabledTransitions(true);
						report.appendLineToReport("Transitions was tooked in count:" +candidates.size() );
						fillTimeBounds(candidates, elapsedTime );
						assignTimes(candidates);
						dirty=false;
					}
					Transition trans=checkForExec(delta);
					if(trans!=null)
					{
						report.appendLineToReport("Transition started: "+ trans.getName() + "at time: "+timeMap.get(trans));
						MarkingAdapter ma=sim.makeTransitions(trans);
						sim.setMarking(ma);
						elapsedTime=delta-elapsedTime;
						dirty=true;
					}
					report.putToLog();
            }
				 catch (DeadlineViolationException e) {
					e.printStackTrace();
				} catch (NoBindingAvaliableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
          });
				if(dt.compareTo(cancelDate)==1)
					timer.cancel();
				report.putToLog();
				
			}

			private Transition checkForExec(long delta) {
				for(Map.Entry<Transition, Long> me:timeMap.entrySet())
				{
					if(me.getValue()<=delta)
					{
						return me.getKey();
					}
				}
				return null;
			}
		};
		InputDialog sd = new InputDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Choose time", "The duration of the simulation (in sec): ", "10",
				null);
		if (sd.open() == Window.OK) {
			if (sd.getValue() != null) {
				steps = new Double(sd.getValue());
				cancelDate=new Date((long) (new Date().getTime()+steps*1000));
				//timer.
					try {
						timer.schedule(timerTask, 0, 100);
						//MarkingAdapter ma = sim.makeTransitions(null);
						//sim.setMarking(ma);
					} catch (Exception e) {
						new Report().appendLineToReport("Deadlock appeared on step " + steps);
						e.printStackTrace();
					}
			}
		}
		return null;
	}
	private void assignTimes(List<Transition> transitions){
		timeMap.clear();
		for(Transition tr:transitions)
		{
			if(!timeMap.containsKey(tr)){
				timeMap.put(tr, calculateTime(timeBounds.get(tr)));
				if(tr instanceof TransitionSynchronized && ((TransitionSynchronized) tr).getSynchronization()!=null)
				{
					TransitionSynchronized trs=(TransitionSynchronized) tr;
					for(TransitionSynchronized trsync:trs.getSynchronization().getInvolved())
						if(trs!=trsync)
							timeMap.put(trsync, timeMap.get(tr));
				}
			}
		}
	}
	private Long calculateTime(TimeBound tb) {
		return (long) (new Random().nextInt((int) ((tb.getUpper()-tb.getLower())+1))+tb.getLower());
	}
	private void fillTimeBounds(List<Transition> transitions,double elapsedTime){
		Map<Transition, TimeBound> tempMap=new HashMap<Transition, TimeBound>();
		tempMap.putAll(timeBounds);
		timeBounds.clear();
		for(Transition tr:transitions)
		{
			if(tempMap.containsKey(tr)){
				TimeBound tb=tempMap.get(tr);
				tb.setLower((tb.getLower()-elapsedTime));
				if(tb.getLower()<0)
					tb.setLower(0);
				tb.setLower((tb.getLower()-elapsedTime));
				timeBounds.put(tr, tb);
			}
			else
				timeBounds.put(tr, new TimeBound(tr.getFirstTimeConstraint()*1000, tr.getSecondTimeConstraint()*1000));			
		}
		tempMap.clear();
	}

}
