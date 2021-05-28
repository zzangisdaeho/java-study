package com.kh.example.chap04_field.controller;

import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		B_KindsOfVariable2 bkv1 = new B_KindsOfVariable2();
		
		
		int a = bkv1.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		int a2 = B_KindsOfVariable2.staticNum; // 이렇게 써도 됨.
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		bkv2.method();
		
		Product p = new Product();
		p.inform(); // num이 static이기 때문에 static block에서 -1되어 149, 이후 instance block에서 -10되어 139
		
		Product p2 = new Product();
		p2.inform(); // instance block에서 -10 되어 129... num은 static이기 때문에 기존 값이 유지된다 price가 900으로 동일한것과 차이점이 나타나는 이유
		
		Product p3 = new Product();
		p3.inform();
		
		
	}
}
