package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start();
		
//		System.out.println("---------- main end!"); // ���ν������ ���⼭ �������� thread1�� ���������� ������ �����ִ�.
		
		Thread2 t2 = new Thread2();
//		t2.start();
		// Runnable�� start()�� ���� ������ ������ ��ü�� �������̽� ���� ��ü�� �����Ͽ� ����
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		Thread3 thread3 = new Thread3();
		thread3.start();
		
//		thread1.start();
		// �ѹ� ������ ������� ������� �� ����.
		
		// �켱���� �˾ƺ���
		System.out.println("thread1 �켱���� : " + thread1.getPriority());
		System.out.println("thread2 �켱���� : " + thread2.getPriority());
		System.out.println("thread3 �켱���� : " + thread3.getPriority());
		
		// �켱 ���� ����
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(4);
		
		System.out.println("thread1 �켱���� : " + thread1.getPriority());
		System.out.println("thread2 �켱���� : " + thread2.getPriority());
		System.out.println("thread3 �켱���� : " + thread3.getPriority());
		
		try {
			thread1.join(); // ���� ���� ���� �����尡 thread1 �������� �۾��� ���� ������ ��ٸ�. thread1�� ���������� �ٸ� ��������� ��ٸ�����.
			thread2.join(); // ���� ���� ���� �����尡 thread2 �������� �۾��� ���� ������ ��ٸ�
			thread3.join(); // ���� ���� ���� �����尡 thread3 �������� �۾��� ���� ������ ��ٸ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---------- main end!");
	}

}
