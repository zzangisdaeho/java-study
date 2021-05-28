package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
//		if - esle if문
//		if (조건식1) {
//			실행할 문장1;
//		}
//		else if (조건식2) {
//			실행할 문장2;
//		}
//		else {
//			실행할 문장3;
//		}
//		다중 조건을 줄 수 있는 조건문
//		if문의 조건식(조건식1)의 결과 값이 참(true)이면 if문 안에 있는 실행문장 1 수행
//		if문의 조건식(조건식1)이 거짓(false)이면서 else if 문의 조건식(조건식2)이 참(true)이면
//		else if 안에 있는 실행문장 2 수행
//		둘 다 거짓(false)이라면 실행문장 3 수행
//		==> if문에서 true라고 수행이 되었으면 그 아래 문장들은 수행되지 않음
//			else if문은 여러 개 일 수 있고 else문은 없을 수도 있음
		
		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num>0) {
			 System.out.println("양수입니다");
		}
		else if (num == 0){
			 System.out.println("0이다");
		}
//		else if (num < 0) {
		else {
			 System.out.println("음수입니다");
		}
				
	}
	public void method2() {
		System.out.print("성별을 입력하시오 (M/F) : "); 
		char gender = sc.nextLine().charAt(0);
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("남자입니다");
		}
		else if (gender == 'F' || gender == 'f') {
			System.out.println("여자입니다");
		}
		else {
			System.out.println("M/F로 입력해주세요");
		}
	}
	public void method3() {
		//점수를 하나 입력받아 등급을 나누어 점수와 등급 출력
		//90점 이상은 A등급
		//90점 미만 80점 이상은 B등급
		//80점 미만 70점 이상은 C등급
		//70점 미만 60점 이상은 D등급
		//60점 미만은 F등급으로 나눔
		System.out.print("점수를 입력하세요 : ");
		int score = Integer.parseInt(sc.nextLine());
		char grade; //등급을 넣을 grade변수 초기화
		
		if (score>=90) {
			grade = 'A';
		}
		else if (score>=80) {
			grade = 'B';
		}
		else if (score>=70) {
			grade = 'C';
		}
		else if (score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.printf("점수 : %d, 등급 : %c 입니다", score, grade);
		
	}
}
