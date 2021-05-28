package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(�ʱ��; ���ǽ�; ������){
	// 	���� ����;
	// }
	// �ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) ���๮�� ���� -> ������ -> ���ǽ� Ȯ�� -> (�ݺ�)
	// ���ǽ� ����� false�� �� ������ �ݺ�
	// 
	// for�� �ȿ� �ִ� �ʱ��, ���ǽ�, �������� ������ �����ϳ� 
	// �ʱ���� ��������, ������ ��������, ������ �󸶳� �Ǵ����� ���� �� ǥ���ؾ� ��
	// �ᱹ for( ) �ȿ����� ������ ��, ��� �ʿ��� �����
	
	int c = 10;
	
	public void method1() {
		// 1���� 5���� ���
		
		int a = 1;
		for (;a <=5;a++) {
		System.out.println(a+"��° �ݺ��� ����");
		}
		System.out.println(a);
		
		
//		for (int b = 1; b <= 5; b++) {
//			System.out.println(b+"��° �ݺ��� ����");
//		}
		
	}
	
	public void method1_1() {
//		for (int i = 1; i <= 5; i++) { 		1 ~ 5
		for (int i = 0; i < 5; i++) {	  //0 ~ 4
			System.out.println("�� �̸��� �ӸӸ���");
		}
		
	}
	
	public void method2() {
		//0���� -4����
//		for (int i = 0; i>-5; i--) {
//			System.out.println(i);
		
		//5���� 1����
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		
		}
	}
	public void method2_1() {
		for (int i = 8; i>=3; i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
			
		}
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��ϼ���.\n�� ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� : ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("�� ��° ���� : ");
		int end = Integer.parseInt(sc.nextLine());
		
		int max = 0;
		int min = 0;
				
		if (start > end) { //����� ��Ȳ
			max = start;
			min = end;
		}
		else {
			max = end;
			min = start;
		}
		
//		for (;min <= max; min++ ) {
//		System.out.println(min);
//		}
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}
	public void method4_1() {
		// ���� �ϳ��� �Է¹޾� �� ���� 1~9 ������ ���� ���� �� ���� ������ ���
		// ������ ���� ������ "1~9������ ����� �Է��Ͽ��� �մϴ�." ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��� �ּ��� : ");
		int dan  = Integer.parseInt(sc.nextLine());
		
		if (!(dan<1) && !(dan>9)) {
			for (int i =1; i<= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan,i,(dan*i));
			}
		}
		
		else {System.out.println("1~9 ���̷� �Է��� �ּ���");}
	}
	
	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		Math.random();
		// 0 <= Math.random < 1
		// 0 <= Math.random * 10 < 10
		// 0 <= (int)(Math.random * 10) < 10   => 0~9 ������ ����
		// 0 <= (int)(Math.random * 10) + 1 < 10    => 1~10 ������ ����
		
		int random = (int)(Math.random()*10) + 1; // 1~10 ������ ����
		int sum = 0;
		
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1���� %d������ ���� �հ� = %d",random,sum);
		//ex)
		//random = 3
		//1, 2, 3 ==> sum
		//sum = 1+2+3 = 6
		
	}
	public void method6() {
		// ��ø for�� : for�� �ȿ� for�� ��� ����
		// 2�ܺ��� 9�ܱ��� ���
		int dan;
		int	mul;
		
		for (dan = 2 ; dan <= 9; dan++) {
			System.out.println("==============" + dan + "===============");
			for (mul = 1 ; mul <= 9; mul++) {
				System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
			}
		}
		
	}
	public void method7() {
		// �Ƴ��α� �ð�
		int hour;
		int minute;
		
		for (hour = 00; hour <= 23; hour++) {
			for (minute = 00; minute < 60; minute++) {
				System.out.printf("%d�� %d��\n", hour, minute);
			}
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("***** � ����Ҳ�? : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Է��� �� ���� ĭ ���� ����ڿ��� �Է� ����
		// �� ��, �� ���� ĭ ���� ��ġ�ϴ� �ٿ��� �� ��ȣ�� ���� ���� ���
		/*
		 * �� �� : 6
		 * ĭ �� : 6
		 * 1*****
		 * *2****
		 * **3***
		 * ***4**
		 * ****5*
		 * *****6
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int line = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j == i) {
					System.out.print(j);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		int row = Integer.parseInt(sc.nextLine());
		System.out.print("ĭ �� : ");
		int col = Integer.parseInt(sc.nextLine());
		
		for (int r =1; r <= row; r++) {
			for (int c = 1; c <= col; c++) {
				if(r==c) {
					System.out.print(r);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	
//	public void prac1() {
//		int c = 5;
//		System.out.println(c);
//	}
//	public void prac2() {
//		System.out.println(c);
//	}
	
	
	
}
