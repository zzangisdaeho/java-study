package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4,height,width);
		double perimeter = (s.getHeight()+s.getWidth())*2;
		return perimeter;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4,height,width);
		double area = s.getHeight() * s.getWidth();
		return area;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "�簢�� " + s.information();
	}
	
	
}
