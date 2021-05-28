import event.MuteEvent;
import event.TurnOffEvent;
import listener.impl.PowerOff;
import listener.impl.ScreenOff;
import listener.impl.SoundOff;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("=========== initializing ==============");
		
		TurnOffEvent turnOffEvent = new TurnOffEvent();
		MuteEvent muteEvent = new MuteEvent();
		
		PowerOff powerOff = new PowerOff();
		ScreenOff screenOff = new ScreenOff();		
		SoundOff soundoff = new SoundOff();		

		System.out.println("=========== event binding ==============");
		soundoff.registerEvent(turnOffEvent);
		screenOff.registerEvent(turnOffEvent);
		powerOff.registerEvent(turnOffEvent);
		
		soundoff.registerEvent(muteEvent);
		
		
		System.out.println("=========== mute ==============");
		muteEvent.execute();
		
		System.out.println("=========== tv start ==============");
		Thread.sleep(3000);
		
		System.out.println("=========== tv end ==============");
		turnOffEvent.execute();
	}
}
