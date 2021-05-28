package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.print("���� 1 (1~100����) : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� 2 (1~100����) : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		
		try {
			boolean result = new NumberController().checkDouble(num1, num2);
//			System.out.printf("%d��(��) %d�� ����ΰ�? ", num1, num2);
//			System.out.println((result == true)? true : false);
			System.out.println(num1 + "�� " + num2 + "�� ����ΰ�? " + result);
		}
		catch (NumRangeException e) {
			e.printStackTrace();
		}
		
		
	}
}
