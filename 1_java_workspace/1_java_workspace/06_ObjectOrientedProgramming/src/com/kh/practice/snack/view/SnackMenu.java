package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.nextLine();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		
		System.out.print("���� : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
//		Snack a = scr.saveData(kind, name, flavor, numOf, price);
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�? (y/n) : ");
		char choice = sc.nextLine().charAt(0);
		
		if (choice == 'Y' || choice =='y') {
			System.out.println(scr.confirmData());
		}
		// System.out.println(a.getKind)
		// System.out.println(a.getName)
		// System.out.println(a.getFlavor)
		// System.out.println(a.getNumOf)
		// System.out.println(a.getPrice)
		else if (choice == 'N' || choice == 'n') {
			
		}
	}
}
