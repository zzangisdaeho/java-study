package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodController {
	// �Ű������� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	
	public void method1() {
		// ��ȯ �� X  �Ű����� X
		// �޼ҵ� ���� ���� �� �ƹ� ���� ��ȯ���� �ʰ� (���� �� ����) ȣ���� �޼ҵ�� ���ư�
		System.out.println("�Ű������� ��ȯ �� �� �� ���� �޼ҵ��Դϴ�.");
//		return;  void
		// ��� �޼ҵ忡 �����Ǿ� ���� (JVM�ڵ� ����)
		// return���� ������ �ֱ� ������ ��� ������ ������ ���� ȣ���� �޼ҵ�� ���ư��� ��
	}
	
	// 2. �Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
	public int method2() {
		// ��ȯ�� O, �Ű����� X
		// ��ȯ ���� �ִٴ� ���� return�� ��ȯ Ÿ�Կ� �´� ���� �� ����� �ϸ�
		// return�� �ش� ���� ������ ���� ȣ���� �żҵ�� ���ư�
		// This method must return a result of type int
		
		int i = 10;
		return i;
		
	}
	// 3. �Ź�߼� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// ��ȯ�� X, �Ű����� O
		// ȣ���ϴ� ���� ��ȣ�� ���ڷ� �ѱ� ���� �ޱ� ���� �����ϴ� ���� �Ű�����
		// �޼ҵ� ���� �� ��ȣ �ȿ� ������ �����ϸ� �޼ҵ� ������ ��� ���� (���� ����)
		System.out.println("MethodController num1 : " + num1);
		System.out.println("MethodController num2 : " + num2);
		int sum = num1 + num2;
		System.out.println("MethodController sum : " + sum);
	}
	
	// 4. �Ű����� �̽� ��ȯ �� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
//		int sum = num1 + num2;
//		return sum;
		return num1 + num2;
	}
	
	// 5. ��ȯ ���� �迭�� ���
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		
		for (int i = 0 ; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodController iArr : " + iArr);
		return iArr;
	}
	// Ŭ���� ��ȯ��
	public User method6() {
		// �Ű����� �ִ� �����ڸ� �̿��Ͽ� ���̵�� ��й�ȣ, �̸��� �ʱ�ȭ ���ּ���
		// ���̵� : user01
		// ��й�ȣ : pass01
		// �̸� : �ڽſ�
		
		User user = new User("user01", "pass01", "�ڽſ�");
		System.out.println("MethodController user : " + user);
		
		return user;
		
		
	}
	
	
	
	
}
