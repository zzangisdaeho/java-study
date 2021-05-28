package practice.subjects;

import practice.observers.ObserverInterface;

public interface SubjectInterface {
	
	void attach(ObserverInterface o);
	void detach(ObserverInterface o);
	void notifyAllObservers();
}
