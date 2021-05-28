package com.kh.practice.book.view;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr=bc.fileRead();
	}
	
	public void mainMenu() {
		boolean finish = true;
		while(finish) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch(mainMenuSelect) {
			case 1 : fileSave();break;
			case 2 : fileRead();break;
			case 9 : System.out.println("프로그램 종료"); finish = false; break;
			default : System.out.println("님 잘못입력함 ㅎㅎ");break;
			}
		}
	}
	public void fileSave() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String publishDate = sc.nextLine();
		
		String[] publish = publishDate.split("-");
		int year = Integer.parseInt(publish[0]);
		int month = Integer.parseInt(publish[1]);
		int day = Integer.parseInt(publish[2]);
		Calendar date = new GregorianCalendar(year, month, day);
		
		System.out.print("할인율 : ");
		double discount = Double.parseDouble(sc.nextLine());
		
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i]==null) {
				bArr[i] = new Book(title, author, price, date, discount);
				bc.fileSave(bArr);
				break;
			}
		}
		
	}
	public void fileRead() {
		Book[] bArr = bc.fileRead(); // 해제
		System.out.println(Arrays.toString(bArr));
//		for(int i = 0; i < bArr.length; i++) {
//			if(bArr[i] == null) {
//				continue;
//			}
//			else {
//				System.out.println(bc.fileRead()[i]);
//			}
//		}
	}
}
