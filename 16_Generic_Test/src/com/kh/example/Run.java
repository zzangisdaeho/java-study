package com.kh.example;

public class Run {

	public static void main(String[] args) {
		Test<String> test1 = new Test<>();

		test1.setGenericTest("test");

		String str = test1.getGenericTest();

		System.out.println(str);
		
		
		

		Test<Integer> test2 = new Test<>();

		test2.setGenericTest(1);

		int num = test2.getGenericTest();

		System.out.println(num);

	}

}
