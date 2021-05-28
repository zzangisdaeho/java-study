package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start();
		
//		System.out.println("---------- main end!"); // 메인스레드는 여기서 끝나지만 thread1은 독립적으로 여전히 돌고있다.
		
		Thread2 t2 = new Thread2();
//		t2.start();
		// Runnable은 start()가 없기 때문에 스레드 객체로 인터페이스 구현 객체를 전달하여 실행
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		Thread3 thread3 = new Thread3();
		thread3.start();
		
//		thread1.start();
		// 한번 수행한 스레드는 재수행할 수 없음.
		
		// 우선순위 알아보기
		System.out.println("thread1 우선순위 : " + thread1.getPriority());
		System.out.println("thread2 우선순위 : " + thread2.getPriority());
		System.out.println("thread3 우선순위 : " + thread3.getPriority());
		
		// 우선 순위 변경
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(4);
		
		System.out.println("thread1 우선순위 : " + thread1.getPriority());
		System.out.println("thread2 우선순위 : " + thread2.getPriority());
		System.out.println("thread3 우선순위 : " + thread3.getPriority());
		
		try {
			thread1.join(); // 현재 실행 중인 스레드가 thread1 스레드의 작업이 끝날 때까지 기다림. thread1이 끝날때까지 다른 스레드들을 기다리게함.
			thread2.join(); // 현재 실행 중인 스레드가 thread2 스레드의 작업이 끝날 때까지 기다림
			thread3.join(); // 현재 실행 중인 스레드가 thread3 스레드의 작업이 끝날 때까지 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------- main end!");
	}

}
