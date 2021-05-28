package com.kh.example.chap02_user.controller;

import java.util.Scanner;

import com.kh.example.chap02_user.model.exception.MyException;

public class UserController {
	public void inputAge() {
		// 나이를 사용자에게 입력받아 age 변수에 저장하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
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
			throw new MyException("관호는 입장 불가");
		}
		else {
			System.out.println("즐감");
		}
	}
}
