package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int [10];
		
		for (int i = 0 ; i < 10 ; i++) {
			arr[i] = i+1 ;
		}
		
		for (int i = 0 ; i < 10; i++) {
			System.out.print (arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for (int i = 0 ; i<10 ; i++) {
			for (int j = arr.length ;  ;j--) {
				arr[i] = j;
				if ( j + i == 10) {
					break;
				}
			}
		}
		for (int i = 0 ; i < 10; i++) {
			System.out.print (arr[i] + " ");
	
		}
	}
	public void practice3() {
		System.out.print("���� ���� : ");
//		int[] num = new int[Integer.parseInt(sc.nextLine())];
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		for (int i = 0; i<num ; i++) {
			arr[i] = i+1;
		}
		for (int i = 0 ; i < num; i++) {
			System.out.print (arr[i] + " ");
	
		}
	}
	public void practice4() {
		String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.println(arr[1]);
		
	}
	public void practice5() {
		System.out.print("���ڿ� : ");
		String input = sc.nextLine();
		System.out.print("���� : ");
		char serch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		char[] arr = new char[input.length()];
//		char[] where = new char[input.length()]; //�Ⱦ���
		
		System.out.printf("%s��  %c�� �����ϴ� ��ġ(�ε���) : ", input, serch); 
		
		for (int i =0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			
			if (arr[i] == serch) {
				count ++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%c�� ���� : %d", serch, count);
		
	}
	public void practice6() {
		String[] days = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		
		System.out.print("0~6 ���� ���� �Է� : ");
		int find = Integer.parseInt(sc.nextLine());
		if (find<0 || find>6) {
			System.out.println("0~6���� �Է��ϴ°� �״����� �������");
		}
		else {
			System.out.println(days[find]);
		}
	}
	public void practice7() {
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[num];
		int sum = 0;
		
		for (int i = 0 ; i < num; i++) {
			System.out.printf("�迭 %d��° �ε����� ���� �� :", i);
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0 ; i <num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0 ; i <num; i++) {
			sum += arr[i];
		}
			System.out.println("���� : " + sum);
	}
	public void practice8() {
		int num = 0;
		while(true) {
			System.out.print("���� : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num < 3 || num%2 == 0) {
				System.out.println("�ٽ� �Է��ϼ�");
				continue;
			}
			break;
		}
		int j = num/2;
		int[] arr = new int[num];
		
		for (int i = 0 ; i < num ; i++) {
			if (i<=num/2) {
				arr[i] = i+1;
			}
			else {
				arr[i] = j;
				j--;
				}
		}
		for (int i = 0 ; i < num ; i++) {
			if (i == num-1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	public void practice9() {
		String[] menu = {"�Ķ��̵�", "���", "����", "�Ѹ�Ŭ", "�����̳�"};
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String choice = sc.nextLine();
		
		char match = ' ';
		
		for (int i = 0 ; i < menu.length ; i++) {
			if (choice.equals(menu[i])){
				match = 'C';
			}
		}
		
		if (match == 'C'){
			System.out.printf("%sġŲ ��� ����", choice);
		}
		else {
			System.out.printf("%sġŲ�� ���� �޴��Դϴ�.", choice);
		}
	}
	public void practice10() {
		char[] idNum = new char[14];
		char[] idNumMod = new char [14];
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String inputNum = sc.nextLine();
		
		for (int i = 0; i < idNum.length ; i++) {
			idNum[i] = inputNum.charAt(i);
		}
		
		for (int i = 0; i < idNum.length ; i++) {
			if (i<8) {
				idNumMod[i] = idNum[i];
			}
			else {
				idNumMod[i] = '*';
			}
		}
		for (int i = 0; i < idNumMod.length ; i++) {
			System.out.print(idNumMod[i]);
		}
	}
	public void practice11() {
		int[] arr = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice12() {
		int[] arr = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		
		int max = 0;
		int min = 10;
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(arr[i] + " ");
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println();
		System.out.println ("�ִ밪 : " + max);
		System.out.println ("�ּҰ� : " + min);
	}
	public void practice13() {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			for (int j = 0 ; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public void practice14() {
		int[] lotto = new int[6];
		
		for (int i = 0 ; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*40+1) + (int)(Math.random()*5+1);
			for (int j = 0 ; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		for (int i = 0 ; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	public void practice15() {
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			for (int j = 0 ; j < i; j++) {
				if (arr[j] == arr[i]) {
					arr[i] = ' ';
				}
			}
		}
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == ' ') {
				continue;
			}
			else {
				if (i == str.length()-1) {
					System.out.print(arr[i]);
					count ++;
				}
				else {
					System.out.print(arr[i] + ", ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("���� ���� : " + count);
		
	}
	public void practice16_f(){
		char yN = 'y';
		int totalLength = 0;
		int i = 0;
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		String[] memo = new String[0];
		String[] memoCopy = new String[0];
		
		while (yN == 'y' || yN == 'Y') {
			int length = Integer.parseInt(sc.nextLine());
			totalLength += length;
			
			memo = new String[totalLength];
			
			for (int j = 0; j < totalLength; j++) {
				memo[j] = memoCopy[j];
			}
			
			for ( ; i < totalLength; i++) {
				System.out.print((i+1) + "��° ���ڿ� : ");
				memo[i] = sc.nextLine();
			}
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
			yN = sc.nextLine().charAt(0);
			
			if (yN == 'y' || yN == 'Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				memoCopy = Arrays.copyOf(memo, totalLength);
			}
			
			if(yN == 'n' || yN == 'N') {
				System.out.print("[");
				for (int j = 0 ; j < totalLength; j++) {
					if (j == totalLength-1) {
						System.out.print(memo[j]);
					}
					else {
						System.out.print(memo[j] + ", ");
					}
				}
				System.out.print("]");
			}
		}
	}
	public void practice16(){
		char yN = 'y';
		int totalLength = 0;
		int i = 0;
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		
		String[] memoCopy = null;

		
		while (yN == 'y' || yN == 'Y') {
			int length = Integer.parseInt(sc.nextLine());
			totalLength += length;
			int beforeTotalLength = totalLength - length;
			
			String[] memo = new String[totalLength];
			
			for(int j = 0; j < beforeTotalLength ; j++) {
				memo[j] = memoCopy[j];
			}
			
			for ( ; i < totalLength; i++) {
				System.out.print((i+1) + "��° ���ڿ� : ");
				memo[i] = sc.nextLine();
			}
			
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
			yN = sc.nextLine().charAt(0);
			
			if (yN == 'y' || yN == 'Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				memoCopy = Arrays.copyOf(memo, totalLength);
			}
			
			if(yN == 'n' || yN == 'N') {
				System.out.print("[");
				for (int j = 0 ; j < totalLength; j++) {
					if (j == totalLength-1) {
						System.out.print(memo[j]);
					}
					else {
						System.out.print(memo[j] + ", ");
					}
				}
				System.out.print("]");
			}
		}
	}
}
