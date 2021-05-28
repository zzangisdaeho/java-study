package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	
	public static int staticNum;
	
	//전역변수 == 맴버변수 == 맴버필드 == 필드 == 인스턴스 변수(인스턴스가 생겨야만 쓸 수 있는 변수)
	private int testNum = 10;
//	testNum = testNum + 10;
	
	public void method() {
		System.out.println(testNum);
	}
	//static은 클래스 변수 (클래스만 생성해도 사용 가능허다)
	private static int staticTestNum = 10; //10 안쓰면 알아서 0으로 초기화 (int니까)
	
	
	public B_KindsOfVariable2() {
//		testNum ++;
//		System.out.println("testNum : " + testNum);
		staticTestNum ++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
	
}
