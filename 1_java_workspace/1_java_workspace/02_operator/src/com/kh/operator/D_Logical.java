package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	public void method1() {
		//입력한 정수 값이 1~100 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수 값이 1~100 사이의 숫자입니까? " + ((num>=1 && num<=100)? "맞다": "아니다"));
		
	}
	
	public void method2() {
		//입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		//String A =sc.nextLine();
		//char B = B.charAt(0);
		
		System.out.println("영어 대문자가 맞심? " + (ch>='A'&&ch<='Z'));
		System.out.println("계속 하려면 Y or y 를 입력해 : ");
		char ch2 = sc.nextLine().charAt(0);
		System.out.println("계속 하겠다고 하셨습니까? " + (ch2 == 'Y' || ch2 == 'y'));
	}
}
