package com.kh.operator;

public class B_InDecrease {
	// 증감 연산자 : ++, --
	// 위치에 따라 전위연산자와 후위연산자로 나뉨
	public void method1() {
		//전위 증감 연산자
		int num1 = 10;
		System.out.println("전위증감연산자 적용 전 : "+num1); //10
		System.out.println("++num1을 1회 수행 후 결과 : "+(++num1)); //증가 후 찍힘 11
		System.out.println("++num1을 2회 수행 후 결과 : "+(++num1)); //증가 후 찍힘 12
		System.out.println("++num1을 3회 수행 후 결과 : "+(++num1)); //증가 후 찍힘 13
		System.out.println("++num1을 4회 수행 후 결과 : "+(++num1)); //증가 후 찍힘 14
		System.out.println("++num1을 5회 수행 후 결과 : "+(++num1)); //증가 후 찍힘 15
		System.out.println("전위 증감 연산 수행 후 num1의 값 : " + num1); //15
		
		//후위 증감 연산자
		int num2 = 10;
		System.out.println("전위증감연산자 적용 전 : "+num2); //10
		System.out.println("num2++을 1회 수행 후 결과 : "+(num2++)); //10 찍힌 후 11
		System.out.println("num2++을 2회 수행 후 결과 : "+(num2++)); //11 찍힌 후 12
		System.out.println("num2++을 3회 수행 후 결과 : "+(num2++)); //12 찍힌 후 13
		System.out.println("num2++을 4회 수행 후 결과 : "+(num2++)); //13 찍힌 후 14
		System.out.println("num2++을 5회 수행 후 결과 : "+(num2++)); //14 찍힌 후 15
		System.out.println("전위 증감 연산 수행 후 num2의 값 : " + num2); //15
	}
	public void method2() {
		int age = 20;
		System.out.println("현재 나이는? " + age); //20
		System.out.println("++age는? " + (++age)); //증가 후 출력 21
		System.out.println("age++는? " + (age++)); // 21 출력 후 증가 22
		System.out.println("--age는? " + (--age)); // 21 로 감소 후 출력 
		System.out.println("age--는? " + (age--)); // 21 출력 후 감소 20
		System.out.println("현재 나이는? " + (age)); // 20		
	}
	public void method3() {
		int num1 = 20;
		
		int result = num1++ * 3;
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1);
		
		int num2 = 20;
		
		int result2 = ++num2 * 3;
		System.out.println("result2 : "+result2);
		System.out.println("num2 : "+num2);
	}
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=11 10
		
		System.out.println((++a) + (b++)); // a=12 32 b=21
		
		System.out.println((a++)+(--b)+(--c)); // b=20 c=29 61 a=13
		
		System.out.println("a : "+a); // 13
		System.out.println("b : "+b); // 20
		System.out.println("c : "+c); // 29
		
	}
}
