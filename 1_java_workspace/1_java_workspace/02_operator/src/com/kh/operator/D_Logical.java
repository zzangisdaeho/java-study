package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	public void method1() {
		//�Է��� ���� ���� 1~100 ������ �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է��� ���� ���� 1~100 ������ �����Դϱ�? " + ((num>=1 && num<=100)? "�´�": "�ƴϴ�"));
		
	}
	
	public void method2() {
		//�Է��� ���� ���� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		//String A =sc.nextLine();
		//char B = B.charAt(0);
		
		System.out.println("���� �빮�ڰ� �½�? " + (ch>='A'&&ch<='Z'));
		System.out.println("��� �Ϸ��� Y or y �� �Է��� : ");
		char ch2 = sc.nextLine().charAt(0);
		System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? " + (ch2 == 'Y' || ch2 == 'y'));
	}
}
