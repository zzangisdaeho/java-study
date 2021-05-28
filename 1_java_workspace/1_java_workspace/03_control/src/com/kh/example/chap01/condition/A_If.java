package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
//	단독 if문
//	if(조건문){
//		실행할 문장;
//	}
//	조건식의 결과 값이 참(true)이면 { }안에 있는 코드 실행
//	조건식의 결과 값이 거짓(false)이면 { }안에 있는 코드는 무시하고 넘어감
	Scanner sc = new Scanner(System.in);
	
	public void method1() {	//연산자 실습문제 1, 2
		 
		 System.out.print("숫자 한 개를 입력하세요 : ");
		 int num = Integer.parseInt(sc.nextLine());
		 
//		 String result = (num>0)? "양수다" : "양수가 아니다";
		 
		 if (num>0) {
			 System.out.println("양수다");
		 }
		 if (num == 0) {
			 System.out.println("0이다");
		 }
		 if (num<0) {
			 System.out.println("음수다");
		 }
		 System.out.println("실행을 종료합니다");
	}
	public void method2() {
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num % 2 == 0) {
			 System.out.println("짝수입니다.");
		}
		else {
			//if (num % 2 == 1)
			//if (num % 2 != 0)
			//if (!(num % 2 == 0)
		 System.out.println("홀수입니다.");
		}
	}
	public void method3() {
		System.out.print("성별을 입력하시오 (M/F) : "); 
		char gender = sc.nextLine().charAt(0);
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("남자입니다");
		}
		if (gender == 'F' || gender == 'f'){
			System.out.println("여자입니다");
		}
		if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("M/F로 입력해주세요");
		}
	}
}
