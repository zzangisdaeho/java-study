package com.kh.operator;

public class E_Compound {
	public void method() {
		int num = 12;
//		num = num+3
		num += 3;
		// 1. 연산속도가 더 빠름
		// 2. 메모리에서 직접 연산 수행
		
		num -= 5;
		num *= 6;
		num /= 2;
		
	}
}
