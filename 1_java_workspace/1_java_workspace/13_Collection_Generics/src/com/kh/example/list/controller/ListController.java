package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		List listl = new ArrayList(); // List�� ArrayList�� �θ�
		// �÷����� Ÿ���� ���س��� ������ Object�� �޵��� �Ǿ�����. default���� Object�ΰ�
		List<Student> list = new ArrayList<Student>(3); 
		// <E> : ���׸��̶� �θ�
		// e = element = the type of elements in this list
		// ���׸����� Ŭ������ ��� �Ѵ�.
		// ���׸��� ����ϴ� ����
		// 1. ����� �� ���� Ÿ���� ��ü�� �����ϵ��� ���������ν� ���� �� �ٸ� Ÿ���� ������� ���ϵ��� ��
		//	�÷��ǿ��� ����� ��ü�� ���� ����� ��, ��ü�� ������ ���� �Ź� Ÿ���� Ȯ���ϰ� ����ȯ�ϴ� ������ ���� �� ����.
		// 2. �÷���, ���ٽ�, ��Ʈ��, NIO���� ���� ����
		
		// add(E e) : ����Ʈ ���� ������ e �߰�. append��
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));
		System.out.println("list : " + list);
		
		// �÷����� ����
		// ����1. ũ���� ������ ����
		list.add(new Student("������", 90));
		list.add(new Student("����ȣ", 85));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		
		// ����2. �߰�/����/���� ���ó�� ����
		list.add(new Student("���̹�", 66));
		System.out.println("list : " + list);
		
		// add(int index, E e) : index��° �ε����� E �߰�
		list.add(0, new Student("�����", 100));
		System.out.println("list : " + list);
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : �ش� index��° ��ü ����
		list.remove(1);
		System.out.println("list : " + list);
		// remove(Object o) : �ش� Object ��ü ����
		list.remove(new Student("���ǰ�", 40));
		System.out.println("list : " + list);
		// new ����� ������ heap������ ���ο� ������ �����ϸ� �ּҰ��� ��ȯ�ϱ� ������ ���� ���ǰ��� �ٸ����� ���ϰ� �ִ�.
		// ���� ���Ͽ� �����ϰ��� �ϸ�, equals��  hashcode�� ���� �޼ҵ带 �������̵� ������Ѵ�. (equals�� �����ϸ� hashcode�� �������ִ°� �ڹ��� �Ծ�)
		// ��equals�� �������� remove() �޼��� �ȿ� �ִ� equals�� ����ؼ� ���� �� �ְԵȴ�.
		
		// ���� ��� �� ����
		// 1. Collections Ŭ���� �ȿ� �ִ� sort() �̿� -> Collection�� ����Ҷ� ������ �޼ҵ���� ���ִ� Ŭ����
		Collections.sort(list); 
		System.out.println("Collections.sort() : " + list);
		// The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Student>)
		// ����Ʈ �ȿ��� � �׸� ���� �����Ҳ��� �Ƚ������ ������ ��� ������ �� ����
		
		
		// Comparable : java.lang ��Ű��. �Ѱ��� �������θ� ������ �ϰ� ������ ���
		//				Ŭ���� �ȿ��� compareTo �������̵��ؼ� Collections.sort(list) ���
		
		// Comparator : Java.util ��Ű��. �������� �������� ������ �ϰ� ������ ��� (���Ŀ켱������ ����)
		//				������ Comparator �������̽��� implements �� Ŭ������ �����Ͽ� List.sort(Comparator Ŭ�����̸�) ���
		
		// 2. List �ȿ� �ִ� sort() �̿�
		
		list.sort(new StudentComparator());
//		list.sort(null);
		System.out.println("list.sort() : " + list);
		
		// set(int index, E e) : index��° �ε����� �ִ� ��Ҹ� e�� ����
		list.set(1, new Student("�����", 31));
		System.out.println("list : " + list);
		
		// get(int index) : index��° �ε����� �ִ� ��� ������ ��(Object ��ȯ)
		Student s = list.get(2);
		System.out.println(s);
		
		// subList(int index1, int index2) : index1 ��° �ε������� index2 ��° �ε��������� ����Ʈ ��ȯ
		System.out.println(list.subList(2, 5));
		
		// contain(Object o) : o�� ����Ʈ�� �����Ѵٸ� true ��ȯ
		// indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, �������� ������ -1 ��ȯ
		if(list.contains(new Student("������", 90))) {
			int index = list.indexOf(new Student("������", 90));
			System.out.println(index);
		}
		
		// clear() : ����� ��� ��ü ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list�� �������? :" + list.isEmpty());
	}
}