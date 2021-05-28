package com.kh.hw.view;

import java.util.Scanner;

import com.kh.hw.controller.Function;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Function fc = new Function();
	
	public void displayMenu() {
		int menuNum = 0;
		while (menuNum != 9)  {
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ������ ū ������ �հ�");
			System.out.println("3. �Ż� ���� Ȯ��");
			System.out.println("4. �л� ���� Ȯ��");
			System.out.println("5. ���� ���� ���");
			System.out.println("6. ���������� �հ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : fc.calculator(); return; //return �� break; �� �ٲܽ� �޼ҵ� ���� �� �޴��� �ڵ����� ���ƿ�.
			case 2 : fc.totalCalculator(); return;
			case 3 : fc.printProfile(); return;
			case 4 : fc.printScore(); return;
			case 5 : fc.printStarNumber(); return;
			case 6 : fc.sumRandom(); return;
			case 7 : fc.exceptGugu(); return;
			case 8 : fc.diceGame(); return;
			case 9 : System.out.println("�����մϴ�"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		
		}
	}
}
