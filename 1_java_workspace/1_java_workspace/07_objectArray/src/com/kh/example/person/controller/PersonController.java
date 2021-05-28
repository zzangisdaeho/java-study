package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {

	public Person[] method1() {
		Person[] pArr = new Person[5]; //Person 객체가 들어갈 수 있는 5개 공간 생성
		// 객체 배열은 객체(레퍼런스 변수)가 들어가는 배열
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		
		}
		
		pArr[0] = new Person("박신우", 20, '여', 160.2, 99.99);
		pArr[1] = new Person("강건강", 60, '남', 172.3, 68.8);
		pArr[2] = new Person("남나눔", 14, '남', 164.8, 58.1);
		pArr[3] = new Person("도대담", 34, '남', 178.4, 71.2);
		pArr[4] = new Person("류라라", 24, '여', 167.6, 54.8);
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
			
		}
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
			
		}
		return pArr;
	}
	public void method2() {
		Person[] pArr = {new Person("박신우", 20, '여', 160.2, 99.99),
				new Person("강건강", 60, '남', 172.3, 68.8),
				new Person("남나눔", 14, '남', 164.8, 58.1),
				new Person("도대담", 34, '남', 178.4, 71.2),
				new Person("류라라", 24, '여', 167.6, 54.8)};
		
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
	
	
	}
}
