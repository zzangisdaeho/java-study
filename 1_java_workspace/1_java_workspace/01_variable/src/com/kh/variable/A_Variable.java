package com.kh.variable;

public class A_Variable {
	public void declareVariable() {
		/* 변수 선언 후 초기화
		 * A. 변수 선언
		 * 1. 논리형
		 * 2. 숫자형
		 * 3. 문자형
		 * B. 초기화(대입)
		 */
		boolean isTrue;
		
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		float fNum;
		double dNum;
		
		char ch;
		String str;
		
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0F;
		dNum = 8.0;
		
		ch = 'A';
		str = "박신우";
		str = "A";
		
		
		System.out.println("isTrue의  값 : " + isTrue);
		System.out.println("bNum의 값 :" + bNum);
		System.out.println("sNum의 값 :" + sNum);
		System.out.println("iNum의 값 :" + iNum);
		System.out.println("lNum의 값 :" + lNum);
		System.out.println("fNum의 값 :" + fNum);
		System.out.println("dNum의 값 :" + dNum);
		System.out.println("ch의 값 :" + ch);
		System.out.println("str의 값 :" + str);
		
	}
	
	public void initVariable() {
		boolean isTrue = false;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8;
		//L안붙여봄 4바이트까진 안붙여도 상관없음 int영역에서 처리가능
		
		float fNum = 4.0F;
		double dNum = 8.0;
		
		char ch = 'A';
		String str = "박신우";
		
		System.out.println("isTrue의  값 : " + isTrue);
		System.out.println("bNum의 값 :" + bNum);
		System.out.println("sNum의 값 :" + sNum);
		System.out.println("iNum의 값 :" + iNum);
		System.out.println("lNum의 값 :" + lNum);
		System.out.println("fNum의 값 :" + fNum);
		System.out.println("dNum의 값 :" + dNum);
		System.out.println("ch의 값 :" + ch);
		System.out.println("str의 값 :" + str);
	}
}
