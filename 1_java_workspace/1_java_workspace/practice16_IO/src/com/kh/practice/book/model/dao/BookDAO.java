package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {
//			oos.writeObject(bArr); // 秦力
			System.out.println("BookDAO fileSave : " + Arrays.toString(bArr));
			for(int i = 0 ; i< bArr.length; i++) { //昏力
				if(bArr[i] != null) { // 昏力
					oos.writeObject(bArr[i]); //昏力
					System.out.println(bArr[i]);
					System.out.println();
					break; // 昏力
				} //昏力
			} //昏力
//			System.out.println(bArr[0]);
//			System.out.println(bArr[1]);
//			System.out.println(bArr[2]);
//			System.out.println(bArr[3]);
//			System.out.println(bArr[4]);
//			System.out.println(bArr[5]);
//			System.out.println(bArr[6]);
//			System.out.println(bArr[7]);
//			System.out.println(bArr[8]);
//			System.out.println(bArr[9]);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}
	public Book[] fileRead() {
		File f = new File("book.txt");
		if(f.length() != 0) {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));) {
	//			Book[] bArr = (Book[])ois.readObject(); //秦力
	//			return bArr;
				for(int i = 0; i < bArr.length; i++) { // 昏力
					if(bArr[i] != null) { // 昏力
						continue; // 昏力
					} // 昏力
					else { // 昏力
						try{
							bArr[i] = (Book)ois.readObject(); // 昏力
						}
						catch(EOFException e){
							break;
						}
					}
				}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return bArr;
	}
}

