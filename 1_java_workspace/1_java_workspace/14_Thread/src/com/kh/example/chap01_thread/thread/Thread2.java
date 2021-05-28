package com.kh.example.chap01_thread.thread;

// 스레드 생성 : Runnable 인터페이스 구현
public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ON...");
			// Thread.currentThread() : 현재 실행중인 스레드 참조 반환
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
