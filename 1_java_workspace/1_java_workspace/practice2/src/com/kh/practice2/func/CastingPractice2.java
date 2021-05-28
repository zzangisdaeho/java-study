package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void pt2() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("±¹¾î : ");
		double ko = Double.parseDouble(sc.nextLine());
		
		System.out.print("¿µ¾î : ");
		double eng = Double.parseDouble(sc.nextLine());
		
		System.out.print("¼öÇÐ : ");
		double math = Double.parseDouble(sc.nextLine());
		
		int total = (int)(ko + eng + math);
		int avg = (int)(total / 3);
		
		System.out.println("ÃÑÁ¡ : "+total);
		System.out.println("Æò±Õ : "+avg);
		
		
		
	}
}
