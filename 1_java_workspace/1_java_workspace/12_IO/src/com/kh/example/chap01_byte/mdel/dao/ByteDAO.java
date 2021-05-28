package com.kh.example.chap01_byte.mdel.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// 키보드나 *파일*로부터 데이터를 읽어들여옴
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			// 기반 스트림으로 단독사용 가능
			// 읽어오려는 파일이 없을 때 FileNotFoundException 발생 -> 반드시 예외처리
			
			// 1. 파일의 크기를 불러와 배열을 만들어 저장한 후 출력하기
//			// 1-1. 파일 크기 가져오기
//			int fileSize = (int)(new File("a_byte.txt").length());
//			// File 클래스 : file에 대한 정보를 가져오는 클래스
//			
//			// 1-2. 파일의 크기만큼 byte배열 선언
//			byte[] bArr = new byte[fileSize];
//			
//			// 1-3. 읽어온 데이터 하나하나를 bArr에 저장
//			fis.read(bArr);
//			
//			for(int i = 0; i < bArr.length; i++) {
//				System.out.print((char)bArr[i] + " ");
//			}
			
			// 2. byte배열을 사용하지 않고 바로바로 하나씩 읽어서 출력하기
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + "- -");
				// b d f c e 
				// 메소드를 두번 호출하기 때문에 하나씩 건너 뛴 내용 출력
				// 조건문에 쓰인 메서드도 해당 값이 true인지 확인하기 위해 실행이 된다는점을 유의!
				// 메서드가 두번 쓰이는걸 막기 위해서 변수 활용 value = fis.read()
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void fileOpen2() {
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
		
			int value;
			while((value = fis.read()) != -1) { // read() 는 데이터를 반환다하다 데이터가 없으면 -1을 반환한다
				System.out.print((char)value + " ");
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fileSave() {
//		FileOutputStream fos = null;
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt")){
			
			fos.write(97);
			byte[] bArr = {98, 99, 100, 101, 102, 103};
//			fos.write(bArr);
			fos.write(bArr, 1, 3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			fos = new FileOutputStream("a_byte.txt"); // true 붙이면 이어쓰기
//			// byte단위로 파일에 저장할 때 쓰이며, 대상 파일이 존재하지 않으면 자동으로 파일을 만들어 저장
//			
//			// write(int b) : void
//			fos.write(97);
//			
//			byte[] bArr = {98, 99, 100, 101, 102, 103};
//			fos.write(bArr);
//			//이클립스가 자바 파일로부터 데이터를 읽어올 때 숫자를 char값으로 받아들이고 이를 출력한다.
//			//반대로 외부 char값을 이클립스에서 int로 받아들이고 넘긴다.
//			
//			fos.write(bArr, 1, 3); // 1번째 index부터 3개를 bArr에서 찾아서 쓰겠다.
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				fos.close();
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
