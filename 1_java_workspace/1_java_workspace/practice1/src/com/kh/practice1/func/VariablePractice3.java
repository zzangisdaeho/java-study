package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void pt3() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("가로 : ");
		double width = Double.parseDouble(sc.nextLine());
		
		System.out.print("가로 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		double area = width * height;
		
		double circum = (width + height) * 2;
		
		System.out.println(area);
		System.out.println(circum);
		
	}
}
