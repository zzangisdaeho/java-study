package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
//	���׿�����
//	���ǽ� ? (���϶� ���)��1 : (�����϶�)��2;
	public void method1() {
		//�Է��� ������ ������� �ƴ��� �Ǻ�
		//����� ��, �����
		//������ ��, ����� �ƴϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ� : ");
		int num = sc.nextInt();
		
		String result = (num > 0)? "�����" : "����� �ƴϴ�";
		String result2 = (num>0)? "�����" : (num==0)? "0�̴�" : "����� �ƴϴ�";
		
		
		System.out.println("�ش� ���� " + ((num > 0)? "�����" : "����� �ƴϴ�"));
		
		
	}
	public void method2() {
		// �Է��� ������ Ȧ������ ¦������ �Ǵ�
		// Ȧ���̸�, Ȧ���Դϴ�
		// ¦���̸�, ¦���Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String result = (((num%2)==1)? "Ȧ���Դϴ�" : "¦���Դϴ�");
		System.out.print(result);
	}
	
	
}
