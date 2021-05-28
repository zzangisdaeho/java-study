package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x , int y, int radius) {
		double calcArea = Circle.getPi() * Math.pow(radius, 2);
		return "면적 : " + x +", " + y +", "+ radius+ " / " + calcArea;
	}
	
	public String calcCircum(int x, int y, int radius) {
		double calcCircum = Circle.getPi() * radius * 2;
		return "둘레 : " + x +", " + y +", "+ radius+ " / " + calcCircum;
	}
}
