package com.kh.test.ploymorphism.run;

public class Test {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.methodA();
		superClass.methodB();
		superClass.methodC();

		SuperClass subClass = new SubClass();
		subClass.methodA();
		subClass.methodB();
		subClass.methodC();

	}
}

class SuperClass {
	void methodA() {
		System.out.println("SuperClass A ");
	}

	void methodB() {
		System.out.println("SuperClass B");
	}
	
	static void methodC() {
		System.out.println("SuperClass C");
	}
}

class SubClass extends SuperClass {
	@Override
	void methodA() {
		System.out.println("SubClass A");
	}

	//@override 어노테이션 없어도 알아서 동적 바인딩 된다. 컴파일 오류를 잡아주는 어노테이션이라고 보면 될듯.
	void methodB() {
		System.out.println("SubClass B");
	}
	
	static void methodC() {
		System.out.println("SubClass C");
	}
}
