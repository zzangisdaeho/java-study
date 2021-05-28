package com.kh.example.chap01.run;

public class Test {
	
	private static Runnable lambdaTest(Runnable runnable) {

	     runnable.run(); // input lambda ������ ����

	     return ()->System.out.println("return lambda");

	   }
	
	public static void main(String[] args) {
		 lambdaTest(()->System.out.println("input lambda")).run();
	}
}
