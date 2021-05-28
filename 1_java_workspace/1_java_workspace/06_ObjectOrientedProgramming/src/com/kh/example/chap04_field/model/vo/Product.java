package com.kh.example.chap04_field.model.vo;

public class Product {
//	private String name;
//	private String brand;
//	private int price;
//	public static int num;
	
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	public static int num = 100;
	
//	public Product() {}
//	public Product(String name){
//		this.name = name;
//	}
//	public Product(String brand){
//		//위에랑 자료형의 갯수와 자료형이 같돠
//		this.name = name;
//	}
	
	
	// 객체의 맴버변수가 먼저 쓰여지고 이후 인스턴스 블럭이 실행되어 덮어쓰여진다.
	{
		name = "칸쵸";
		price = 1000;
		price -= 100;
		brand = "롯데";
		num -= 10;
		//인스턴스 블럭은 객체 실행시마다 초기화된다.
	}
	
	static {
//		name = "홈런볼";
//		brand = "해태";
//		price = 2000;
		// Cannot make a static reference to the non-static field price
		// static은 실행되자마자 static에 올라가 있어야 하는데, 인스턴스변수는 객체형성을 해야 메모리에 올라간다 그러니까 사용 불가능
		num = 150;
		num--; // 149
		//static 초기화블럭은 프로그램 시작하자마자 한번만 발동한다.
	}
	
	
	public void inform() {
		System.out.println("name : " + name + ", brand : " + brand
				+ ", price : " + price + ", num : " + num);
		// JVM 기본 값 초기화 : name : null, brand : null, price : 0, num : 0
		// 명시적 초기화로 필드 초기화 : name : 초코파이, brand : 오리온, price : 1500, num : 100
		// 인스턴스 초기화 블럭으로 초기화 : name : 칸쵸, brand : 롯데, price : 1000, num : 90
		// 
	}
	
	public void inform(int a) {}
	public void inform(int a, int b) {}
	public void inform(int a, String b) {}
	public void inform(String b, int a) {}
}
