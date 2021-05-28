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
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch(mainMenuSelect) {
			case 1 : fileSave();break;
			case 2 : fileRead();break;
			case 9 : System.out.println("���α׷� ����"); finish = false; break;
			default : System.out.println("�� �߸��Է��� ����");break;
			}
		}
	}
	public void fileSave() {
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		
		System.out.print("���� ���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� ��¥(yyyy-mm-dd) : ");
		String publishDate = sc.nextLine();
		
		String[] publish = publishDate.split("-");
		int year = Integer.parseInt(publish[0]);
		int month = Integer.parseInt(publish[1]);
		int day = Integer.parseInt(publish[2]);
		Calendar date = new GregorianCalendar(year, month, day);
		
		System.out.print("������ : ");
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
		Book[] bArr = bc.fileRead(); // ����
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
