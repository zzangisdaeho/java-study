package com.kh.example.chap01_thread.thread;

// ������ ���� : Thread class ��� �ޱ�
public class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + " ON...");
			// getName() : ������ �̸� ��ȯ
			
			try {
				Thread.sleep(1500);
				// sleep() : (millis ��ŭ) �����带 ���ߴ�(������Ű��) �޼ҵ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
