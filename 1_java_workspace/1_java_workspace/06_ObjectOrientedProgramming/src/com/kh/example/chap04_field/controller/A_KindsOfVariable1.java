package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { //  <= Ŭ���� ������ ����
	// Ŭ���� ������ �ۼ��ϴ� ������ �ʵ�� ��
	// �ʵ� == �ɹ����� == �ɹ��ʵ� == ��������
	
	private int globalNum; // �ɹ� �ʵ�
	
	public void method1(int num) { //  <= �޼ҵ� ������ ����
//						------- <= �Ű�����
		// �޼ҵ� ������ �ۼ��ϴ� ������ ����������� ��
		// �޼ҵ� ����� �� ��ȣ �ȿ� �����ϴ� ������ �Ű�������� ��
		// �谳���� ���� ������ ��������
		
		int localNum; // <= ��������
//		System.out.println(localNum);
		// The local variable localNum may not have been initialized
		// ���� ������ ������ �ʱ�ȭ�� ����� ��
		
		System.out.println(num);
		// num�̶�� �ֵ� ���������ӿ��� �ұ��ϰ� �ʱ�ȭ ���������� �ұ��ϰ�
		// �Ű������� ȣ�� �� ���� �ִ� ä�� �Ѿ���� ������ �ʱ�ȭ�� ���� �ʿ� ����!!!
		
		System.out.println(globalNum);
		// ���������� �޼ҵ� �ۿ� Ŭ���� �ȿ� �ֱ� ������ �޼ҵ忡�� ��� ����
	} // <= �޼ҵ� ������ ��
	public void method2() {
		System.out.println(localNum);
		// LocalNum cannot be resolved to a variable
		// ���������� �ش� ����(�� ��)������ ��� ����
		
		System.out.println(globalNum);
		
	}
} //<= Ŭ���� ������ ��
