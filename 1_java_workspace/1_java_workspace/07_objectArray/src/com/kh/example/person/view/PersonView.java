package com.kh.example.person.view;

import com.kh.example.person.controller.PersonController;
import com.kh.example.person.model.vo.Person;

public class PersonView {
	PersonController pc = new PersonController();
	
	public void see() {
		Person[] pp = pc.method1();
		System.out.println(pp[1].personInfo());
	}
	
//	public void see2() {
//		System.out.println(pp[1].personInfo());
//		메소드 안에서 생성한 변수는 지역변수라서 다른 메소드에서 사용 불가능하다.
//	}
	
	public void see3() {
//		System.out.println(pc.method1().pArr[1]);
		// 다른 클래스의 메소드에서 생성한 지역변수도 직접 불러오는건 불가능하다. 지역! 변수니까
		// 대신 해당 메소드의 리턴값으로 주소를 보내와서 복사하여 쓸 순 있다.
	}
	
}
