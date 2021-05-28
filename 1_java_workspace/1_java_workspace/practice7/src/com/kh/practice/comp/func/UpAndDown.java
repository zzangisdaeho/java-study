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
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice < 1 || choice > 100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요");
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
					System.out.println("정답입니다 !!");
					count++;
					System.out.println(count + "회만에 맞추셨습니다.");
				}
			}
		}
	}
}
