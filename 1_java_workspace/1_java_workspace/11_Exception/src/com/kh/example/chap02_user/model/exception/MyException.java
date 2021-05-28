package com.kh.example.chap02_user.model.exception;

public class MyException extends Exception {
	// Exception을 상속받아야 예외 클래스로 처리됨.
	
	public MyException() {}
	public MyException(String message) {
		super(message);
	}
	
}

