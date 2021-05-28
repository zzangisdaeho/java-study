package com.kh.practice.chap02_abstractNinterface.run;

import com.kh.practice.chap02_abstractNinterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] print = pc.method();
		for(int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}

}
