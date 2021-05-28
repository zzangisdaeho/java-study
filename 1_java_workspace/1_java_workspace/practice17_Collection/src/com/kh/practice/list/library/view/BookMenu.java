package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("==== Welcome KH Library ====");
			System.out.println("====***** ���� �޴� *****====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch (mainMenuSelect) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷� �����մϴ�"); finish = true; break;
			default : System.out.println("�� �߸��Է��Ͻ� ���� �ٽ��ϼ�");
			}
		}
	}
	public void insertBook() {
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� ��  : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι�/ 2. ����/ 3. �ܱ���/ 4. ��Ÿ) : ");
		int categorySelect = Integer.parseInt(sc.nextLine());
		String category = "";
		switch(categorySelect) {
		case 1 : category = "�ι�"; break;
		case 2 : category = "����"; break;
		case 3 : category = "�ܱ���"; break;
		case 4 : category = "��Ÿ"; break;
		}
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);
	}
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		if (bookList.size()==0) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}
		else {
			System.out.println("==== ���� ��ü ��ȸ ====");
//			for (int i = 0; i < bookList.size(); i++) {
//				System.out.println(bookList.get(i));
//			}
			for (Book b : bookList) {
				System.out.println(b);
			}
		}
	}
	public void searchBook() {
		System.out.println("==== ���� �˻� ====");
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList.size() == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
	}
	public void deleteBook() {
		System.out.print("���� �� ������ : ");
		String title = sc.nextLine();
		System.out.print("���� �� ������ ���ڸ� : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		if (remove == null) {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		else {
			System.out.println(remove + "�� ���������� �����Ǿ����ϴ�.");
		}
	}
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
	}
}
