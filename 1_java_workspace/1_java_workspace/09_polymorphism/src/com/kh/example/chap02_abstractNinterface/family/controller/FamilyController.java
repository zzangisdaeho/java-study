package com.kh.example.chap02_abstractNinterface.family.controller;

import com.kh.example.chap02_abstractNinterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNinterface.family.model.vo.Basic;
import com.kh.example.chap02_abstractNinterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNinterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
		// Family, Mother, Baby 클래스로 추상클래스 테스트
//		Family f = new Family();
		//Cannot instantiate the type Family
		//Family가 추상클래스기 때문에 객체 생성 불가능
		Family f1;
		Family f2; // 클래스 타입 레퍼런스로는 사용 가능
		
		//다형성 적용
		f1 = new Mother("어머니", 50, 70, "출산") ;
		f2 = new Baby("베이비", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println();
		System.out.println("==== 저녁이 되었다 ====");
		
		f1.eat(); // 엄마 밥 먹음 -> 몸무게 +10, 건강 -5
		f2.eat(); // 애기 밥 먹음 -> 몸무게 +3, 건강 +1
		
		f1.sleep(); // 엄마 잠 -> 건강 + 10;
		f2.sleep(); // 애기 잠 -> 건강 +3
		
		System.out.println("==== 다음 날 ====");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println();
		
		f1.overrideTest();
		f2.overrideTest();
		
//		Basic b = new Basic(); // 인터페이스 객체 생성 불가
		// 레퍼런스 변수로 사용 가능
//		Basic b1 = new Mother("어머니", 50, 70, "출산");
//		Basic b2 = new Baby("아기", 3.5, 70);
//		
//		((Mother)b1).overrideTest();
//		((Baby)b2).overrideTest();
	}
}
