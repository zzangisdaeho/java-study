package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
//	�ܵ� if��
//	if(���ǹ�){
//		������ ����;
//	}
//	���ǽ��� ��� ���� ��(true)�̸� { }�ȿ� �ִ� �ڵ� ����
//	���ǽ��� ��� ���� ����(false)�̸� { }�ȿ� �ִ� �ڵ�� �����ϰ� �Ѿ
	Scanner sc = new Scanner(System.in);
	
	public void method1() {	//������ �ǽ����� 1, 2
		 
		 System.out.print("���� �� ���� �Է��ϼ��� : ");
		 int num = Integer.parseInt(sc.nextLine());
		 
//		 String result = (num>0)? "�����" : "����� �ƴϴ�";
		 
		 if (num>0) {
			 System.out.println("�����");
		 }
		 if (num == 0) {
			 System.out.println("0�̴�");
		 }
		 if (num<0) {
			 System.out.println("������");
		 }
		 System.out.println("������ �����մϴ�");
	}
	public void method2() {
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num % 2 == 0) {
			 System.out.println("¦���Դϴ�.");
		}
		else {
			//if (num % 2 == 1)
			//if (num % 2 != 0)
			//if (!(num % 2 == 0)
		 System.out.println("Ȧ���Դϴ�.");
		}
	}
	public void method3() {
		System.out.print("������ �Է��Ͻÿ� (M/F) : "); 
		char gender = sc.nextLine().charAt(0);
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("�����Դϴ�");
		}
		if (gender == 'F' || gender == 'f'){
			System.out.println("�����Դϴ�");
		}
		if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("M/F�� �Է����ּ���");
		}
	}
}
