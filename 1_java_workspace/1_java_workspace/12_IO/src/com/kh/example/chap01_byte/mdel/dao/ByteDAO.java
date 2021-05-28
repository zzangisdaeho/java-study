package com.kh.example.chap01_byte.mdel.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// Ű���峪 *����*�κ��� �����͸� �о�鿩��
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			// ��� ��Ʈ������ �ܵ���� ����
			// �о������ ������ ���� �� FileNotFoundException �߻� -> �ݵ�� ����ó��
			
			// 1. ������ ũ�⸦ �ҷ��� �迭�� ����� ������ �� ����ϱ�
//			// 1-1. ���� ũ�� ��������
//			int fileSize = (int)(new File("a_byte.txt").length());
//			// File Ŭ���� : file�� ���� ������ �������� Ŭ����
//			
//			// 1-2. ������ ũ�⸸ŭ byte�迭 ����
//			byte[] bArr = new byte[fileSize];
//			
//			// 1-3. �о�� ������ �ϳ��ϳ��� bArr�� ����
//			fis.read(bArr);
//			
//			for(int i = 0; i < bArr.length; i++) {
//				System.out.print((char)bArr[i] + " ");
//			}
			
			// 2. byte�迭�� ������� �ʰ� �ٷιٷ� �ϳ��� �о ����ϱ�
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + "- -");
				// b d f c e 
				// �޼ҵ带 �ι� ȣ���ϱ� ������ �ϳ��� �ǳ� �� ���� ���
				// ���ǹ��� ���� �޼��嵵 �ش� ���� true���� Ȯ���ϱ� ���� ������ �ȴٴ����� ����!
				// �޼��尡 �ι� ���̴°� ���� ���ؼ� ���� Ȱ�� value = fis.read()
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
			while((value = fis.read()) != -1) { // read() �� �����͸� ��ȯ���ϴ� �����Ͱ� ������ -1�� ��ȯ�Ѵ�
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
//			fos = new FileOutputStream("a_byte.txt"); // true ���̸� �̾��
//			// byte������ ���Ͽ� ������ �� ���̸�, ��� ������ �������� ������ �ڵ����� ������ ����� ����
//			
//			// write(int b) : void
//			fos.write(97);
//			
//			byte[] bArr = {98, 99, 100, 101, 102, 103};
//			fos.write(bArr);
//			//��Ŭ������ �ڹ� ���Ϸκ��� �����͸� �о�� �� ���ڸ� char������ �޾Ƶ��̰� �̸� ����Ѵ�.
//			//�ݴ�� �ܺ� char���� ��Ŭ�������� int�� �޾Ƶ��̰� �ѱ��.
//			
//			fos.write(bArr, 1, 3); // 1��° index���� 3���� bArr���� ã�Ƽ� ���ڴ�.
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
