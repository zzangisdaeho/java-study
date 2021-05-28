package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void pt4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String letter = sc.nextLine();
		
		char l0 = letter.charAt(0);
		char l1 = letter.charAt(1);
		char l2 = letter.charAt(2);
		
		System.out.println("첫 번째 문자 : "+l0);
		System.out.println("두 번째 문자 : "+l1);
		System.out.println("세 번째 문자 : "+l2);
		
	}
}
