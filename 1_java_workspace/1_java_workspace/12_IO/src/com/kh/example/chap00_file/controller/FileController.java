package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		try {
		File f1 = new File("test.txt");
		f1.createNewFile();
		// �۾��ϴ� workspace�� ���� ����
		// ������ ���� ��θ� ���������� ������
		// ������Ʈ �ֻ�ܿ� ������ �������
		
		File f2 = new File("C:\\test\\test.txt");
		f2.createNewFile();
		
		File f3 = new File("C:\\temp3\\temp2");
		File f4 = new File("C:\\temp3\\temp2\\test.txt");
		f3.mkdirs();
		f4.createNewFile();
		f4.delete();
		
		System.out.println(f2.exists()); //exists ������ ������ �����ϴ��� ����°�
		System.out.println(f3.exists());
		System.out.println(f3.isFile()); //f3�� ������ �ƴ� �������� ����°�.
		
		System.out.println("���ϸ� : " + f1.getName());
		System.out.println("���� ��� : " + f1.getAbsolutePath()); // �����δ� ��𼭳� ���� ��ġ
		System.out.println("���� ��� ��� : " + f1.getPath()); // ����δ� ���� ������Ŀ� ���� �ٸ� ��ġ
		System.out.println("���� �뷮 : " + f1.length());
		System.out.println("f1�� ���� ���� : " + f1.getParent());
		System.out.println("f4�� ���� ���� : " + f4.getParent());
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
