package com.kh.example.chap02_user.model.exception;

public class MyException extends Exception {
	// Exception�� ��ӹ޾ƾ� ���� Ŭ������ ó����.
	
	public MyException() {}
	public MyException(String message) {
		super(message);
	}
	
}

