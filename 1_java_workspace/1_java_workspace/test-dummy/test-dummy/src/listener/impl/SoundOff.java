package listener.impl;

import event.AbstractEvent;
import listener.EventListener;

public class SoundOff implements EventListener {

	@Override
	public void onEvent() {
		System.out.println("sound Off");
	}

	@Override
	public void registerEvent(AbstractEvent event) {
		event.addReaction(this);
	}

}
