package com.kh.operator;

import java.util.Scanner;

public class C_comparison {
	public void method() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a == b); //false
		boolean result2 = (a <= b); //true
		boolean result3 = (a > b); //false
		
		System.out.println("b�� ¦���ΰ�? : "+(b%2 == 0));
		System.out.println("a�� Ȧ���ΰ�? : "+(a%2 != 0));
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է��� ������ ����ΰ�? " + (num>0));
		System.out.println("�Է��� ������ ����ΰ�? " + !(num<0));
	}
}
