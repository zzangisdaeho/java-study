package com.kh.example.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	// continue�� : �ݺ��� �������� ����� �� ����
	// continue�� �Ʒ��� ������ �������� �ʰ�
	// ������ �Ǵ� ���� ������ �ǳʶٶ�� �ǹ� == �Ʒ� ����
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// 1~100���� �������� �հ� ���
		// ��, 4�� ����� ���� ���
		
		int num = 100;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if (i%4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void method2() {
		// �������� ����ϵ� ¦�� ��, ¦�� ���� ���� ���
		// ex.
		for (int dan = 2 ; dan < 10 ; dan++) {
			if (dan % 2 == 1) {
				System.out.println("===== "+dan+ " ��=====");
				for (int i = 1; i < 9 ; i++) {
					if(i % 2 == 1) {
						System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
					}
				}
			}
		}
	}
}
