package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	
	public void upDown() {
		int ran = (int)(Math.random()*100 + 1);
		System.out.println(ran);
		
		int count = 0;
		int choice = 0;
		
		while(ran != choice) {
			System.out.print("1~100 ������ ������ ������ ���纸���� : ");
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice < 1 || choice > 100) {
				System.out.println("1~100 ������ ���ڸ� �Է����ּ���");
				continue;
			}
			else{
				if(choice > ran) {
					System.out.println("Down !");
					count++;
					}
				else if (choice < ran) {
					System.out.println("UP !");
					count++;
					}
				else {
					System.out.println("�����Դϴ� !!");
					count++;
					System.out.println(count + "ȸ���� ���߼̽��ϴ�.");
				}
			}
		}
	}
}
