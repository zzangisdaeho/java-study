package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	Scanner sc = new Scanner(System.in);
//	if-esle��
//	if(���ǽ�){
//		���� �� ����1;
//	}
//	else{
//		���� �� ����2;
//	}
//	�� �� �� ���� �����ϴ� ���ǹ�
//	���ǽ��� ��� ���� ��(true) �̸� if�� �ȿ� �ִ� ���๮��1 ����
//	���ǽ� ��� ���� ����(false) �̸� else �ȿ� �ִ� ���๮��2 ����
	
	public void method1() {
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num>0) {
			System.out.println("���ڴ� ����Դϴ�.");
			}
		else {
//			num == 0 , num <0
//			System.out.println("���ڴ� ����� �ƴմϴ�.");
			if (num == 0) {
				System.out.println("���ڴ� 0�Դϴ�.");
				}
			else {
				System.out.println("���ڴ� 0�Դϴ�.");
				}
			}
	}
	public void method2() {
		//���ڿ� ���ϱ� : �̸��� �־� �������� Ȯ��
		//String Ŭ������ �ִ� equals() �޼ҵ� �̿��Ͽ� �� ��
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
//		if (name == "�ڽſ�") �� �񱳰� �ȵ�.
		if (!name.equals("�ڽſ�")) {
			System.out.print("������ �ƴմϴ�.");
		}
		else {
			System.out.print("�����Դϴ�.");
		}
		
	}
	
}
