package com.kh.example.chap03_test.controller;

import java.util.Scanner;

import com.kh.example.chap03_test.model.TestException;

public class TestControllerAgain {

	Scanner sc = new Scanner(System.in);
	
	public String firstException() throws TestException {
		int write = Integer.parseInt(sc.nextLine());
		System.out.println(write);
		try {
			if(write >= 10) {
				throw new TestException("ù��° ���� ����");
			}else {
				return "OK";
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw new TestException("�ι�° ���� �޾Ҵ�");
		}
	}
}
