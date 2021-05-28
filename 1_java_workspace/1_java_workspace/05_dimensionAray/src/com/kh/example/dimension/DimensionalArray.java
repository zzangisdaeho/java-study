package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		//다차원 (2차원) 배열의 선언
		//	자료형[][] 배열명;
		//	자료형 배열명[][];
		//	자료형[] 배열명[];
		
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];
		
		// stack에 주소 값이 들어갈 공간 생성 (변수)
		
		// 2차원 배열 할당 : 배열에 대한 크기 지정
		iArr1 = new int[3][5]; //정변 배열 (모든 층이 다 같은 방을 가지고 있음) <-> 가변 배열
		
		//배열의 값 출력
		System.out.println("iArr1 : "+iArr1);
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] : "+ iArr1[i]);
		}
		
		for (int i = 0; i< iArr1.length; i++) { //행(층) 돌기
			for (int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j]);
			}
			System.out.println();
		}
	}
	public void method2() {
		int[][] iArr = new int[3][5];
		
		// 값 기록
		// 1. 배열 인덱스에 접근하여 값 기록
		
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
		//가변 배열
		// 행은 정해졌으나 각 행에 대한 열이 정해지지 않은 상태
		//	자료형이 같은 1차원 배열 여러 개를 하나로 묶은 것이 2차원 배열이기 때문에
		//	묶여 있는 1차원 배열의 길이가 꼭 같은 필요는 없음
		
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
