package com.kh.example.chap02_abstractNinterface.family.controller;

import com.kh.example.chap02_abstractNinterface.family.model.vo.Baby;
import com.kh.example.chap02_abstractNinterface.family.model.vo.Basic;
import com.kh.example.chap02_abstractNinterface.family.model.vo.Family;
import com.kh.example.chap02_abstractNinterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
		// Family, Mother, Baby Ŭ������ �߻�Ŭ���� �׽�Ʈ
//		Family f = new Family();
		//Cannot instantiate the type Family
		//Family�� �߻�Ŭ������ ������ ��ü ���� �Ұ���
		Family f1;
		Family f2; // Ŭ���� Ÿ�� ���۷����δ� ��� ����
		
		//������ ����
		f1 = new Mother("��Ӵ�", 50, 70, "���") ;
		f2 = new Baby("���̺�", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println();
		System.out.println("==== ������ �Ǿ��� ====");
		
		f1.eat(); // ���� �� ���� -> ������ +10, �ǰ� -5
		f2.eat(); // �ֱ� �� ���� -> ������ +3, �ǰ� +1
		
		f1.sleep(); // ���� �� -> �ǰ� + 10;
		f2.sleep(); // �ֱ� �� -> �ǰ� +3
		
		System.out.println("==== ���� �� ====");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println();
		
		f1.overrideTest();
		f2.overrideTest();
		
//		Basic b = new Basic(); // �������̽� ��ü ���� �Ұ�
		// ���۷��� ������ ��� ����
//		Basic b1 = new Mother("��Ӵ�", 50, 70, "���");
//		Basic b2 = new Baby("�Ʊ�", 3.5, 70);
//		
//		((Mother)b1).overrideTest();
//		((Baby)b2).overrideTest();
	}
}
