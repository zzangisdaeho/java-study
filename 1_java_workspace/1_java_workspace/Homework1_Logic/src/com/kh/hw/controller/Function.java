package com.kh.hw.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	
	public void calculator() {
		System.out.print("ù ��° ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("������  (+, -, x, /) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if (op == '+' || op == '-' || op == 'x' || op == 'X' || op == '/') {
			switch (op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case 'x' : result = num1 * num2; break;
			case 'X' : result = num1 * num2; break;
			case '/' : 
				if (num2 ==0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					result = 0;
				}
				else {
					result = num1 / num2;
				}
				 break;
			}
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		}
		
	}
	public void totalCalculator() {
		System.out.print("ù ��° ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		if (num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.printf("%d���� %d���� �������� �� : %d", min, max, sum);
	}
	public void printProfile() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		String age = sc.nextLine();
		System.out.print("���� : ");
		String sex = sc.nextLine();
		System.out.print("���� : ");
		String character = sc.nextLine();
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+sex);
		System.out.println("���� : "+character);
	}
	public void printScore() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г� : ");
		int classLev = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� : ");
		int whClass = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� : ");
		int classNum = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� (M/F) : ");
		char sex = sc.nextLine().charAt(0);
		if (sex == 'M' || sex == 'm') {
			sex = '��';
		}
		else if (sex == 'F' || sex == 'f') {
			sex = '��';
		}
		
		System.out.print("���� : ");
		double score = Double.parseDouble(sc.nextLine());
		char grade = ' ';
		if (score >= 90) { grade = 'A';}
		else if (score >= 80){ grade = 'B';}
		else if (score >= 70){ grade = 'C';}
		else if (score >= 60){ grade = 'D';}
		else { grade = 'F';}
		
		
		
		System.out.printf("%d�г� %d�� %d�� %c�л� %s�� ������ %.2f�̰� %c�����Դϴ�. "
				,classLev,whClass,classNum,sex,name,score,grade);
	}
	public void printStarNumber() {
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<= 0) {
			System.out.println("����� �ƴմϴ�.");
			return;
		}
		
		for (int i =1; i <= num; i++) {
			for (int l = 1; l <= i ; l++) {
				if (l==i) {
					System.out.print(l);
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	public void sumRandom() {
		int ran = (int)(Math.random()*100 + 1);
		int sum = 0;
		
		for (int i = 1; i <= ran; i++) {
			sum+=i;
		}
		System.out.printf("1���� %d ������ �� : %d", ran, sum);
	}
	public void exceptGugu() {
		System.out.print("���� : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= 9 ; i++) {
			if (i%dan == 0) {
				continue;
			}
			else {
				System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			}
		}
	}
	public void diceGame() {
		while (true) {
			System.out.print("�ֻ��� �� ���� ���� ���纸���� (1~12�Է�) : ");
			int select = Integer.parseInt(sc.nextLine());
			
			int ran = (int)(Math.random()*10 + 2);
			System.out.println("�ֻ����� �� : "+ran);
			
			
			if (select == ran) {
				System.out.println("�����Դϴ�.");
				System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
				char choice = sc.nextLine().charAt(0);
				
				if (choice == 'Y' || choice == 'y') {
					continue;
				}
				else if (choice == 'N' || choice =='n'){
					break;
				}
			}
			else { 
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}
}
