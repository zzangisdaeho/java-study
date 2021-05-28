package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList<>();
	
	{
		list.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		list.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		list.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		list.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));
	}
	
	public BookController() {
//		list.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
//		list.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
//		list.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
//		list.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));
	}
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>)list;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>(); 
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getTitle().contains(keyword)) {
//				searchList.add(list.get(i));
//			}
//		}
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
//		for(Book b : list) { // java.util.ConcurrentModificationException
//			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
//				list.remove(b);
//				removeBook = b;
//			}
//		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title) &&
					list.get(i).getAuthor().equals(author)) {
				removeBook=list.get(i);
				list.remove(i);
			}
		}
		return removeBook;
	}
	public int ascBook() {
		Collections.sort(list);
		return 1;
		
	}
}
