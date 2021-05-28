package practice.run;

import practice.observers.ObserverImpl;
import practice.observers.ObserverInterface;
import practice.subjects.SubjectImpl;

public class Run {

	public static void main(String[] args) {

		SubjectImpl subject = new SubjectImpl();
		
		ObserverImpl observer1 = new ObserverImpl(1);
		ObserverImpl observer2 = new ObserverImpl(2);
		
		// 옵저버 등록 안함
		subject.setCommand("뻐꾹 0");
		System.out.println("===========================");
		
		// 옵저버 1개 등록
		subject.attach(observer1);
		subject.setCommand("뻐꾹 1");
		System.out.println("===========================");
		
		// 옵저버 2개 등록
		subject.attach(observer2);
		subject.setCommand("뻐꾹 2");
		System.out.println("===========================");
		
		
		// 옵저버 3개 (콜백 포함) 등록
		subject.attach(new ObserverInterface() {
			@Override
			public void update(SubjectImpl sub) {
				System.out.println("콜백옵저버 보고있슴다.");
			}
		});
		subject.setCommand("뻐꾹 3");
		System.out.println("===========================");
		
	}

}
