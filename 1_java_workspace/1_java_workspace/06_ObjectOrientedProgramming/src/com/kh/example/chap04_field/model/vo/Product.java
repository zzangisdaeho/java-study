package com.kh.example.chap04_field.model.vo;

public class Product {
//	private String name;
//	private String brand;
//	private int price;
//	public static int num;
	
	private String name = "��������";
	private String brand = "������";
	private int price = 1500;
	public static int num = 100;
	
//	public Product() {}
//	public Product(String name){
//		this.name = name;
//	}
//	public Product(String brand){
//		//������ �ڷ����� ������ �ڷ����� ����
//		this.name = name;
//	}
	
	
	// ��ü�� �ɹ������� ���� �������� ���� �ν��Ͻ� ���� ����Ǿ� ���������.
	{
		name = "ĭ��";
		price = 1000;
		price -= 100;
		brand = "�Ե�";
		num -= 10;
		//�ν��Ͻ� ���� ��ü ����ø��� �ʱ�ȭ�ȴ�.
	}
	
	static {
//		name = "Ȩ����";
//		brand = "����";
//		price = 2000;
		// Cannot make a static reference to the non-static field price
		// static�� ������ڸ��� static�� �ö� �־�� �ϴµ�, �ν��Ͻ������� ��ü������ �ؾ� �޸𸮿� �ö󰣴� �׷��ϱ� ��� �Ұ���
		num = 150;
		num--; // 149
		//static �ʱ�ȭ���� ���α׷� �������ڸ��� �ѹ��� �ߵ��Ѵ�.
	}
	
	
	public void inform() {
		System.out.println("name : " + name + ", brand : " + brand
				+ ", price : " + price + ", num : " + num);
		// JVM �⺻ �� �ʱ�ȭ : name : null, brand : null, price : 0, num : 0
		// ����� �ʱ�ȭ�� �ʵ� �ʱ�ȭ : name : ��������, brand : ������, price : 1500, num : 100
		// �ν��Ͻ� �ʱ�ȭ ������ �ʱ�ȭ : name : ĭ��, brand : �Ե�, price : 1000, num : 90
		// 
	}
	
	public void inform(int a) {}
	public void inform(int a, int b) {}
	public void inform(int a, String b) {}
	public void inform(String b, int a) {}
}
