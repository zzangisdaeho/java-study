package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		List listl = new ArrayList(); // List는 ArrayList의 부모
		// 컬렉션은 타입을 정해놓지 않으면 Object를 받도록 되어있음. default값이 Object인거
		List<Student> list = new ArrayList<Student>(3); 
		// <E> : 제네릭이라 부름
		// e = element = the type of elements in this list
		// 제네릭에는 클래스만 써야 한다.
		// 제네릭을 사용하는 이유
		// 1. 명시한 한 가지 타입의 객체만 저장하도록 설정함으로써 저장 시 다른 타입이 저장되지 못하도록 함
		//	컬렉션에서 저장된 객체를 꺼내 사용할 때, 객체의 종류에 따라 매번 타입을 확인하고 형변환하는 절차를 없엘 수 있음.
		// 2. 컬렉션, 람다식, 스트림, NIO에서 많이 쓰임
		
		// add(E e) : 리스트 끝에 데이터 e 추가. append삘
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		System.out.println("list : " + list);
		
		// 컬렉션의 장점
		// 장점1. 크기의 제약이 없다
		list.add(new Student("남나눔", 90));
		list.add(new Student("하헌호", 85));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		
		// 장점2. 추가/삭제/정렬 기능처리 간단
		list.add(new Student("문미미", 66));
		System.out.println("list : " + list);
		
		// add(int index, E e) : index번째 인덱스에 E 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);
		System.out.println("list : " + list);
		// remove(Object o) : 해당 Object 객체 삭제
		list.remove(new Student("강건강", 40));
		System.out.println("list : " + list);
		// new 예약어 때문에 heap영역에 새로운 공간을 생성하며 주소값을 반환하기 때문에 기존 강건강과 다른것을 비교하고 있다.
		// 값을 비교하여 삭제하고자 하면, equals와  hashcode와 같은 메소드를 오버라이딩 해줘야한다. (equals를 수정하면 hashcode도 수정해주는게 자바의 규약)
		// ★equals를 만들어줘야 remove() 메서드 안에 있는 equals를 사용해서 지울 수 있게된다.
		
		// 정렬 방법 두 가지
		// 1. Collections 클래스 안에 있는 sort() 이용 -> Collection을 사용할때 유용한 메소드들이 모여있는 클래스
		Collections.sort(list); 
		System.out.println("Collections.sort() : " + list);
		// The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Student>)
		// 리스트 안에서 어떤 항목에 대해 정렬할껀지 안써놓으니 기준이 없어서 정렬할 수 없음
		
		
		// Comparable : java.lang 패키지. 한가지 기준으로만 정렬을 하고 싶을때 사용
		//				클래스 안에서 compareTo 오버라이딩해서 Collections.sort(list) 사용
		
		// Comparator : Java.util 패키지. 여러가지 기준으로 정렬을 하고 싶을때 사용 (정렬우선순위는 있음)
		//				별도의 Comparator 인터페이스를 implements 한 클래스를 생성하여 List.sort(Comparator 클래스이름) 사용
		
		// 2. List 안에 있는 sort() 이용
		
		list.sort(new StudentComparator());
//		list.sort(null);
		System.out.println("list.sort() : " + list);
		
		// set(int index, E e) : index번째 인덱스에 있는 요소를 e로 수정
		list.set(1, new Student("도대담", 31));
		System.out.println("list : " + list);
		
		// get(int index) : index번째 인덱스에 있는 요소 가지고 옴(Object 반환)
		Student s = list.get(2);
		System.out.println(s);
		
		// subList(int index1, int index2) : index1 번째 인덱스부터 index2 번째 인덱스까지의 리스트 반환
		System.out.println(list.subList(2, 5));
		
		// contain(Object o) : o가 리스트에 존재한다면 true 반환
		// indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 존재하지 않으면 -1 반환
		if(list.contains(new Student("남나눔", 90))) {
			int index = list.indexOf(new Student("남나눔", 90));
			System.out.println(index);
		}
		
		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list가 비었나요? :" + list.isEmpty());
	}
}