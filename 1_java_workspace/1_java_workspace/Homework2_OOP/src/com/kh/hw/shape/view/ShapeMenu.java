package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	
	int type = 0;
	int menuNum = 0;
	
	public void inputMenu() {

		while (type != 9) {
			type = 0;
			System.out.println("===== ���� ���α׷� =====");
			System.out.println("3. �ﰢ��\n4. �簢��\n9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			type = Integer.parseInt(sc.nextLine());
			switch(type) {
			case 3 : triangleMenu(); break;
			case 4 : squareMenu(); break;
			case 9 : System.out.println("���α׷� ����"); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");

			}
		}
	}
	public void triangleMenu() {
		menuNum = 0;
		while(menuNum!=9) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ���� ");
			System.out.println("2. �ﰢ�� ��ĥ ");
			System.out.println("3. �ﰢ�� ���� ");
			System.out.println("9. �������� ");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1 : 
				inputSize(type,menuNum);
				break;
			case 2 : 
				inputSize(type,menuNum);
				break;
			case 3 :
				printInformation(type);
				break;
			case 9 :
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				break;
			default :
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			
			}
		
		}
		
	}
	public void squareMenu() {
		menuNum = 0;
		while(menuNum!=9) {
			System.out.println("===== �簢�� =====");
			System.out.println("1. �簢�� �ѷ� ");
			System.out.println("2. �簢�� ���� ");
			System.out.println("3. �簢�� ��ĥ ");
			System.out.println("4. �簢�� ���� ");
			System.out.println("9. �������� ");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1 : 
				inputSize(type,menuNum);
				break;
			case 2 : 
				inputSize(type,menuNum);
				break;
			case 3 :
				inputSize(type,menuNum);
				break;
			case 4 :
				printInformation(type);
				break;
			case 9 :
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				break;
			default :
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			
			}
		}
		
	}
	public void inputSize(int type, int menuNum) {
		if (type == 3 && menuNum == 1){
				System.out.print("���� : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.print("�ʺ� : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.print("�ﰢ�� ���� : ");
				System.out.println(tc.calcArea(height, width));
		}
		else if (type == 3 && menuNum == 2) {
				System.out.print("������ �Է��ϼ��� : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
		}
		else if (type == 4 && menuNum == 1 || type == 4 && menuNum == 2) {
			System.out.print("���� : ");
			int height = Integer.parseInt(sc.nextLine());
			System.out.print("�ʺ� : ");
			int width = Integer.parseInt(sc.nextLine());
			if (menuNum == 1) {
				System.out.print("�簢�� �ѷ� : ");
				System.out.println(scr.calcPerimeter(height, width));
			}
			else if (menuNum == 2) {
				System.out.print("�簢�� ���� : ");
				System.out.println(scr.calcArea(height, width));
			}
		}
		else if (type == 4 && menuNum == 3) {
			System.out.print("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
		}
	}
	public void printInformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		}
		if (type == 4) {
			System.out.println(scr.print());
		}
	}
	
	
	
}
