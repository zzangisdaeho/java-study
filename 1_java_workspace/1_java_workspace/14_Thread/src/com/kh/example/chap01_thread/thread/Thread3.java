package com.kh.example.chap01_thread.thread;

public class Thread3 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + " ON...");
			// getName() : ������ �̸� ��ȯ
			
			try {
				Thread.sleep(500);
				// sleep() : (millis ��ŭ) �����带 ���ߴ�(������Ű��) �޼ҵ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
