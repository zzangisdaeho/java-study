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
			System.out.println("====***** 메인 메뉴 *****====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch (mainMenuSelect) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램 종료합니다"); finish = true; break;
			default : System.out.println("님 잘못입력하심 ㅎㅎ 다시하셍");
			}
		}
	}
	public void insertBook() {
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명  : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문/ 2. 과학/ 3. 외국어/ 4. 기타) : ");
		int categorySelect = Integer.parseInt(sc.nextLine());
		String category = "";
		switch(categorySelect) {
		case 1 : category = "인문"; break;
		case 2 : category = "과학"; break;
		case 3 : category = "외국어"; break;
		case 4 : category = "기타"; break;
		}
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);
	}
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		if (bookList.size()==0) {
			System.out.println("존재하는 도서가 없습니다.");
		}
		else {
			System.out.println("==== 도서 전체 조회 ====");
//			for (int i = 0; i < bookList.size(); i++) {
//				System.out.println(bookList.get(i));
//			}
			for (Book b : bookList) {
				System.out.println(b);
			}
		}
	}
	public void searchBook() {
		System.out.println("==== 도서 검색 ====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
	}
	public void deleteBook() {
		System.out.print("삭제 할 도서명 : ");
		String title = sc.nextLine();
		System.out.print("삭제 할 도서의 저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		if (remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		else {
			System.out.println(remove + "이 성공적으로 삭제되었습니다.");
		}
	}
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		}
		else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
