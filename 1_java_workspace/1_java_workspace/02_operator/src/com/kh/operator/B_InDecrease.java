package com.kh.operator;

public class B_InDecrease {
	// ���� ������ : ++, --
	// ��ġ�� ���� ���������ڿ� ���������ڷ� ����
	public void method1() {
		//���� ���� ������
		int num1 = 10;
		System.out.println("�������������� ���� �� : "+num1); //10
		System.out.println("++num1�� 1ȸ ���� �� ��� : "+(++num1)); //���� �� ���� 11
		System.out.println("++num1�� 2ȸ ���� �� ��� : "+(++num1)); //���� �� ���� 12
		System.out.println("++num1�� 3ȸ ���� �� ��� : "+(++num1)); //���� �� ���� 13
		System.out.println("++num1�� 4ȸ ���� �� ��� : "+(++num1)); //���� �� ���� 14
		System.out.println("++num1�� 5ȸ ���� �� ��� : "+(++num1)); //���� �� ���� 15
		System.out.println("���� ���� ���� ���� �� num1�� �� : " + num1); //15
		
		//���� ���� ������
		int num2 = 10;
		System.out.println("�������������� ���� �� : "+num2); //10
		System.out.println("num2++�� 1ȸ ���� �� ��� : "+(num2++)); //10 ���� �� 11
		System.out.println("num2++�� 2ȸ ���� �� ��� : "+(num2++)); //11 ���� �� 12
		System.out.println("num2++�� 3ȸ ���� �� ��� : "+(num2++)); //12 ���� �� 13
		System.out.println("num2++�� 4ȸ ���� �� ��� : "+(num2++)); //13 ���� �� 14
		System.out.println("num2++�� 5ȸ ���� �� ��� : "+(num2++)); //14 ���� �� 15
		System.out.println("���� ���� ���� ���� �� num2�� �� : " + num2); //15
	}
	public void method2() {
		int age = 20;
		System.out.println("���� ���̴�? " + age); //20
		System.out.println("++age��? " + (++age)); //���� �� ��� 21
		System.out.println("age++��? " + (age++)); // 21 ��� �� ���� 22
		System.out.println("--age��? " + (--age)); // 21 �� ���� �� ��� 
		System.out.println("age--��? " + (age--)); // 21 ��� �� ���� 20
		System.out.println("���� ���̴�? " + (age)); // 20		
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
