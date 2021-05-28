package com.kh.example.animal.model.vo;

public class Snake extends Animal{
	/*
	 *  - name : String
	 *  - age : int
	 *  - weight : double
	 *  - pattern : String
	 *  
	 *  + 기본 생성자
	 *  + 매개변수 생성자 (모든 필드 다)
	 *  
	 *  + getter / setter()
	 *  + inform() : String
	 */
	
//	private String name;
//	private int age;
//	private double weight;
	private String pattern;
	
	public Snake() {}
//	public Snake(String name, int age, double weight, String pattern) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//		this.pattern = pattern;
//	}
	public Snake(String name, int age, double weight, String pattern) {
		super(name, age, weight);
		this.pattern = pattern;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	public double getWeight() {
//		return weight;
//	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getPattern() {
		return pattern;
	}
	
//	public String inform() {
//		return super.getName() + ", " +  super.getAge() + ", " +  super.getWeight() + ", " +  pattern;
//		return super.inform() + ", " +  pattern;
//	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + ", " +  pattern;
		}
}
