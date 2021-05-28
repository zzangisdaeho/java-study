package com.kh.example.chap03_test.controller;

import com.kh.example.chap03_test.model.TestException;

public class TestController {

	public String secondException() throws TestException {
		try {
			return new TestControllerAgain().firstException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new TestException("세번째 예외 간다");
		}
	}
}
