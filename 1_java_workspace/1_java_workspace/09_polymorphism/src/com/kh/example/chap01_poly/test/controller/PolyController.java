package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	public void method() {
		// 1. 부모 타입 레퍼런스로 부모 객체를 다룰 때
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		// ㄴ부모타입 레퍼런스		ㄴ 부모 객체
		p1.printParent();
		// p1 래퍼런스 변수로 Parent에만 접근 가능
		
		System.out.println();
		
		// 2. 자식 타입 레퍼런스로 자식 객체를 다룰 때
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// ㄴ 자식타입 래퍼런스		ㄴ 자식 객체
		c1.printChild1(); // 자기 안에 있는 메소드 접근 가능
		c1.printParent(); // 자기 안에 부모도 있으니 부모 메소드에도 접근 가능
		
		System.out.println();
		
		// 3. 부모 타입 레퍼런스로 자식 객체를 다룰 때
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2(); // 다형성 적용
		// 업 캐스팅
		//	부모 타입의 참조형 변수가 모든 자식 객체를 받을 수 있는 것
		//	형변환 생략 가능
		//	단, p2는 Parent만 보임
		p2.printParent();
//		p2.printChild2(); // undefined
		((Child2)p2).printChild2();
		// 다운 캐스팅
		//	부모 타입의 참조형 변수가 자식을 받을 수는 있지만
		//	안에 있는 자식 객체를 볼 수는 없음
		//	자식 객체에 접근하기 위해서는 자식 타입으로 형변환이 필요한데 이 때 형변환은 생략 불가능
		
		System.out.println();
		
		// 4. 자식 타입 레퍼런스로 부모 객체를 다룰 때
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		Child2 c2 = new Parent(); //Type mismatch: cannot convert from Parent to Child2
//		Child2 c2 = (Child2)(new Parent());
//		Child2 c2 = (Child2)p1;
		
		
		System.out.println();
		
		System.out.println("==== 간단 예제 ====");
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
			pArr[i].print(); // 동적 바인딩 : 자식개체에 오버라이딩이 되어 있을때 기존 메소드를 제쳐놓고 오버라이드 된것을 우선하게 되는 현상. print는 parent에도 있는 기능이라 보이긴 할 것이고, 오버라이딩된거 인식하는건 자바 기능이다.
		}
		
		
		
	}
	
}
