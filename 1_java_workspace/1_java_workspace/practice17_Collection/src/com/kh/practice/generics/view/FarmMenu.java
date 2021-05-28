package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("======== KH ��Ʈ ========");
		boolean finish = false;
		while(!finish) {
			System.out.println("******** ���� �޴� *********");
			System.out.println("1. ���� �޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(mainMenuSelect) {
			case 1 :  adminMenu(); break;
			case 2 :  customerMenu(); break;
			case 9 :  System.out.println("�� �Ѵ� ����"); finish = true; break;
			default :  System.out.println("���� ���� �Է�����"); break;
			}
		}
	}
	public void adminMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("******** ���� �޴� *********");
			System.out.println("1. �� ��깰 �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ��깰 ���");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
			int adminMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(adminMenuSelect) {
			case 1 :  addNewKind(); break;
			case 2 :  removeKind(); break;
			case 3 :  changeAmount(); break;
			case 4 :  printFarm(); break;
			case 9 :  System.out.println("�� ���� ����"); finish = true; break;
			default :  System.out.println("���� ���� �Է�����"); break;
			}
		}
	}
	public void customerMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("���� KH��Ʈ ��깰 ����");
			printFarm();
			// ���� ��깰 �� ���� ������
			System.out.println("******** �� �޴� *********");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
			int customerMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(customerMenuSelect) {
			case 1 :  buyFarm(); break;
			case 2 :  removeFarm(); break;
			case 3 :  printBuyFarm(); break;
			case 9 :  System.out.println("�� ���� ����"); finish = true; break;
			default :  System.out.println("���� ���� �Է�����"); break;
			}
		}
	}
	public void addNewKind() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("�߰��� ���� ��ȣ : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3�߿� �ϳ� �����°� �׷��Ե� ��ƴ���");
			}
		}
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "����"; f=new Fruit(kind, name); break;
		case 2 : kind = "ä��"; f=new Vegetable(kind, name); break;
		case 3 : kind = "�߰�"; f=new Nut(kind, name); break;
		}
		
		if(fc.addNewKind(f, amount)) {
			System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			addNewKind();
		}
	}
	public void removeKind() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3�߿� �ϳ� �����°� �׷��Ե� ��ƴ���");
			}
		}
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
//		System.out.print("���� : ");
//		int amount = Integer.parseInt(sc.nextLine());
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "����"; f=new Fruit(kind, name); break;
		case 2 : kind = "ä��"; f=new Vegetable(kind, name); break;
		case 3 : kind = "�߰�"; f=new Nut(kind, name); break;
		}
		
		if(fc.removeKind(f)) {
			System.out.println("��깰 ������ �����߽��ϴ�.");
		}
		else {
			System.out.println("��깰 ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			removeKind();
		}
	}
	public void changeAmount() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("���� ������ ���� ��ȣ : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3�߿� �ϳ� �����°� �׷��Ե� ��ƴ���");
			}
		}
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "����"; f=new Fruit(kind, name); break;
		case 2 : kind = "ä��"; f=new Vegetable(kind, name); break;
		case 3 : kind = "�߰�"; f=new Nut(kind, name); break;
		}
		
		if(fc.changeAmount(f, amount)) {
			System.out.println("��깰 ������ �����Ǿ����ϴ�..");
		}
		else {
			System.out.println("��깰 ���� ������ �����Ͽ����ϴ�.. �ٽ� �Է����ּ���.");
			changeAmount();
		}
	}
	public void printFarm() {
		HashMap<Farm, Integer> hMap = fc.printFarm();
		Set<Farm> set = hMap.keySet();
		for (Farm s : set) {
			String name = "";
			if(s instanceof Fruit) {
				name = ((Fruit)s).getName();
			}
			else if(s instanceof Vegetable) {
				name = ((Vegetable)s).getName();
			}
			else if(s instanceof Nut) {
				name = ((Nut)s).getName();
			}
			
			System.out.printf("%s : %s(%d��)\n", s.getKind(), name, hMap.get(s) );
		}
	}
	public void buyFarm() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("���� ���� ��ȣ : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3�߿� �ϳ� �����°� �׷��Ե� ��ƴ���");
			}
		}
		
		System.out.print("������ �� : ");
		String name = sc.nextLine();
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "����"; f=new Fruit(kind, name); break;
		case 2 : kind = "ä��"; f=new Vegetable(kind, name); break;
		case 3 : kind = "�߰�"; f=new Nut(kind, name); break;
		}
		
		if(fc.buyFarm(f)) {
			System.out.println("���ſ� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("��Ʈ�� ���� �����̰ų� ������ �����ϴ�. �ٽ� �Է����ּ���");
		}
	}
	public void removeFarm() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("���� ��� �� ���� ��ȣ : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3�߿� �ϳ� �����°� �׷��Ե� ��ƴ���");
			}
		}
		
		System.out.print("����� �� : ");
		String name = sc.nextLine();
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "����"; f=new Fruit(kind, name); break;
		case 2 : kind = "ä��"; f=new Vegetable(kind, name); break;
		case 3 : kind = "�߰�"; f=new Nut(kind, name); break;
		}
		
		if(fc.removeFarm(f)) {
			System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("���� ��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
		}
	}
	public void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm();
		Iterator<Farm> it = list.iterator();
		while(it.hasNext()) {
			Farm f = it.next();
			String kind = f.getKind();
			String name = "";
			if(f instanceof Fruit) {
				name = ((Fruit)f).getName();
			}
			else if(f instanceof Vegetable) {
				name = ((Vegetable)f).getName();
			}
			else if(f instanceof Nut) {
				name = ((Nut)f).getName();
			}
			
			System.out.printf("%s : %s\n", kind, name);
		}
		
	}
}
