package practice.observers;

import practice.subjects.SubjectImpl;

public interface ObserverInterface {
	void update(SubjectImpl sub);
}
