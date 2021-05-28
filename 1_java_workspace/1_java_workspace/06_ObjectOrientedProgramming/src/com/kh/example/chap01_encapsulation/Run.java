package com.kh.example.chap01_encapsulation;

public class Run {

	public static void main(String[] args) {
		Account a = new Account(); //°´Ã¼ »ý¼º
		a.displayBalance();

		a.deposit(1000000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		System.out.println(a.balance);
//		a.balance =  -20000000;
//		System.out.println(a.balance);
		// The field Account.balance is not visible
	}

}
