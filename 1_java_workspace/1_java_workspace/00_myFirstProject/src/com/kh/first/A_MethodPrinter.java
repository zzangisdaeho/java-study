package com.kh.first;

public class A_MethodPrinter {
	public void methodA() {
		System.out.println("methodA() ȣ���...");
		methodB();
		System.out.println("methodA() ����");
	}
	public void methodB() {
		System.out.println("methodB() ȣ���...");
		methodC();
		System.out.println("methodB() ����");
	}
	public void methodC() {
		System.out.println("methodC() ȣ���...");
		System.out.println("methodC() ����");
	}
}
