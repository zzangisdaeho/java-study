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
		System.out.println("======== KH 마트 ========");
		boolean finish = false;
		while(!finish) {
			System.out.println("******** 메인 메뉴 *********");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(mainMenuSelect) {
			case 1 :  adminMenu(); break;
			case 2 :  customerMenu(); break;
			case 9 :  System.out.println("나 한다 종료"); finish = true; break;
			default :  System.out.println("제발 잘좀 입력하자"); break;
			}
		}
	}
	public void adminMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("******** 직원 메뉴 *********");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int adminMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(adminMenuSelect) {
			case 1 :  addNewKind(); break;
			case 2 :  removeKind(); break;
			case 3 :  changeAmount(); break;
			case 4 :  printFarm(); break;
			case 9 :  System.out.println("나 간다 돌아"); finish = true; break;
			default :  System.out.println("제발 잘좀 입력하자"); break;
			}
		}
	}
	public void customerMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			// 현재 농산물 및 수량 보여줌
			System.out.println("******** 고갱 메뉴 *********");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int customerMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(customerMenuSelect) {
			case 1 :  buyFarm(); break;
			case 2 :  removeFarm(); break;
			case 3 :  printBuyFarm(); break;
			case 9 :  System.out.println("나 간다 돌아"); finish = true; break;
			default :  System.out.println("제발 잘좀 입력하자"); break;
			}
		}
	}
	public void addNewKind() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3중에 하나 누르는게 그렇게도 어렵더냐");
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "과일"; f=new Fruit(kind, name); break;
		case 2 : kind = "채소"; f=new Vegetable(kind, name); break;
		case 3 : kind = "견과"; f=new Nut(kind, name); break;
		}
		
		if(fc.addNewKind(f, amount)) {
			System.out.println("새 농산물이 추가되었습니다.");
		}
		else {
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			addNewKind();
		}
	}
	public void removeKind() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3중에 하나 누르는게 그렇게도 어렵더냐");
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
//		System.out.print("수량 : ");
//		int amount = Integer.parseInt(sc.nextLine());
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "과일"; f=new Fruit(kind, name); break;
		case 2 : kind = "채소"; f=new Vegetable(kind, name); break;
		case 3 : kind = "견과"; f=new Nut(kind, name); break;
		}
		
		if(fc.removeKind(f)) {
			System.out.println("농산물 삭제에 성공했습니다.");
		}
		else {
			System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			removeKind();
		}
	}
	public void changeAmount() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("갯수 변경할 종류 번호 : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3중에 하나 누르는게 그렇게도 어렵더냐");
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "과일"; f=new Fruit(kind, name); break;
		case 2 : kind = "채소"; f=new Vegetable(kind, name); break;
		case 3 : kind = "견과"; f=new Nut(kind, name); break;
		}
		
		if(fc.changeAmount(f, amount)) {
			System.out.println("농산물 수량이 수정되었습니다..");
		}
		else {
			System.out.println("농산물 수량 수정에 실패하였습니다.. 다시 입력해주세요.");
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
			
			System.out.printf("%s : %s(%d개)\n", s.getKind(), name, hMap.get(s) );
		}
	}
	public void buyFarm() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("구매 종류 번호 : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3중에 하나 누르는게 그렇게도 어렵더냐");
			}
		}
		
		System.out.print("구매할 것 : ");
		String name = sc.nextLine();
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "과일"; f=new Fruit(kind, name); break;
		case 2 : kind = "채소"; f=new Vegetable(kind, name); break;
		case 3 : kind = "견과"; f=new Nut(kind, name); break;
		}
		
		if(fc.buyFarm(f)) {
			System.out.println("구매에 성공하였습니다.");
		}
		else {
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요");
		}
	}
	public void removeFarm() {
		int sortNum = 0;
		while(sortNum != 1 && sortNum != 2 && sortNum !=3) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("구매 취소 할 종류 번호 : ");
			sortNum = Integer.parseInt(sc.nextLine());

			if (sortNum != 1 && sortNum != 2 && sortNum !=3) {
				System.out.println("1, 2, 3중에 하나 누르는게 그렇게도 어렵더냐");
			}
		}
		
		System.out.print("취소할 것 : ");
		String name = sc.nextLine();
		
		String kind = "";
		Farm f = null;
		switch(sortNum) {
		case 1 : kind = "과일"; f=new Fruit(kind, name); break;
		case 2 : kind = "채소"; f=new Vegetable(kind, name); break;
		case 3 : kind = "견과"; f=new Nut(kind, name); break;
		}
		
		if(fc.removeFarm(f)) {
			System.out.println("구매 취소에 성공하였습니다.");
		}
		else {
			System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요");
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
