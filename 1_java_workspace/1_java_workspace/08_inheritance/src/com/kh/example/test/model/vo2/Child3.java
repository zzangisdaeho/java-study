package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent {
	public Child3() {
		super.ch = 'a';
		super.bool = false;
		//protected니까 상속받은 클래스에서 접근 가능
	}
}
