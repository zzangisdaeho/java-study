package com.kh.example.chap01_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() 호출됨...");
		
		try {
			method2();
			System.out.println("얘는 실행이 될까?"); // try method2에서 에러가 발생했기 때문에 이후 코딩은 출력되지 않음 실행하고싶으면 finally로 가야함. 
		}
		catch (IOException e) {
//			e.printStackTrace(); // 무슨 에러가 발생했는지 출력하는 역할. 에러코드와 위치 출력
			System.out.println(e.getMessage()); // 에러 메세지만 출력함
		}
		catch (Exception e) { // 각각 if else if문 같은것이라 지역변수로 e를 쓰기 때문에 충돌없음
			System.out.println("Exception 받음");
			return;
		}
		finally {
			System.out.println("예외 발생 여부와 상관 없이 무조건 수행됨...");
			System.out.println("예외 발생 여부와 상관 없이 무조건 수행됨...");
			
		}
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
		
//		throw new NullPointerException(); // Runtime 밑의 unchecked exception. 개발자가 안잡아도 됨.
		
		throw new IOException("강제로 예외를 발생시켰습니다."); // Runtime외의 checked exception. 개발자가 처리해 주어야 함.
	}
}
