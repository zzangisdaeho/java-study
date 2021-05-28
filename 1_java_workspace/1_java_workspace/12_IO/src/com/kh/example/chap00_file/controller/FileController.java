package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		try {
		File f1 = new File("test.txt");
		f1.createNewFile();
		// 작업하는 workspace에 파일 생성
		// 파일을 만들 경로를 지정해주지 않으면
		// 프로젝트 최상단에 파일이 만들어짐
		
		File f2 = new File("C:\\test\\test.txt");
		f2.createNewFile();
		
		File f3 = new File("C:\\temp3\\temp2");
		File f4 = new File("C:\\temp3\\temp2\\test.txt");
		f3.mkdirs();
		f4.createNewFile();
		f4.delete();
		
		System.out.println(f2.exists()); //exists 폴더나 파일이 존재하는지 물어보는것
		System.out.println(f3.exists());
		System.out.println(f3.isFile()); //f3이 폴더가 아닌 파일인지 물어보는것.
		
		System.out.println("파일명 : " + f1.getName());
		System.out.println("저장 경로 : " + f1.getAbsolutePath()); // 절대경로는 어디서나 같은 위치
		System.out.println("저장 상대 경로 : " + f1.getPath()); // 상대경로는 내가 어딨느냐에 따라 다른 위치
		System.out.println("파일 용량 : " + f1.length());
		System.out.println("f1의 상위 폴더 : " + f1.getParent());
		System.out.println("f4의 상위 폴더 : " + f4.getParent());
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
