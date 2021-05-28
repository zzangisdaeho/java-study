package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.print("정수 1 (1~100사이) : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 2 (1~100사이) : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		
		try {
			boolean result = new NumberController().checkDouble(num1, num2);
//			System.out.printf("%d은(는) %d의 배수인가? ", num1, num2);
//			System.out.println((result == true)? true : false);
			System.out.println(num1 + "은 " + num2 + "의 배수인가? " + result);
		}
		catch (NumRangeException e) {
			e.printStackTrace();
		}
		
		
	}
}
