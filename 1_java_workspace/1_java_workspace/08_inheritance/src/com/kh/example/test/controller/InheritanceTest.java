package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {

	public void method() {
		// Parent Ŭ������ num�ʵ忡 ����
		System.out.println("ParentŬ������ num�ʵ� ����");
		
		Parent p = new Parent();
		p.setNum(9);
		
		System.out.println("Parent�ȿ� �ִ� num : " + p.getNum());
		
		// Child1 Ŭ������ str�ʵ忡 ����
		System.out.println("Child1Ŭ������ str�ʵ忡 ����");
		
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		
		System.out.println("Child1�ȿ� �ִ� str : " + c1.getStr());
		
		// Child1 Ŭ������ num ���
		System.out.println("Child1Ŭ������ num�ʵ忡 ����");
		
		c1.setNum(99);
		
		System.out.println("Child1�ȿ� �ִ� num : " + c1.getNum());
		
		// Child2 Ŭ������ str �ʵ忡 ����
		System.out.println("Child2Ŭ������ str�ʵ忡 ����");
		
		Child2 c2 = new Child2();
		c2.setStr("World");
		
		System.out.println("Child2�ȿ� �ִ� str : " + c2.getStr());
		
		
		
		System.out.println("Child2Ŭ������ str�ʵ忡 ����");
//		c2.num;
		//The field Parent.num is not visible
		
		c2.setNum(99);
		
		System.out.println("Child2�ȿ� �ִ� num : " + c2.getNum());
		System.out.println("Parent�ȿ� �ִ� num : " + p.getNum());
		
	}

}
