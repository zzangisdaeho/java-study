package com.kh.practice.book_answer.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book_answer.model.vo.Book;

public class BookDAO {

	private Book bArr[] = new Book[10];
	
	
	public void fileSave(Book[] bArr) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))){
			for(int i = 0; i < bArr.length; i++) {
				if(bArr[i] != null) {
					oos.writeObject(bArr[i]);
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))){
			
			int i = 0;
			while(true) {
				bArr[i] = (Book)ois.readObject();
				i++;
				
				if(i == 10) {
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		return bArr;
		
	}

}
