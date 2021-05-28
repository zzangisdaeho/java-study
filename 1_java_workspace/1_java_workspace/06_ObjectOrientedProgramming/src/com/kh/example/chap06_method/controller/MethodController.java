package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodController {
	// 매개변수의 유무와 변환 값 유무에 따른 구분
	// 1. 매개변수 없고 변환 값 없는 메소드
	
	public void method1() {
		// 반환 값 X  매개변수 X
		// 메소드 내용 수행 후 아무 값도 반환하지 않고 (리턴 값 없이) 호출한 메소드로 돌아감
		System.out.println("매개변수와 반환 값 둘 다 없는 메소드입니다.");
//		return;  void
		// 모든 메소드에 생략되어 있음 (JVM자동 생성)
		// return문이 숨겨져 있기 때문에 모든 수행이 끝나면 나를 호출한 메소드로 돌아가는 것
	}
	
	// 2. 매개변수가 없고 반환값이 있는 메소드
	public int method2() {
		// 반환값 O, 매개변수 X
		// 반환 값이 있다는 것은 return과 반환 타입에 맞는 값을 꼭 써줘야 하며
		// return이 해당 값을 가지고 나를 호출한 매소드로 돌아감
		// This method must return a result of type int
		
		int i = 10;
		return i;
		
	}
	// 3. 매배견수 있고 반환 값 없는 메소드
	public void method3(int num1, int num2) {
		// 반환값 X, 매개변수 O
		// 호출하는 쪽의 괄호에 인자로 넘긴 값을 받기 위해 선언하는 것이 매개변수
		// 메소드 서언 시 괄호 안에 변수를 선언하며 메소드 내에서 사용 가능 (지역 변수)
		System.out.println("MethodController num1 : " + num1);
		System.out.println("MethodController num2 : " + num2);
		int sum = num1 + num2;
		System.out.println("MethodController sum : " + sum);
	}
	
	// 4. 매개변수 이쏙 반환 값 있는 메소드
	public int method4(int num1, int num2) {
//		int sum = num1 + num2;
//		return sum;
		return num1 + num2;
	}
	
	// 5. 반환 값이 배열인 경우
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		
		for (int i = 0 ; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodController iArr : " + iArr);
		return iArr;
	}
	// 클래스 반환형
	public User method6() {
		// 매개변수 있는 생성자를 이용하여 아이디와 비밀번호, 이름을 초기화 해주세요
		// 아이디 : user01
		// 비밀번호 : pass01
		// 이름 : 박신우
		
		User user = new User("user01", "pass01", "박신우");
		System.out.println("MethodController user : " + user);
		
		return user;
		
		
	}
	
	
	
	
}
