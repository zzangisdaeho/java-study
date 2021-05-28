package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	Scanner sc = new Scanner(System.in);
//	while (���ǽ�) {
//		���� ����;
//		[������ or �б⹮;]
//	}
//	���ǽ� Ȯ�� -> (���ǽ� true�� ��) ���� ���� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
//	���ǽ� ����� false�� �ɶ����� �ݺ�
	
	public void method1() {
//		1���� 5���� ���
		int i = 1;
		while (i <=5) {
//			System.out.println(i);
//			i++;
			System.out.println(i++);
		}
	}
	public void method2() {
//		5���� 1���� ����ϱ�
		int i = 5;
		while (i>0) {
			System.out.println(i--);
		}
	}
	public void method3() {
//		1���� 10 ������ Ȧ���� ���
		int i = 1;
		while (i<=10) {
			if (i%2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}
	public void method4() {
//		���� �� ���� �Է� �޾� �� ���� ���� ���
		System.out.print("���� 1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� 2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int max;
		int min;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		while (min <= max) {
			System.out.println(min);
			min++;
		}
		
	}
	public void method5() {
//		1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		int random =(int)(Math.random()*10+1);
		System.out.println(random);
		
		int start = 1;
		int result = 0;
		while (start<=random) {
			result += start;
			start++;
		}
		System.out.printf("1���� %d ������ �հ�� %d�̴�.",random,result);
		
	}
	public void method6() {
//		���ڿ��� �Է¹޾� �ε������� ���� ���
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		int strLength = str.length();
		System.out.println(strLength);
		
		int index = 0;
		
		while(index<strLength) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
		
	}
	public void method7() {
//		2�ܺ��� 9�ܱ��� ���
		
		int dan = 2;
		int mul = 1;
		
		while (dan <= 9) {
			System.out.println("============="+dan+"===============");
			mul = 1;
			while (mul <= 9) {
				System.out.printf("%d * %d = %d \n", dan, mul, (dan*mul));
				mul++;
			}
			dan++;
		}
	}
	public void method8() {
		int hour = 0;
		int minute = 0;
		
		while (hour < 24) {
			minute = 0;
			while (minute < 60) {
				System.out.printf("%d�� %d��\n", hour, minute);
				minute++;
			}
			hour++;
		}
	}
	public void method9() {
		int menuNum = 0;
		
		while (menuNum != 9) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10 ���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� ������");
			}
		}
	}
	public void method10() {
		while (true) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10 ���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); return; 
			case 4 : System.out.println("�����ٴϱ�?");
			default : System.out.println("�߸� ������");
			}
		}
	}
}
