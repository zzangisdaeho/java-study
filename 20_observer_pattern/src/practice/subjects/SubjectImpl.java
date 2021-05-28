package practice.subjects;

import java.util.ArrayList;
import java.util.List;

import practice.observers.ObserverInterface;

public class SubjectImpl implements SubjectInterface {
	
	private String command;
	private List<ObserverInterface> observers = new ArrayList<ObserverInterface>();

	@Override
	public void attach(ObserverInterface o) {
		observers.add(o);
	}

	@Override
	public void detach(ObserverInterface o) {
		observers.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		observers.forEach((e) -> e.update(this));
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
		notifyAllObservers();
	}
	
}
