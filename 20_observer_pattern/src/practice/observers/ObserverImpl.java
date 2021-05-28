package practice.observers;

import practice.subjects.SubjectImpl;

public class ObserverImpl implements ObserverInterface {

	private String echo;
	private int number;

	public ObserverImpl(int number) {
		this.number = number;
	}

	@Override
	public void update(SubjectImpl sub) {
		this.echo = sub.getCommand();
		System.out.println(number +"¹øÂ° observer ack : " + echo);
	}

}
