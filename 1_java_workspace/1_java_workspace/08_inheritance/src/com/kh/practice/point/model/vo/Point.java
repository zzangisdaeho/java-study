package com.kh.practice.point.model.vo;

public class Point {
	private int x;
	private int y;
	private final static double PI = 3.14159265359;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public static double getPi() {
		return PI;
	}
	
	@Override
	public String toString() {
		return x + ", " + y;
	}
}
