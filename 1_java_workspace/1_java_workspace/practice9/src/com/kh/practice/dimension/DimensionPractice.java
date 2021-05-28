package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		String[][] arr = new String[3][3];
		arr[0][0] = "(0,0)";
		arr[0][1] = "(0,1)";
		arr[0][2] = "(0,2)";
		arr[1][0] = "(1,0)";
		arr[1][1] = "(1,1)";
		arr[1][2] = "(1,2)";
		arr[2][0] = "(2,0)";
		arr[2][1] = "(2,1)";
		arr[2][2] = "(2,2)";
		
//		System.out.println(Arrays.toString(arr[0]));
//		System.out.println(Arrays.toString(arr[1]));
//		System.out.println(Arrays.toString(arr[2]));
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
		int[][] arr = new int [4][4];
		
		int value = 0;
		
		for (int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				value++;
				arr[i][j] = value;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int value = 16;
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j<arr[i].length; j++) {
				arr[i][j]=value;
				value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
		int[][] arr = new int[3][3];
		
		int vSum = 0;
		int cSum = 0;
		int tSum = 0;
		
		for (int i = 0 ; i < arr.length; i++) {
			if (i == arr.length-1) {
				for (int j = 0; j < arr[i].length; j++) {
					if(j == arr[i].length-1) {
						arr[i][j] = tSum;
					}
					for(int k = 0; k < arr.length; k++) {
						cSum += arr[k][j];
					}
					arr[i][j] = cSum;
					System.out.printf("%2d ", arr[i][j]);
//					tSum += cSum;
					cSum = 0;
					
				}
			}
			else {
				for(int j = 0 ; j < arr[i].length; j++) {
					if(j == arr[i].length-1) {
						arr[i][j] = vSum;
						vSum = 0;
						System.out.printf("%2d ", arr[i][j]);
					}					
					else {
						arr[i][j] = (int)(Math.random()*10+1);
						vSum += arr[i][j];
						tSum += arr[i][j];
						System.out.printf("%2d ", arr[i][j]);
						
					}
//					if (j == arr[i].length && i == arr.length) {
//						arr[i][j]=tSum*2;
//					}
				}
			}
			System.out.println();
		}
	}
	public void practice5() {
		System.out.print("�� ũ�� : ");
		int colSize = Integer.parseInt(sc.nextLine());
		System.out.print("�� ũ�� : ");
		int verSize = Integer.parseInt(sc.nextLine());
		
		int[][] arr = new int[colSize][verSize];
		
		for (int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*30+65);
				if (arr[i][j] > 90) {
					j--;
					continue;
				}
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"},
			{"��","��","��","��","��"},{"��","��","��","��","��"},
			{"��","��","��","��","��"},{"��","��","!","��","!!"}};
		
			
		String[][] newStrArr = new String[5][5];
		
		for (int i = 0 ; i <newStrArr.length ; i++) {
			for(int j=0; j<newStrArr[i].length; j++) {
				newStrArr[i][j] = strArr[j][i];
				System.out.print(newStrArr[i][j] + " ");
			}
		}
	}
	public void practice7() {
		char value = 'a';
		
		System.out.print("���� ũ�� : ");
		int colSize = Integer.parseInt(sc.nextLine());
		int[][] chArr = new int[colSize][];
		for (int i = 0; i < colSize; i++) {
			System.out.print(i + "���� ũ�� : ");
			chArr[i] = new int[Integer.parseInt(sc.nextLine())];
			for (int j = 0 ; j < chArr[i].length ; j++) {
				chArr[i][j] = value;
				value++;
			}
		}
			
		for (int i = 0; i < colSize; i++) {
			for (int j = 0 ; j < chArr[i].length ; j++) {
				System.out.printf("%c ", chArr[i][j]);
			
			}
			System.out.println();
		}
	}
	public void practice8() {
		String[] member = {"���ǰ�", "������","�����","�����","���̹�",
				"�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		int count = 0;
		
		System.out.println ("== 1�д� ==");
		for (int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = member[count];
				System.out.printf("%s ", group1[i][j]);
				count++;
			}
			System.out.println();
		}
		
		System.out.println ("== 2�д� ==");
		for (int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = member[count];
				System.out.printf("%s ", group2[i][j]);
				count++;
			}
			System.out.println();
		}
		
		
	}
	public void practice9() {
		String[] member = {"���ǰ�", "������","�����","�����","���̹�",
				"�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		int count = 0;
		
		System.out.println ("== 1�д� ==");
		for (int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = member[count];
				System.out.printf("%s ", group1[i][j]);
				count++;
			}
			System.out.println();
		}
		
		System.out.println ("== 2�д� ==");
		for (int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = member[count];
				System.out.printf("%s ", group2[i][j]);
				count++;
			}
			System.out.println();
		}
		// �Ʒ����� �˻����
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		int groupNum = 0;
		int line = 0;
		String lineStr = "";
		String rL = null;
		
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0 ; j < group1[i].length; j++) {
				if(group1[i][j].equals(name)) {
					groupNum = 1;
					line = i;
					rL = (j%2 == 1)? "������" : "����";
				}
			}
		}
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0 ; j < group2[i].length; j++) {
				if(group2[i][j].equals(name)) {
					groupNum = 2;
					line = i;
					rL = (j%2 == 1)? "������" : "����";
				}
			}
		}
		switch(line) {
		case 0 : lineStr = "ù"; break;
		case 1 : lineStr = "��"; break;
		case 2 : lineStr = "��"; break;
		}
		System.out.printf("�˻��Ͻ� %s �л��� %d�д� %s ��° �� %s�� �ֽ��ϴ�.",
				name, groupNum, lineStr, rL);
		
	}
}
