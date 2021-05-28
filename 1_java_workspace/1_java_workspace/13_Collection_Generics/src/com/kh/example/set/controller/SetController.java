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
		
		// add(E e) : set 안에 e 추가
		set.add(new Dog("모모", 8.1));
		set.add(new Dog("코코", 5.0));
		set.add(new Dog("송송", 2.5));
		System.out.println(set.add(new Dog("송히", 3.0)));
		System.out.println(set.add(new Dog("송히", 3.0)));
		
//		System.out.println(set);
		
		set.add(new Dog("모모", 10.1)); // 새로운 객체를 넣었기 때문에 새로운 주소값으로 넣기 때문에 새로운것으로 인식. 값을 비교하기 위헤 equals와 hashcode를 넣어준다.
		System.out.println("모모 추가 후 " + set);
		
		
		Set<Dog> set2 = new LinkedHashSet<Dog>(); // Linked는 서로 화살표가 있어서 순서를 알 수 있다. 중복은 안된다.
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println(set2);
		
		
		Set<Dog> set3 = new TreeSet<Dog>();
		set3.add(new Dog("초코", 2.1));
		set3.add(new Dog("콩이", 8.3));
		set3.add(new Dog("두부", 5.0));
		set3.add(new Dog("초코", 6.1));
		set3.add(new Dog("로이", 6.1));
		set3.add(new Dog("공주", 5.2));
		set3.add(new Dog("왕자", 9.5));
		set3.add(new Dog("조이", 12.5));
		System.out.println("set3" + set3);  // 이름만 보고 비교하면서 넣기 때문에 이름만 같아도 빠진다.
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.0));
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("로이", 6.1));
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
		System.out.println(set4);
		
		// 요소 하나하나 접근하기
		// 방법1. addAll() 통해서 set에 넣은 객체들을 모두 list에 넣어주기
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=====================");
		// 방법2. iterator() 사용하기 -> 단방향. 재사용 불가
		// iterator는 인덱스개념이 아니라 맨 처음 요소 앞에서 시작하여 순차대로 체크해 나가고 마지막에 끝난다(없어진다)
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println("re : "+it.next());
			// it은 위에 while문에서 끝났기 때문에 사용 후 버려진다. 재사용 불가능하다.
			
		}
	}
}
