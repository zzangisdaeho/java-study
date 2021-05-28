package listener.impl;

import event.AbstractEvent;
import event.TurnOffEvent;
import listener.EventListener;

public class ScreenOff implements EventListener {

	@Override
	public void onEvent() {
		System.out.println("screen Off");
		
	}

	@Override
	public void registerEvent(AbstractEvent event) {
		event.addReaction(this);
	}

}