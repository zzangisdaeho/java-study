package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
//	삼항연산자
//	조건식 ? (참일때 사용)식1 : (거짓일때)식2;
	public void method1() {
		//입력한 정수가 양수인지 아닌지 판별
		//양수일 때, 양수다
		//음수일 때, 양수가 아니다
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하셍 : ");
		int num = sc.nextInt();
		
		String result = (num > 0)? "양수다" : "양수가 아니다";
		String result2 = (num>0)? "양수다" : (num==0)? "0이다" : "양수가 아니다";
		
		
		System.out.println("해당 수는 " + ((num > 0)? "양수다" : "양수가 아니다"));
		
		
	}
	public void method2() {
		// 입력한 정수가 홀수인지 짝수인지 판단
		// 홀수이면, 홀수입니다
		// 짝수이면, 짝수입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String result = (((num%2)==1)? "홀수입니다" : "짝수입니다");
		System.out.print(result);
	}
	
	
}
