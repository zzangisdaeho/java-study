package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	
	public static int staticNum;
	
	//�������� == �ɹ����� == �ɹ��ʵ� == �ʵ� == �ν��Ͻ� ����(�ν��Ͻ��� ���ܾ߸� �� �� �ִ� ����)
	private int testNum = 10;
//	testNum = testNum + 10;
	
	public void method() {
		System.out.println(testNum);
	}
	//static�� Ŭ���� ���� (Ŭ������ �����ص� ��� �������)
	private static int staticTestNum = 10; //10 �Ⱦ��� �˾Ƽ� 0���� �ʱ�ȭ (int�ϱ�)
	
	
	public B_KindsOfVariable2() {
//		testNum ++;
//		System.out.println("testNum : " + testNum);
		staticTestNum ++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
	
}
