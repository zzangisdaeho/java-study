package com.kh.practice2.func;

public class CastingPractice3 {
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A'; //65
		
		System.out.println(iNum1 - iNum2*2); //2
		System.out.println((int)(dNum*2 - fNum)); //2
		
		System.out.println((double)(iNum1)); // 10.0
		System.out.println(dNum*4); // 10.0
		
		System.out.println(dNum); // 2.5
		System.out.println(((iNum1-iNum2*2+fNum)/2)); // 2.5
		
		System.out.println((int)(fNum)); // 3
		System.out.println((int)(iNum1-iNum2-dNum)); // 3
		
		System.out.println(iNum1 / fNum); // 3.3333333
		System.out.println((iNum1 / (double)fNum)); // 3.33333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)(ch)); // 65
		System.out.println((int)(ch)+iNum1); // 75
		System.out.println((char)(ch+iNum1)); // 'K'
	
	}
}
