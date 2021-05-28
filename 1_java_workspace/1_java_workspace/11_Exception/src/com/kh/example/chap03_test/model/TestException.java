package com.kh.example.chap03_test.model;

public class TestException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TestException() {}
	public TestException(String msg) {
		super(msg);
	}
}
