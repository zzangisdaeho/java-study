package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	public void inputScanner1(){
		//������� ������ �Է¹ް�, �Է¹��� ������ ����ϴ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �־� : ");
		
		String name = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		
		int age = sc.nextInt();
		
		System.out.print("Ű �Է� : ");
		
		double height = sc.nextDouble();
		
		System.out.printf("%s ���� %d ���̸�, Ű�� %fcm�Դϴ�.",name,age,height);
		
	}
	
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է� : ");
		String name = sc.nextLine();
		
		System.out.print("���� �Է� : ");
//		int age = sc.nextInt();
//		
//		System.out.print("�ּ� : ");
//		String address = sc.nextLine();
		
//		int age = sc.nextInt();
//		sc.nextLine(); // buffer�� �����ִ� �ٹٲ� ����
//		
//		System.out.print("�ּ� : ");
//		String address = sc.nextLine();
//		
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�Դϴ�.");
		
	}
	
	
	
}
