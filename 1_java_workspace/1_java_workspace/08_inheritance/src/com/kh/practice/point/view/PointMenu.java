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
			
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int circleMenuSelect = Integer.parseInt(sc.nextLine());
		
		switch (circleMenuSelect) {
		case 1 : calcCircum(); break;
		case 2 : calcCircleArea(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�."); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); circleMenu();
		}
		
	}
	public void rectangleMenu() {
		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int rectangleMenuSelect = Integer.parseInt(sc.nextLine());
		
		switch (rectangleMenuSelect) {
		case 1 : calcPerimeter(); break;
		case 2 : calcRectArea(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�."); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); rectangleMenu();
		}
		
	}
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("������ : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);
		
	}
	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("������ : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("�ʺ� : ");
		int width = Integer.parseInt(sc.nextLine());
		
		String result = rc.calcPeimeter(x, y, height, width);
		System.out.println(result);
	}
	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("�ʺ� : ");
		int width = Integer.parseInt(sc.nextLine());
		
		String result = rc.calcArea(x, y, height, width);
		System.out.println(result);
	}
}
