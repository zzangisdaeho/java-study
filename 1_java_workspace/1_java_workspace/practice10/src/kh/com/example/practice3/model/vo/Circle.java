package kh.com.example.practice3.model.vo;

public class Circle {
	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {}
	
	public void setter() {
		
	}
	public void getter() {
		
	}
	public void incrementRadius() {
		radius ++;
	}
	public void getAreaOfCircle() {
		System.out.println(2*radius*PI);
	}
	public void getSizeOfCircle() {
		System.out.println(Math.pow(radius, 2)*PI);
	}
	
}
