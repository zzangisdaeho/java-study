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
//		�޼ҵ� �ȿ��� ������ ������ ���������� �ٸ� �޼ҵ忡�� ��� �Ұ����ϴ�.
//	}
	
	public void see3() {
//		System.out.println(pc.method1().pArr[1]);
		// �ٸ� Ŭ������ �޼ҵ忡�� ������ ���������� ���� �ҷ����°� �Ұ����ϴ�. ����! �����ϱ�
		// ��� �ش� �޼ҵ��� ���ϰ����� �ּҸ� �����ͼ� �����Ͽ� �� �� �ִ�.
	}
	
}
