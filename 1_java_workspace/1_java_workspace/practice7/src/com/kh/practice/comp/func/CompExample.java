package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<=0) {
			System.out.println("����� �ƴմϴ�.");
		}
		else {
			for (int i = 1; i <= num; i++) {
				if (i%2==1) {
					System.out.print("��");
				}
				else {
					System.out.print("��");
				}
			}
		}
	}
	public void practice2() {
		while(true) {
			System.out.print("���� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("����� �ƴմϴ�.");
				continue;
			}
			else {
				for (int i = 1; i <= num; i++) {
					if (i%2==1) {
						System.out.print("��");
					}
					else {
						System.out.print("��");
					}
				}
			}
			break;
		}	
	}
	public void practice3() {
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		int strNum = str.length();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		char match = ' ';
		
		int count = 0;
		
		for (int i = 0; i < strNum; i++) {
			match = str.charAt(i);
			if (match == ch) {
				count++;
			}
		}
		System.out.printf("%s �ȿ� ���Ե� %c ���� : %d", str, ch, count);
	}
	public void practice4() {
		
		while (true) {
			
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();
			int strNum = str.length();
			
			System.out.print("���� : ");
			char ch = sc.nextLine().charAt(0);
			char match = ' ';
			
			int count = 0;
			
			for (int i = 0; i < strNum; i++) {
				match = str.charAt(i);
				if (match == ch) {
					count++;
				}
			}
			System.out.printf("%s �ȿ� ���Ե� %c ���� : %d\n", str, ch, count);
			char moreOp = 'n';
			while (moreOp != 'y') {
				System.out.print("�� �Ͻ�?? (y/n) : ");
				moreOp = sc.nextLine().charAt(0);
				if (moreOp == 'y' || moreOp == 'Y') {
					moreOp = 'y';
				}
				else if (moreOp == 'n' || moreOp == 'N') {
					return;
				}
				else {
					System.out.println("�߸��� ����Դϴ�. �ٽ� �Է����ּ���.");
				}
			}
		}
	}
}
