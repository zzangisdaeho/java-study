package practice.run;

import practice.observers.ObserverImpl;
import practice.observers.ObserverInterface;
import practice.subjects.SubjectImpl;

public class Run {

	public static void main(String[] args) {

		SubjectImpl subject = new SubjectImpl();
		
		ObserverImpl observer1 = new ObserverImpl(1);
		ObserverImpl observer2 = new ObserverImpl(2);
		
		// ������ ��� ����
		subject.setCommand("���� 0");
		System.out.println("===========================");
		
		// ������ 1�� ���
		subject.attach(observer1);
		subject.setCommand("���� 1");
		System.out.println("===========================");
		
		// ������ 2�� ���
		subject.attach(observer2);
		subject.setCommand("���� 2");
		System.out.println("===========================");
		
		
		// ������ 3�� (�ݹ� ����) ���
		subject.attach(new ObserverInterface() {
			@Override
			public void update(SubjectImpl sub) {
				System.out.println("�ݹ������ �����ֽ���.");
			}
		});
		subject.setCommand("���� 3");
		System.out.println("===========================");
		
	}

}
