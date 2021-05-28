package com.kh.example.chap04_field.controller;

import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		B_KindsOfVariable2 bkv1 = new B_KindsOfVariable2();
		
		
		int a = bkv1.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		int a2 = B_KindsOfVariable2.staticNum; // �̷��� �ᵵ ��.
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		bkv2.method();
		
		Product p = new Product();
		p.inform(); // num�� static�̱� ������ static block���� -1�Ǿ� 149, ���� instance block���� -10�Ǿ� 139
		
		Product p2 = new Product();
		p2.inform(); // instance block���� -10 �Ǿ� 129... num�� static�̱� ������ ���� ���� �����ȴ� price�� 900���� �����ѰͰ� �������� ��Ÿ���� ����
		
		Product p3 = new Product();
		p3.inform();
		
		
	}
}
