package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void pt2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("���ϱ� ��� : " +(num1 + num2));
		
		System.out.println("���� ��� : " + (num1 - num2));
		
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		
		System.out.println("������ �� ��� : " + (num1 / num2));
		
		
	}
}
