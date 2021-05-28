package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void pt1() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("¹®ÀÚ : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch);
		
	}
}
