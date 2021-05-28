package com.kh.example.chap01_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() ȣ���...");
		
		try {
			method2();
			System.out.println("��� ������ �ɱ�?"); // try method2���� ������ �߻��߱� ������ ���� �ڵ��� ��µ��� ���� �����ϰ������ finally�� ������. 
		}
		catch (IOException e) {
//			e.printStackTrace(); // ���� ������ �߻��ߴ��� ����ϴ� ����. �����ڵ�� ��ġ ���
			System.out.println(e.getMessage()); // ���� �޼����� �����
		}
		catch (Exception e) { // ���� if else if�� �������̶� ���������� e�� ���� ������ �浹����
			System.out.println("Exception ����");
			return;
		}
		finally {
			System.out.println("���� �߻� ���ο� ��� ���� ������ �����...");
			System.out.println("���� �߻� ���ο� ��� ���� ������ �����...");
			
		}
	}
	
	public void method2() throws IOException {
		System.out.println("method2() ȣ���...");
		
//		throw new NullPointerException(); // Runtime ���� unchecked exception. �����ڰ� ����Ƶ� ��.
		
		throw new IOException("������ ���ܸ� �߻����׽��ϴ�."); // Runtime���� checked exception. �����ڰ� ó���� �־�� ��.
	}
}
