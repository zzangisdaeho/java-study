package com.kh.operator;

import java.util.Scanner;

public class C_comparison {
	public void method() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a == b); //false
		boolean result2 = (a <= b); //true
		boolean result3 = (a > b); //false
		
		System.out.println("b가 짝수인가? : "+(b%2 == 0));
		System.out.println("a가 홀수인가? : "+(a%2 != 0));
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 양수인가? " + (num>0));
		System.out.println("입력한 정수가 양수인가? " + !(num<0));
	}
}
