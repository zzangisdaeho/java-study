package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	Scanner sc = new Scanner(System.in);
	// break���� ���� ���� ����� �ݺ����� ����
	
	public void method1(){
		// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� �ݺ� ���α׷�
		// ��, "end"�� �ԷµǸ� �ݺ� ����
		// do-while���� break ���
		do {
			System.out.print("���ڿ��� �Է��ϼ���(end ����) : ");
			String str = sc.nextLine();
			if (str.equals("end")) {
				System.out.println("�����մϴ�");
				break;
			}
			else {
				System.out.println(str + "���� ������ : "+str.length());
			}
		}
		while(true);
	}
	public void method2() {
		//����ڿ��� ������ �Է� �ް� 1���� �Է��� ���������� �� ���
		//for���� break�� ���
		System.out.print("���� �Է��� : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			if (i==num) {
				break;
			}
		}
		System.out.println(sum);
	}
}
