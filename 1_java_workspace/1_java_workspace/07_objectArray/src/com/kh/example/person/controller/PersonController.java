package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {

	public Person[] method1() {
		Person[] pArr = new Person[5]; //Person ��ü�� �� �� �ִ� 5�� ���� ����
		// ��ü �迭�� ��ü(���۷��� ����)�� ���� �迭
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		
		}
		
		pArr[0] = new Person("�ڽſ�", 20, '��', 160.2, 99.99);
		pArr[1] = new Person("���ǰ�", 60, '��', 172.3, 68.8);
		pArr[2] = new Person("������", 14, '��', 164.8, 58.1);
		pArr[3] = new Person("�����", 34, '��', 178.4, 71.2);
		pArr[4] = new Person("�����", 24, '��', 167.6, 54.8);
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
			
		}
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
			
		}
		return pArr;
	}
	public void method2() {
		Person[] pArr = {new Person("�ڽſ�", 20, '��', 160.2, 99.99),
				new Person("���ǰ�", 60, '��', 172.3, 68.8),
				new Person("������", 14, '��', 164.8, 58.1),
				new Person("�����", 34, '��', 178.4, 71.2),
				new Person("�����", 24, '��', 167.6, 54.8)};
		
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
	
	
	}
}
