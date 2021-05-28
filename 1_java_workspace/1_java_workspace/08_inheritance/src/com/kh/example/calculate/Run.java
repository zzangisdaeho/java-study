package com.kh.example.calculate;

class Anum{
	int compute(int num) {
		System.out.println("A coming");
		if( num >= 1 ) {
			System.out.println(num);
			return num;
		}
		return compute(num-1) + compute(num-2);
	}
}

class Bnum extends Anum {
	int compute(int num) {
		System.out.println("B coming");
		if(num <=1) {
			System.out.println(num);
			return num;
		}
		return compute(num-1) + compute(num-3);
	}
}

public class Run {
	

	public static void main(String[] args) {
		
		Anum obj = new Bnum();
		
		// 오버라이드 되어있으면 자식의 자료를 부모로 받아도 자식의 것을 사용한다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		System.out.println(obj.compute(4));
		
		Anum obj2 = new Anum();
		
		System.out.println(obj2.compute(4));
		
		
	}

}
