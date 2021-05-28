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
		System.out.print("양의 정수 : ");
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
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
		
	}
	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		System.out.print("문자 : ");
		char serch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		char[] arr = new char[input.length()];
//		char[] where = new char[input.length()]; //안쓰임
		
		System.out.printf("%s에  %c가 존재하는 위치(인덱스) : ", input, serch); 
		
		for (int i =0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			
			if (arr[i] == serch) {
				count ++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d", serch, count);
		
	}
	public void practice6() {
		String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int find = Integer.parseInt(sc.nextLine());
		if (find<0 || find>6) {
			System.out.println("0~6까지 입력하는게 그다지도 힘들더냐");
		}
		else {
			System.out.println(days[find]);
		}
	}
	public void practice7() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[num];
		int sum = 0;
		
		for (int i = 0 ; i < num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 :", i);
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0 ; i <num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0 ; i <num; i++) {
			sum += arr[i];
		}
			System.out.println("총합 : " + sum);
	}
	public void practice8() {
		int num = 0;
		while(true) {
			System.out.print("정수 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num < 3 || num%2 == 0) {
				System.out.println("다시 입력하쇼");
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
		String[] menu = {"후라이드", "양념", "구운", "뿌링클", "볼케이노"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String choice = sc.nextLine();
		
		char match = ' ';
		
		for (int i = 0 ; i < menu.length ; i++) {
			if (choice.equals(menu[i])){
				match = 'C';
			}
		}
		
		if (match == 'C'){
			System.out.printf("%s치킨 배달 가능", choice);
		}
		else {
			System.out.printf("%s치킨은 없는 메뉴입니다.", choice);
		}
	}
	public void practice10() {
		char[] idNum = new char[14];
		char[] idNumMod = new char [14];
		
		System.out.print("주민등록번호(-포함) : ");
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
		System.out.println ("최대값 : " + max);
		System.out.println ("최소값 : " + min);
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
		System.out.print("문자열 : ");
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
		System.out.print("문자열에 있는 문자 : ");
		
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
		System.out.println("문자 개수 : " + count);
		
	}
	public void practice16_f(){
		char yN = 'y';
		int totalLength = 0;
		int i = 0;
		System.out.print("배열의 크기를 입력하세요 : ");
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
				System.out.print((i+1) + "번째 문자열 : ");
				memo[i] = sc.nextLine();
			}
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			yN = sc.nextLine().charAt(0);
			
			if (yN == 'y' || yN == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
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
		System.out.print("배열의 크기를 입력하세요 : ");
		
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
				System.out.print((i+1) + "번째 문자열 : ");
				memo[i] = sc.nextLine();
			}
			
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			yN = sc.nextLine().charAt(0);
			
			if (yN == 'y' || yN == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
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
