package com.kh.example.chap02_user.controller;

import java.util.Scanner;

import com.kh.example.chap02_user.model.exception.MyException;

public class UserController {
	public void inputAge() {
		// ���̸� ����ڿ��� �Է¹޾� age ������ �����ϼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = Integer.valueOf(sc.nextLine());
		
		try {
			checkAge(age);
		}
		catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public void checkAge(int age) throws MyException {
		if (age < 19) {
			throw new MyException("��ȣ�� ���� �Ұ�");
		}
		else {
			System.out.println("��");
		}
	}
}
