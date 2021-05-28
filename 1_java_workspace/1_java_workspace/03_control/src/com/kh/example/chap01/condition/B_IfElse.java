package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	Scanner sc = new Scanner(System.in);
//	if-esle문
//	if(조건식){
//		실행 할 문장1;
//	}
//	else{
//		실행 할 문장2;
//	}
//	둘 중 한 개를 선택하는 조건문
//	조건식의 결과 값이 참(true) 이면 if문 안에 있는 실행문장1 수행
//	조건식 결과 값이 거짓(false) 이면 else 안에 있는 실행문장2 수행
	
	public void method1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num>0) {
			System.out.println("숫자는 양수입니다.");
			}
		else {
//			num == 0 , num <0
//			System.out.println("숫자는 양수가 아닙니다.");
			if (num == 0) {
				System.out.println("숫자는 0입니다.");
				}
			else {
				System.out.println("숫자는 0입니다.");
				}
			}
	}
	public void method2() {
		//문자열 비교하기 : 이름을 넣어 본인인지 확인
		//String 클래스에 있는 equals() 메소드 이용하여 값 비교
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
//		if (name == "박신우") 는 비교가 안됨.
		if (!name.equals("박신우")) {
			System.out.print("본인이 아닙니다.");
		}
		else {
			System.out.print("본인입니다.");
		}
		
	}
	
}
