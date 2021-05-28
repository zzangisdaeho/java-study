package com.kh.example.chap01_thread.thread;

public class Thread3 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + " ON...");
			// getName() : 쓰레드 이름 반환
			
			try {
				Thread.sleep(500);
				// sleep() : (millis 만큼) 스레드를 멈추는(지연시키는) 메소드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
