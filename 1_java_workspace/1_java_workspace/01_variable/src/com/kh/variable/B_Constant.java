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
		
		System.out.println("변경 후 age : "+age);
		System.out.println("변경 후 AGE : "+AGE);
		System.out.println("상수 값은 한 번 기록 후 값 변경 불가능");
	}
}
