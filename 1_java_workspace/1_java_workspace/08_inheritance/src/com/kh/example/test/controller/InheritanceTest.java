package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {

	public void method() {
		// Parent 클래스의 num필드에 접근
		System.out.println("Parent클래스의 num필드 접근");
		
		Parent p = new Parent();
		p.setNum(9);
		
		System.out.println("Parent안에 있는 num : " + p.getNum());
		
		// Child1 클래스의 str필드에 접근
		System.out.println("Child1클래스의 str필드에 접근");
		
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		
		System.out.println("Child1안에 있는 str : " + c1.getStr());
		
		// Child1 클래스의 num 사용
		System.out.println("Child1클래스의 num필드에 접근");
		
		c1.setNum(99);
		
		System.out.println("Child1안에 있는 num : " + c1.getNum());
		
		// Child2 클래스의 str 필드에 접근
		System.out.println("Child2클래스의 str필드에 접근");
		
		Child2 c2 = new Child2();
		c2.setStr("World");
		
		System.out.println("Child2안에 있는 str : " + c2.getStr());
		
		
		
		System.out.println("Child2클래스의 str필드에 접근");
//		c2.num;
		//The field Parent.num is not visible
		
		c2.setNum(99);
		
		System.out.println("Child2안에 있는 num : " + c2.getNum());
		System.out.println("Parent안에 있는 num : " + p.getNum());
		
	}

}
