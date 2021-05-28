package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<=0) {
			System.out.println("양수가 아닙니다.");
		}
		else {
			for (int i = 1; i <= num; i++) {
				if (i%2==1) {
					System.out.print("박");
				}
				else {
					System.out.print("수");
				}
			}
		}
	}
	public void practice2() {
		while(true) {
			System.out.print("정수 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			else {
				for (int i = 1; i <= num; i++) {
					if (i%2==1) {
						System.out.print("박");
					}
					else {
						System.out.print("수");
					}
				}
			}
			break;
		}	
	}
	public void practice3() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		int strNum = str.length();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		char match = ' ';
		
		int count = 0;
		
		for (int i = 0; i < strNum; i++) {
			match = str.charAt(i);
			if (match == ch) {
				count++;
			}
		}
		System.out.printf("%s 안에 포함된 %c 개수 : %d", str, ch, count);
	}
	public void practice4() {
		
		while (true) {
			
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			int strNum = str.length();
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			char match = ' ';
			
			int count = 0;
			
			for (int i = 0; i < strNum; i++) {
				match = str.charAt(i);
				if (match == ch) {
					count++;
				}
			}
			System.out.printf("%s 안에 포함된 %c 개수 : %d\n", str, ch, count);
			char moreOp = 'n';
			while (moreOp != 'y') {
				System.out.print("더 하실?? (y/n) : ");
				moreOp = sc.nextLine().charAt(0);
				if (moreOp == 'y' || moreOp == 'Y') {
					moreOp = 'y';
				}
				else if (moreOp == 'n' || moreOp == 'N') {
					return;
				}
				else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}
	}
}
