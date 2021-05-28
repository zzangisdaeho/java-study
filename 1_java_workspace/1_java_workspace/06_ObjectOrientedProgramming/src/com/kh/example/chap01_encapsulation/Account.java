package com.kh.example.chap01_encapsulation;

public class Account {
	// 맴버 필드 = 맴버 변수 = 필드 = 전역변수
	private String name = "박신우";
	private String phone = "010-9468-8140";
	private String pwd = "password";
	private int bankCode = 3030;
	private int balance = 0; //잔액
	
	
	
	
	
	
	public void method() {
		int a = 10; // 지역변수
	}
	
	
	public void deposit(int money) {
		//입금을 위한 메소드
		if (money > 0 ) {
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
			balance += money;
			
		}
		else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	public void withdraw(int money) {
		//출금을 위한 메소드
		
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 "+ money + "원이 출금되었습니다.");
			
		}
		else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	
	public void displayBalance() {
		System.out.println(name + "님의 계좌에 잔액은 " + balance + "원 입니다.");
	}
}
