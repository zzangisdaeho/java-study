package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		//������ (2����) �迭�� ����
		//	�ڷ���[][] �迭��;
		//	�ڷ��� �迭��[][];
		//	�ڷ���[] �迭��[];
		
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];
		
		// stack�� �ּ� ���� �� ���� ���� (����)
		
		// 2���� �迭 �Ҵ� : �迭�� ���� ũ�� ����
		iArr1 = new int[3][5]; //���� �迭 (��� ���� �� ���� ���� ������ ����) <-> ���� �迭
		
		//�迭�� �� ���
		System.out.println("iArr1 : "+iArr1);
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] : "+ iArr1[i]);
		}
		
		for (int i = 0; i< iArr1.length; i++) { //��(��) ����
			for (int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j]);
			}
			System.out.println();
		}
	}
	public void method2() {
		int[][] iArr = new int[3][5];
		
		// �� ���
		// 1. �迭 �ε����� �����Ͽ� �� ���
		
		iArr[0][0] = 00;
		iArr[0][1] = 01;
		iArr[0][2] = 02;
		iArr[0][3] = 03;
		iArr[0][4] = 04;
		
		iArr[1][0] = 11;
		iArr[1][1] = 12;
		iArr[1][2] = 13;
		iArr[1][3] = 14;
		iArr[1][4] = 15;
		
		iArr[2][0] = 21;
		iArr[2][1] = 22;
		iArr[2][2] = 23;
		iArr[2][3] = 24;
		iArr[2][4] = 25;
		
		
		int value = 1;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j<iArr[i].length; j++) {
				iArr[i][j] = value;
				value++;
			}
		}
		
		
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j<iArr[i].length; j++) {
				System.out.printf("%-2d ", iArr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public void method3() {
		//���� �迭
		// ���� ���������� �� �࿡ ���� ���� �������� ���� ����
		//	�ڷ����� ���� 1���� �迭 ���� ���� �ϳ��� ���� ���� 2���� �迭�̱� ������
		//	���� �ִ� 1���� �迭�� ���̰� �� ���� �ʿ�� ����
		
		int[][] iArr = new int[3][];
		iArr[0] = new int [2];
		iArr[1] = new int [1];
		iArr[2] = new int [3];
		
		int value = 1;
		for (int i = 0 ; i < iArr.length; i++) {
			for (int j = 0; j<iArr[i].length; j++) {
				iArr[i][j] = value;
				value++;
				System.out.printf("%-1d ",iArr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void method4() {
		int [][] iArr1 = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		int [][] iArr2 = {{1,2},{3},{4,5,6}};
		
	}
	
	public void method5() {
		
	}
}
