package com.kh.example.chap02_abstractNinterface.family.model.vo;

public class Mother extends Family implements Basic{
//	The type Mother must implement the inherited abstract method Family.sleep()

	private String babyBirth; // 출산, 입양, 없음
	
	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {
		return "Mother : " + super.toString() + ", babyBirth = " + babyBirth;
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 5);
		
	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 10);
	}
	
	public void go() { // implements 후에 추가로 메소드나 필드 추가 가능!
		super.setHealth(super.getHealth()+20);
	}
}
