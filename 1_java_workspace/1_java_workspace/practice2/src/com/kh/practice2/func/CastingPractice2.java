package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void pt2() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� : ");
		double ko = Double.parseDouble(sc.nextLine());
		
		System.out.print("���� : ");
		double eng = Double.parseDouble(sc.nextLine());
		
		System.out.print("���� : ");
		double math = Double.parseDouble(sc.nextLine());
		
		int total = (int)(ko + eng + math);
		int avg = (int)(total / 3);
		
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
		
		
		
	}
}
