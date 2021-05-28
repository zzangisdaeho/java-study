package com.kh.practice.book.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File f = new File("book.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
//				try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("book.txt"));){
//					Book[] bArr = new Book[10];
//					ois.writeObject(bArr);
//					ois.writeObject(new Book[10]); // 가능? 자료형 bArr이랑 안맞는건가요?
//				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
