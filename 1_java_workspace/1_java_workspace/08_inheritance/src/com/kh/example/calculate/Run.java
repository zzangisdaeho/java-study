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
		
		// �������̵� �Ǿ������� �ڽ��� �ڷḦ �θ�� �޾Ƶ� �ڽ��� ���� ����Ѵ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		System.out.println(obj.compute(4));
		
		Anum obj2 = new Anum();
		
		System.out.println(obj2.compute(4));
		
		
	}

}
