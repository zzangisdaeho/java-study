package com.kh.example.array;

import java.util.Arrays;

public class A_Array {
	// 배열은 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	// 인덱스는 0부터 시작
	// 
	// 배열 선언
	//    자료형[] 배열명;
	//    자료형 배열명[]; ==> 이렇게만 하면 사용 불가능
	// 배열 할당
	//    자료형[] 배열명 = new 자료형[배열크기];
	//    자료형 배열명[] = new 자료형[배열크기];
	//    Heap 영역에 new 연산자를 통해 공간이 배열크기만큼 생성
	//    생성이 되는 순간 그 공간에 대한 주소 값이 생김
	//    주소 값은 Stack에 있는 배열명 공간에 대입됨 (참조하고 있음)
	// 배열 초기화
	//    1. 인덱스 이용
	//    2. for문 이용 : 규칙이 있어야 사용 가능
	//    3. 선언과 동시에 초기화
	public void method1() {
		// 배열 사용 이유 == 배열의 편리함
		//변수 여러 개 사용 
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		sum1 += num6;
		sum1 += num7;
		sum1 += num8;
		sum1 += num9; // 연산 하나도 다 일일이 더해줘야 함;;;
		
		
		int[] arr= new int[9]; // 배열 할당
		// 1. 인덱스를 이용한 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100; //index범위에서 벗어남
		
		
		// 2. 반복문을 이용한 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*10 ;
		}
		for (int i = 0 ; i < arr.length ; i++) {
			sum1 += arr[i];
		}
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		// 3. 선언과 동시에 초기화
		String[] strArr = {"치킨", "피자", "햄버거", "도넛", "감자튀김", "핫도그", "콜라", "사이다"};
		
		String[] strArr2 = new String[] {"배고프니까", "그만할까?"};
		
		double[] dArr = new double[10];
		
		System.out.println(arr);
		System.out.println(strArr);
		System.out.println(dArr);
		
	}
	public void method2() {
		int[] iArr = new int[5];
		
		for(int i = 0; i<iArr.length ; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		
		System.out.println("iArr의 주소 :" + iArr);
		
		iArr = new int[10];
		for(int i = 0; i<iArr.length ; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		System.out.println("iArr의 주소 :" + iArr);
	}
	
	public void method3() {
		int[] iArr = {2,5,4,6,1,3};
		
		for (int i = 0 ; i < iArr.length; i++) {
			if (i == (iArr.length-1)) {
				System.out.print(iArr[i]);
			}
			else {
				System.out.print(iArr[i]+ ", ");
			}
		}
		
		System.out.println();
		Arrays.sort(iArr);
		System.out.println();
		
		for (int i = 0 ; i < iArr.length; i++) {
			if (i == (iArr.length-1)) {
				System.out.print(iArr[i]);
			}
			else {
				System.out.print(iArr[i]+ ", ");
			}
		}
		
	}
	
	
	
	
	
}
