package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		// 얕은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		System.out.print("originArr : ");
		for (int i = 0 ; i < originArr.length; i++) {
			if (i == (originArr.length-1)) {
				System.out.print(originArr[i]);
				System.out.println();
			}
			else {
				System.out.print(originArr[i]+ ", ");
			}
		}
		System.out.print("copyArr : ");
		for (int i = 0 ; i < copyArr.length; i++) {
			if (i == (copyArr.length-1)) {
				System.out.print(copyArr[i]);
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
		originArr[4] = 99;  // 4번째 index를 변화시키면 
		System.out.println("원본 배열의 5번째 index를 99로 변경");
		
		System.out.print("originArr : ");
		for (int i = 0 ; i < originArr.length; i++) {
			if (i == (originArr.length-1)) {
				System.out.print(originArr[i]);
				System.out.println();
			}
			else {
				System.out.print(originArr[i]+ ", ");
			}
		}
		System.out.print("copyArr : ");
		for (int i = 0 ; i < copyArr.length; i++) {
			if (i == (copyArr.length-1)) {
				System.out.print(copyArr[i]); // copy본도 변화한다.
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
		System.out.println("originArr의 주소 : "+originArr);
		System.out.println("copyArr의 주소 : "+copyArr); // 두 주소가 같을 수 밖에 없음
		
	}
	public void method2() {
		// 깊은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length];
		
		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		System.out.print("originArr : ");
		for (int i = 0 ; i < originArr.length; i++) {
			if (i == (originArr.length-1)) {
				System.out.print(originArr[i]);
				System.out.println();
			}
			else {
				System.out.print(originArr[i]+ ", ");
			}
		}
		System.out.print("copyArr : ");
		for (int i = 0 ; i < copyArr.length; i++) {
			if (i == (copyArr.length-1)) {
				System.out.print(copyArr[i]);
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		originArr[4] = 99;  // 4번째 index를 변화시켜도
		System.out.println("원본 배열의 4번째 index를 99로 변경");
		
		System.out.print("originArr : ");
		for (int i = 0 ; i < originArr.length; i++) {
			if (i == (originArr.length-1)) {
				System.out.print(originArr[i]);
				System.out.println();
			}
			else {
				System.out.print(originArr[i]+ ", ");
			}
		}
		System.out.print("copyArr : ");
		for (int i = 0 ; i < copyArr.length; i++) {
			if (i == (copyArr.length-1)) {
				System.out.print(copyArr[i]);	// copy에는 영향 없음
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
		System.out.println("originArr의 주소 : "+originArr);
		System.out.println("copyArr의 주소 : "+copyArr); // 두 배열의 주소는 다를수 밖에 없음
	}
	public void method3() {
		// 2. 깊은 복사 : arraycopy() 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length];
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		// src		: 원본 배열
		// secPos	: 원본 배열에서 복사할 시작 위치
		// dest		: 복사 배열
		// destPos	: 복사 배열에서 붙여넣을 시작 위치
		// length	: 복사 길이
		
		System.arraycopy(originArr, 0, copyArr, 3, 2);
		
		
		System.out.print("originArr : ");
		for (int i = 0 ; i < originArr.length; i++) {
			if (i == (originArr.length-1)) {
				System.out.print(originArr[i]);
				System.out.println();
			}
			else {
				System.out.print(originArr[i]+ ", ");
			}
		}
		System.out.print("copyArr : ");
		for (int i = 0 ; i < copyArr.length; i++) {
			if (i == (copyArr.length-1)) {
				System.out.print(copyArr[i]);
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
	}
	public void method4() {
		// 2. 깊은 복사 : copyOf() 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length*2];
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.print("originArr : ");
		for (int i = 0 ; i < originArr.length; i++) {
			if (i == (originArr.length-1)) {
				System.out.print(originArr[i]);
				System.out.println();
			}
			else {
				System.out.print(originArr[i]+ ", ");
			}
		}
		System.out.print("copyArr : ");
		for (int i = 0 ; i < copyArr.length; i++) {
			if (i == (copyArr.length-1)) {
				System.out.print(copyArr[i]);
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
	}
}
