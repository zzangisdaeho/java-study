package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : "+age);
		System.out.println("AGE : "+AGE);
		
		age = 30;
		//AGE = 30;
		
		System.out.println("���� �� age : "+age);
		System.out.println("���� �� AGE : "+AGE);
		System.out.println("��� ���� �� �� ��� �� �� ���� �Ұ���");
	}
}
