package com.kh.example.chap02_class.defaultClass.run;

import com.kh.example.chap02_class.defaultClass.controller.DefaultClassTest;

public class Run {

	public static void main(String[] args) {
		DefaultClassTest a = new DefaultClassTest();
		// 불러오고자 하는 클래스의 접근제어자가 default 이기 때문에 다른 패키지에서 접근 불가
	}

}
