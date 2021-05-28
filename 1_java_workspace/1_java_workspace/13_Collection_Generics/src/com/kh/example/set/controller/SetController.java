package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		Set<Dog> set = new HashSet<Dog>();
		
		// add(E e) : set �ȿ� e �߰�
		set.add(new Dog("���", 8.1));
		set.add(new Dog("����", 5.0));
		set.add(new Dog("�ۼ�", 2.5));
		System.out.println(set.add(new Dog("����", 3.0)));
		System.out.println(set.add(new Dog("����", 3.0)));
		
//		System.out.println(set);
		
		set.add(new Dog("���", 10.1)); // ���ο� ��ü�� �־��� ������ ���ο� �ּҰ����� �ֱ� ������ ���ο������ �ν�. ���� ���ϱ� ���� equals�� hashcode�� �־��ش�.
		System.out.println("��� �߰� �� " + set);
		
		
		Set<Dog> set2 = new LinkedHashSet<Dog>(); // Linked�� ���� ȭ��ǥ�� �־ ������ �� �� �ִ�. �ߺ��� �ȵȴ�.
		set2.add(new Dog("����", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
		System.out.println(set2);
		
		
		Set<Dog> set3 = new TreeSet<Dog>();
		set3.add(new Dog("����", 2.1));
		set3.add(new Dog("����", 8.3));
		set3.add(new Dog("�κ�", 5.0));
		set3.add(new Dog("����", 6.1));
		set3.add(new Dog("����", 6.1));
		set3.add(new Dog("����", 5.2));
		set3.add(new Dog("����", 9.5));
		set3.add(new Dog("����", 12.5));
		System.out.println("set3" + set3);  // �̸��� ���� ���ϸ鼭 �ֱ� ������ �̸��� ���Ƶ� ������.
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("����", 2.1));
		set4.add(new Dog("����", 8.3));
		set4.add(new Dog("�κ�", 5.0));
		set4.add(new Dog("����", 6.1));
		set4.add(new Dog("����", 6.1));
		set4.add(new Dog("����", 5.2));
		set4.add(new Dog("����", 9.5));
		set4.add(new Dog("����", 12.5));
		System.out.println(set4);
		
		// ��� �ϳ��ϳ� �����ϱ�
		// ���1. addAll() ���ؼ� set�� ���� ��ü���� ��� list�� �־��ֱ�
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=====================");
		// ���2. iterator() ����ϱ� -> �ܹ���. ���� �Ұ�
		// iterator�� �ε��������� �ƴ϶� �� ó�� ��� �տ��� �����Ͽ� ������� üũ�� ������ �������� ������(��������)
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println("re : "+it.next());
			// it�� ���� while������ ������ ������ ��� �� ��������. ���� �Ұ����ϴ�.
			
		}
	}
}
