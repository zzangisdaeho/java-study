package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		// ���� ����
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
		
		originArr[4] = 99;  // 4��° index�� ��ȭ��Ű�� 
		System.out.println("���� �迭�� 5��° index�� 99�� ����");
		
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
				System.out.print(copyArr[i]); // copy���� ��ȭ�Ѵ�.
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
		System.out.println("originArr�� �ּ� : "+originArr);
		System.out.println("copyArr�� �ּ� : "+copyArr); // �� �ּҰ� ���� �� �ۿ� ����
		
	}
	public void method2() {
		// ���� ����
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
		originArr[4] = 99;  // 4��° index�� ��ȭ���ѵ�
		System.out.println("���� �迭�� 4��° index�� 99�� ����");
		
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
				System.out.print(copyArr[i]);	// copy���� ���� ����
				System.out.println();
			}
			else {
				System.out.print(copyArr[i]+ ", ");
			}
		}
		
		System.out.println("originArr�� �ּ� : "+originArr);
		System.out.println("copyArr�� �ּ� : "+copyArr); // �� �迭�� �ּҴ� �ٸ��� �ۿ� ����
	}
	public void method3() {
		// 2. ���� ���� : arraycopy() �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length];
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		// src		: ���� �迭
		// secPos	: ���� �迭���� ������ ���� ��ġ
		// dest		: ���� �迭
		// destPos	: ���� �迭���� �ٿ����� ���� ��ġ
		// length	: ���� ����
		
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
		// 2. ���� ���� : copyOf() �̿�
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
