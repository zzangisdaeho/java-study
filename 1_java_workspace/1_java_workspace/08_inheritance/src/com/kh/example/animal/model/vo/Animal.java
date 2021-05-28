package com.kh.example.animal.model.vo;

public /* final */ class Animal {
	private String name;
	private int age;
	private double weight;
	
	public Animal() {}
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
//	public String inform() {
//		return name + ", " +  age + ", " +  weight;
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " +  age + ", " +  weight;
	}
	
	public int finalMethod() {
		return 0;
	}
	
	public void setParent(String status) {
		switch (status) {
		case "1" : this.name="Y"; this.age=1;break;
		case "2" : this.name="N"; this.age=0;break;
		default: System.out.println("잘못된 case값 입력");
		}
	}
	
	public <T extends Animal> T changeChild(T child, String status) {
		switch (status) {
		case "1" : child.setName("Y");child.setAge(1);return child;
		case "2" : child.setName("N");child.setAge(0);return child;
		default: System.out.println("잘못된 case값 입력");return null;
		
		}
	}
	
}
