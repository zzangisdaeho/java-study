package listener;

import event.AbstractEvent;

public interface EventListener {

	public void registerEvent(AbstractEvent event);
	
	public void onEvent();
}
