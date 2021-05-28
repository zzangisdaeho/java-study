package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch(mainMenuSelect) {
			case 1 : insertObject(); break;
			case 2 : deleteObject(); break;
			case 3 : winObject(); break;
			case 4 : sortedWinObject(); break;
			case 5 : searchWinner(); break;
			case 9 : System.out.println("시스템 종료합니다"); finish = true; break;
			default : System.out.println("잘못 입력하심 다시하셈");
			}
		}
	}
	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int theNumberOfSlot = Integer.parseInt(sc.nextLine());
		int successCount = 0;
		
		for (int i = 0; i < theNumberOfSlot; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호 ('-'빼고) : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			if(lc.insertObject(l)) {
				successCount++;
			}
			else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println(successCount + "명 추가 완료되었습니다.");
	}
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호 ('-'빼고) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	public void winObject() {
		System.out.println(lc.winObject());
	}
	public void sortedWinObject() {
//		System.out.println(lc.sortedWinObject());
		
		TreeSet<Lottery> ts = lc.sortedWinObject();
		Iterator<Lottery> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호 ('-'빼고) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		if (lc.searchWinner(l)) {
			System.out.println("축하험 당첨되심 ㅎ");
		}
		else {
			System.out.println("안될놈은 뭘해도 안되더라");
		}
	}
	
}
