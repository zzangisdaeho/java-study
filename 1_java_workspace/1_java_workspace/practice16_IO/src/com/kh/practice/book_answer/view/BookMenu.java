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
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while(menuNum != 9);
	}
	
	public void fileSave() {
		System.out.print("���� �� : ");
		String name = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("���� ���� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("���� ��¥(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		System.out.print("������ : ");
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
