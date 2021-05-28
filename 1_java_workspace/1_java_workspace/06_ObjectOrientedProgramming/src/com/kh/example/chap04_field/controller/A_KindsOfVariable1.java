package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { //  <= 클래스 영역의 시작
	// 클래스 영역에 작성하는 변수를 필드라 함
	// 필드 == 맴버변수 == 맴버필드 == 전역변수
	
	private int globalNum; // 맴버 필드
	
	public void method1(int num) { //  <= 메소드 영역의 시작
//						------- <= 매개변수
		// 메소드 영역에 작성하는 변수를 지역변수라고 함
		// 메소드 선언부 중 괄호 안에 선언하는 변수를 매개변수라고 함
		// 배개변수 역시 일종의 지역변수
		
		int localNum; // <= 지역변수
//		System.out.println(localNum);
		// The local variable localNum may not have been initialized
		// 지역 변수는 무조건 초기화를 해줘야 함
		
		System.out.println(num);
		// num이라는 애도 지역변수임에도 불구하고 초기화 안했음에도 불구하고
		// 매개변수는 호출 시 값이 있는 채로 넘어오기 때문에 초기화가 따로 필요 없음!!!
		
		System.out.println(globalNum);
		// 전역변수는 메소드 밖에 클래스 안에 있기 때문에 메소드에서 사용 가능
	} // <= 메소드 영역의 끝
	public void method2() {
		System.out.println(localNum);
		// LocalNum cannot be resolved to a variable
		// 지역변수는 해당 지역(블럭 내)에서만 사용 가능
		
		System.out.println(globalNum);
		
	}
} //<= 클래스 영역의 끝
