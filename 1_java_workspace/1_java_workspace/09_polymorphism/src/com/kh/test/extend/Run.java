package com.kh.test.extend;

public class Run {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
		p1.testprint();
		p2.testprint(); // 다형성으로 받아도 자식의 메소드가 실행된다. 동적 바인딩에 의한 현상

	}

}
