package com.kh.variable;

public class C_Cast {
	public void rule(){
		//형변환에서 boolean은 제외됨
		boolean flag = true;
		//flag = 100;
		//int를 boolean으로 바꿀 수 없음
		
		//문자(2byte)와 숫자 사이의 항변환
		int num = 'A'; //문자 하나는 유니코드값으로 숫자가 지정되어있어 가능
		System.out.println("num : "+num);
		
		char ch = 97;
		System.out.println("ch : "+ch);
		
		char ch2 = (char)num;
		System.out.println("ch2 : "+ch2);
		
		int num2 = -1234567890;
		char ch3 = (char)num2;
		System.out.println("ch3 : "+ch3);
	}
	public void rule2() {
		// 다른 자료형 끼리의 연산은 큰 자료형으로 자동 형변환 후에 연산처리
		int iNum = 10;
		long lNum = 100;
		//int sum = iNum + lNum;
		
		//방법1. 수행 결과를 int로 강제 형변환하기
		int sum1 = (int)(iNum + lNum);
		
		//방법2. Long형을 int로 강제 형변환하기
		int sum2 = iNum + (int)lNum;
		
		//방법3. 결과 값을 long형으로 받기
		long sum3 = iNum + lNum;
		System.out.println(sum3);
	}
	public void dataLoss() {
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
	}
}
