package event;

import java.util.ArrayList;
import java.util.List;

import listener.EventListener;

public abstract class AbstractEvent {

	List<EventListener> eventTasks;
	
	public AbstractEvent() {
		eventTasks = new ArrayList<EventListener>();
	}
	
	public void addReaction(EventListener eventTask) {
		
		eventTasks.add(eventTask);
	}
	
	public void execute() {
		
		for (EventListener listener : eventTasks) {
			listener.onEvent();
		}
	}

}
