package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);
	
	public void rps() {
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		int dualNum = 0;
		int userWinNum = 0;
		int userLoseNum = 0;
		int userDrawNum = 0;
		
		while (true) {
			double ran = (Math.random()*10);
			System.out.println(ran);
			
			String comChoice = null;
			if (ran<=3.3333333333) {
				comChoice = "����";
			}
			else if (ran <= 6.6666666666) {
				comChoice = "����";
			}
			else {
				comChoice = "��";
			}
			
			System.out.print("����, ����, ��??? : ");
			String userChoice = sc.nextLine();
			
			if (userChoice.equals("����") || userChoice.equals("����") || userChoice.equals("��")) {
			}
			else if (userChoice.equals("exit")) {
				System.out.printf("%d�� %d�� %d�� %d��"
						, dualNum, userWinNum, userDrawNum, userLoseNum);
				break;
			}
			else {
				System.out.println("����, ����, �� �߿� �Է��϶�°� �׷��Գ� �������");
				continue;
			}
//			if (userChoice.equals("exit")) {
//				System.out.printf("%d�� %d�� %d�� %d��"
//						, dualNum, userWinNum, userDrawNum, userLoseNum);
//				break;
//			}
//			else if (!userChoice.equals("����") && !userChoice.equals("����") && !userChoice.equals("��")) {
//				System.out.println("����, ����, �� �߿� �Է��϶�°� �׷��Գ� �������");
//				continue;
//			}
			
			
			System.out.println("��ǻ�� : " + comChoice);
			System.out.println(name + " : " + userChoice);
			
			if (userChoice.equals("����") && comChoice.equals("����")) {
				System.out.println("�����ϴ� �Ф�");
				dualNum++;
				userLoseNum++;
			}
			else if (userChoice.equals("����") && comChoice.equals("��")) {
				System.out.println("�̰���ϴ�!");
				dualNum++;
				userWinNum++;
			}
			else if (userChoice.equals("����") && comChoice.equals("����")) {
				System.out.println("�̰���ϴ�!");
				dualNum++;
				userWinNum++;
			}
			else if (userChoice.equals("����") && comChoice.equals("��")) {
				System.out.println("�����ϴ� �Ф�");
				dualNum++;
				userLoseNum++;
			}
			else if (userChoice.equals("��") && comChoice.equals("����")) {
				System.out.println("�����ϴ� �Ф�");
				dualNum++;
				userLoseNum++;
			}
			else if (userChoice.equals("��") && comChoice.equals("����")) {
				System.out.println("�̰���ϴ�!");
				dualNum++;
				userWinNum++;
			}
			else {
				System.out.println("�����ϴ�.");
				dualNum++;
				userDrawNum++;
			}
		}
	}
}
