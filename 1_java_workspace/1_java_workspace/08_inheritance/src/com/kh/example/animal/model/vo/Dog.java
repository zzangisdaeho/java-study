package com.kh.example.animal.model.vo;

public class Dog extends Animal {
	/*
	 *  - name : String
	 *  - age : int
	 *  - weight : double
	 *  - height : double
	 *  - hair : String
	 *  
	 *  +기본 생성자
	 *  +매개변수 생성자(모든 필드 다)
	 *  
	 *  + getter / setter()
	 *  + inform() : String
	 */
	
//	private String name;
//	private int age;
//	private double weight;
	private double height;
	private String hair;
	
	public Dog() {}
	
	public Dog(String name, int age, double weight, double height) {
		super(name, age, weight);
		this.height = height;
		
	}
	
	public Dog(String name, int age, double weight, double height, String hair) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
		this(name, age, weight,height);
//		super(name, age, weight);
//		this.height = height;
		this.hair = hair;
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName() {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public double getWeight() {
//		return weight;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	
//	public String inform() {
//		return super.getName() + ", " + super.getAge() + ", " +
//				super.getWeight() + ", " +  height + ", " +  hair;
		
//		return super.inform() + ", " +  height + ", " +  hair;
//	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		return super.toString() + ", " +  height + ", " +  hair;
//		return 
		}
	
	public int method2() {
		int a = finalMethod();
		return a+1;
	}
}
