package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
//		if - esle if��
//		if (���ǽ�1) {
//			������ ����1;
//		}
//		else if (���ǽ�2) {
//			������ ����2;
//		}
//		else {
//			������ ����3;
//		}
//		���� ������ �� �� �ִ� ���ǹ�
//		if���� ���ǽ�(���ǽ�1)�� ��� ���� ��(true)�̸� if�� �ȿ� �ִ� ���๮�� 1 ����
//		if���� ���ǽ�(���ǽ�1)�� ����(false)�̸鼭 else if ���� ���ǽ�(���ǽ�2)�� ��(true)�̸�
//		else if �ȿ� �ִ� ���๮�� 2 ����
//		�� �� ����(false)�̶�� ���๮�� 3 ����
//		==> if������ true��� ������ �Ǿ����� �� �Ʒ� ������� ������� ����
//			else if���� ���� �� �� �� �ְ� else���� ���� ���� ����
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num>0) {
			 System.out.println("����Դϴ�");
		}
		else if (num == 0){
			 System.out.println("0�̴�");
		}
//		else if (num < 0) {
		else {
			 System.out.println("�����Դϴ�");
		}
				
	}
	public void method2() {
		System.out.print("������ �Է��Ͻÿ� (M/F) : "); 
		char gender = sc.nextLine().charAt(0);
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("�����Դϴ�");
		}
		else if (gender == 'F' || gender == 'f') {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("M/F�� �Է����ּ���");
		}
	}
	public void method3() {
		//������ �ϳ� �Է¹޾� ����� ������ ������ ��� ���
		//90�� �̻��� A���
		//90�� �̸� 80�� �̻��� B���
		//80�� �̸� 70�� �̻��� C���
		//70�� �̸� 60�� �̻��� D���
		//60�� �̸��� F������� ����
		System.out.print("������ �Է��ϼ��� : ");
		int score = Integer.parseInt(sc.nextLine());
		char grade; //����� ���� grade���� �ʱ�ȭ
		
		if (score>=90) {
			grade = 'A';
		}
		else if (score>=80) {
			grade = 'B';
		}
		else if (score>=70) {
			grade = 'C';
		}
		else if (score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.printf("���� : %d, ��� : %c �Դϴ�", score, grade);
		
	}
}
