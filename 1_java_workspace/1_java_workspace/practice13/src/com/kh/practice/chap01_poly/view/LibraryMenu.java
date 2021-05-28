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
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		Member mem = new Member( name,  age,  gender);
		lc.insertMember(mem);
		
		int mainMenuSelect = 0;
		while (mainMenuSelect != 9) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : System.out.println(lc.myInfo().toString()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i = 0 ; i < bList.length; i++) {
			if(bList[i] instanceof CookBook) {
				System.out.println(i+"�� ���� : " + ((CookBook)bList[i]).toString());
			}
			else if (bList[i] instanceof AniBook) {
				System.out.println(i+"�� ���� : " + ((AniBook)bList[i]).toString());
			}
		}
		
	}
	
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		Book[] searchBook = lc.searchBook(keyword);
		
		for (int i = 0; i < searchBook.length; i++) {
			System.out.println(searchBook[i].toString());
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = Integer.parseInt(sc.nextLine());
		
		int result = lc.rentBook(index);
		
		switch (result) {
		case 0 : System.out.println("���������� �뿩�Ǿ����ϴ�."); break;
		case 1 : System.out.println("���� �������� �뿩 �Ұ����Դϴ�."); break;
		case 2 : System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���."); break;
		}
		
	}
}
