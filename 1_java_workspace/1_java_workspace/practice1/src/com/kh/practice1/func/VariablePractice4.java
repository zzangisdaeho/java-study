package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void pt4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String letter = sc.nextLine();
		
		char l0 = letter.charAt(0);
		char l1 = letter.charAt(1);
		char l2 = letter.charAt(2);
		
		System.out.println("ù ��° ���� : "+l0);
		System.out.println("�� ��° ���� : "+l1);
		System.out.println("�� ��° ���� : "+l2);
		
	}
}
