package com.kh.example.array;

import java.util.Arrays;

public class A_Array {
	// �迭�� ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	// �ε����� 0���� ����
	// 
	// �迭 ����
	//    �ڷ���[] �迭��;
	//    �ڷ��� �迭��[]; ==> �̷��Ը� �ϸ� ��� �Ұ���
	// �迭 �Ҵ�
	//    �ڷ���[] �迭�� = new �ڷ���[�迭ũ��];
	//    �ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
	//    Heap ������ new �����ڸ� ���� ������ �迭ũ�⸸ŭ ����
	//    ������ �Ǵ� ���� �� ������ ���� �ּ� ���� ����
	//    �ּ� ���� Stack�� �ִ� �迭�� ������ ���Ե� (�����ϰ� ����)
	// �迭 �ʱ�ȭ
	//    1. �ε��� �̿�
	//    2. for�� �̿� : ��Ģ�� �־�� ��� ����
	//    3. ����� ���ÿ� �ʱ�ȭ
	public void method1() {
		// �迭 ��� ���� == �迭�� ����
		//���� ���� �� ��� 
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
		sum1 += num9; // ���� �ϳ��� �� ������ ������� ��;;;
		
		
		int[] arr= new int[9]; // �迭 �Ҵ�
		// 1. �ε����� �̿��� �ʱ�ȭ
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100; //index�������� ���
		
		
		// 2. �ݺ����� �̿��� �ʱ�ȭ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*10 ;
		}
		for (int i = 0 ; i < arr.length ; i++) {
			sum1 += arr[i];
		}
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		// 3. ����� ���ÿ� �ʱ�ȭ
		String[] strArr = {"ġŲ", "����", "�ܹ���", "����", "����Ƣ��", "�ֵ���", "�ݶ�", "���̴�"};
		
		String[] strArr2 = new String[] {"������ϱ�", "�׸��ұ�?"};
		
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
		
		System.out.println("iArr�� �ּ� :" + iArr);
		
		iArr = new int[10];
		for(int i = 0; i<iArr.length ; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		System.out.println("iArr�� �ּ� :" + iArr);
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
