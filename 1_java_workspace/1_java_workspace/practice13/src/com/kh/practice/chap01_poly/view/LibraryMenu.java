package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		Member mem = new Member( name,  age,  gender);
		lc.insertMember(mem);
		
		int mainMenuSelect = 0;
		while (mainMenuSelect != 9) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : System.out.println(lc.myInfo().toString()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i = 0 ; i < bList.length; i++) {
			if(bList[i] instanceof CookBook) {
				System.out.println(i+"번 도서 : " + ((CookBook)bList[i]).toString());
			}
			else if (bList[i] instanceof AniBook) {
				System.out.println(i+"번 도서 : " + ((AniBook)bList[i]).toString());
			}
		}
		
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchBook = lc.searchBook(keyword);
		
		for (int i = 0; i < searchBook.length; i++) {
			System.out.println(searchBook[i].toString());
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = Integer.parseInt(sc.nextLine());
		
		int result = lc.rentBook(index);
		
		switch (result) {
		case 0 : System.out.println("성공적으로 대여되었습니다."); break;
		case 1 : System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2 : System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요."); break;
		}
		
	}
}
