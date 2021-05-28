package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		double calcArea = height * width;
		return "면적 : " + x + ", " + y + ", " + height + ", " + width +" / "+ calcArea;
	}
	public String calcPeimeter(int x, int y, int height, int width) {
		double calcPeimeter = 2 * (height + width);
		return "면적 : " + x + ", " + y + ", " + height + ", " + width +" / "+ calcPeimeter;
	}
}
