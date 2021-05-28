package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	public void method() {
		// 1. �θ� Ÿ�� ���۷����� �θ� ��ü�� �ٷ� ��
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p1 = new Parent();
		// ���θ�Ÿ�� ���۷���		�� �θ� ��ü
		p1.printParent();
		// p1 ���۷��� ������ Parent���� ���� ����
		
		System.out.println();
		
		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ� ��
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		// �� �ڽ�Ÿ�� ���۷���		�� �ڽ� ��ü
		c1.printChild1(); // �ڱ� �ȿ� �ִ� �޼ҵ� ���� ����
		c1.printParent(); // �ڱ� �ȿ� �θ� ������ �θ� �޼ҵ忡�� ���� ����
		
		System.out.println();
		
		// 3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ� ��
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = new Child2(); // ������ ����
		// �� ĳ����
		//	�θ� Ÿ���� ������ ������ ��� �ڽ� ��ü�� ���� �� �ִ� ��
		//	����ȯ ���� ����
		//	��, p2�� Parent�� ����
		p2.printParent();
//		p2.printChild2(); // undefined
		((Child2)p2).printChild2();
		// �ٿ� ĳ����
		//	�θ� Ÿ���� ������ ������ �ڽ��� ���� ���� ������
		//	�ȿ� �ִ� �ڽ� ��ü�� �� ���� ����
		//	�ڽ� ��ü�� �����ϱ� ���ؼ��� �ڽ� Ÿ������ ����ȯ�� �ʿ��ѵ� �� �� ����ȯ�� ���� �Ұ���
		
		System.out.println();
		
		// 4. �ڽ� Ÿ�� ���۷����� �θ� ��ü�� �ٷ� ��
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
//		Child2 c2 = new Parent(); //Type mismatch: cannot convert from Parent to Child2
//		Child2 c2 = (Child2)(new Parent());
//		Child2 c2 = (Child2)p1;
		
		
		System.out.println();
		
		System.out.println("==== ���� ���� ====");
		System.out.println();
		
//		Child1 cd1 = new Child1();
//		Child2 cd2 = new Child2();
		
		Parent[] pArr = new Parent[4];
//		Parent[] pArr1 = new Child1[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
		for(int i = 0; i < pArr.length; i++) {
			if (pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}
			else if (pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print(); // ���� ���ε� : �ڽİ�ü�� �������̵��� �Ǿ� ������ ���� �޼ҵ带 ���ĳ��� �������̵� �Ȱ��� �켱�ϰ� �Ǵ� ����. print�� parent���� �ִ� ����̶� ���̱� �� ���̰�, �������̵��Ȱ� �ν��ϴ°� �ڹ� ����̴�.
		}
		
		
		
	}
	
}
