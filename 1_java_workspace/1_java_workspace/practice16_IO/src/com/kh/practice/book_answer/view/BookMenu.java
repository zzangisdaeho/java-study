package com.kh.practice.book_answer.view;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book_answer.controller.BookController;
import com.kh.practice.book_answer.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		System.out.println(Arrays.toString(bArr));
	}
	
	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while(menuNum != 9);
	}
	
	public void fileSave() {
		System.out.print("도서 명 : ");
		String name = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		System.out.print("할인율 : ");
		double discount = Double.parseDouble(sc.nextLine());
		
		String[] dArr = date.split("-");
		int year = Integer.parseInt(dArr[0]);
		int month = Integer.parseInt(dArr[1]);
		int day = Integer.parseInt(dArr[2]);
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day);
		
		Book b = new Book(name, author, price, c, discount);
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		Book[] book = bc.fileRead();
		for(int i = 0; i < book.length; i++) {
//			if(book[i] != null) {
				System.out.println(book[i]);
//			}
		}
	}
}
