package com.kh.example.chap01.run;

public class Test {
	
	private static Runnable lambdaTest(Runnable runnable) {

	     runnable.run(); // input lambda 넣은것 실행

	     return ()->System.out.println("return lambda");

	   }
	
	public static void main(String[] args) {
		 lambdaTest(()->System.out.println("input lambda")).run();
	}
}
