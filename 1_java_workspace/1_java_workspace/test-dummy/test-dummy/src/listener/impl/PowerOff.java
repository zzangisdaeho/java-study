package listener.impl;

import event.AbstractEvent;
import event.TurnOffEvent;
import listener.EventListener;

public class PowerOff implements EventListener {

	@Override
	public void onEvent() {
		System.out.println("power Off");
		
	}

	@Override
	public void registerEvent(AbstractEvent event) {
		event.addReaction(this);
	}

}
