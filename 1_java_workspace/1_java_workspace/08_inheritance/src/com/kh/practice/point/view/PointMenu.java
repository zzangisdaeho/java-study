package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int mainMenuSelect = 0;
		while (mainMenuSelect != 9) {
			mainMenuSelect = 0;
			
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int circleMenuSelect = Integer.parseInt(sc.nextLine());
		
		switch (circleMenuSelect) {
		case 1 : calcCircum(); break;
		case 2 : calcCircleArea(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); break;
		default : System.out.println("잘못 입력하셨습니다."); circleMenu();
		}
		
	}
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int rectangleMenuSelect = Integer.parseInt(sc.nextLine());
		
		switch (rectangleMenuSelect) {
		case 1 : calcPerimeter(); break;
		case 2 : calcRectArea(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); break;
		default : System.out.println("잘못 입력하셨습니다."); rectangleMenu();
		}
		
	}
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);
		
	}
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		String result = rc.calcPeimeter(x, y, height, width);
		System.out.println(result);
	}
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		String result = rc.calcArea(x, y, height, width);
		System.out.println(result);
	}
}
