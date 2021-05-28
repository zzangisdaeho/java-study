package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	Scanner sc = new Scanner(System.in);
//	while (조건식) {
//		실행 문장;
//		[증감식 or 분기문;]
//	}
//	조건식 확인 -> (조건식 true일 때) 실행 문장 수행 -> 조건식 확인 -> (반복)
//	조건식 결과가 false가 될때까지 반복
	
	public void method1() {
//		1부터 5까지 출력
		int i = 1;
		while (i <=5) {
//			System.out.println(i);
//			i++;
			System.out.println(i++);
		}
	}
	public void method2() {
//		5부터 1까지 출력하기
		int i = 5;
		while (i>0) {
			System.out.println(i--);
		}
	}
	public void method3() {
//		1부터 10 사이의 홀수만 출력
		int i = 1;
		while (i<=10) {
			if (i%2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}
	public void method4() {
//		정수 두 개를 입력 받아 그 사이 숫자 출력
		System.out.print("정수 1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("정수 2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int max;
		int min;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		while (min <= max) {
			System.out.println(min);
			min++;
		}
		
	}
	public void method5() {
//		1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		int random =(int)(Math.random()*10+1);
		System.out.println(random);
		
		int start = 1;
		int result = 0;
		while (start<=random) {
			result += start;
			start++;
		}
		System.out.printf("1부터 %d 까지의 합계는 %d이다.",random,result);
		
	}
	public void method6() {
//		문자열을 입력받아 인덱스별로 문자 출력
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int strLength = str.length();
		System.out.println(strLength);
		
		int index = 0;
		
		while(index<strLength) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
		
	}
	public void method7() {
//		2단부터 9단까지 출력
		
		int dan = 2;
		int mul = 1;
		
		while (dan <= 9) {
			System.out.println("============="+dan+"===============");
			mul = 1;
			while (mul <= 9) {
				System.out.printf("%d * %d = %d \n", dan, mul, (dan*mul));
				mul++;
			}
			dan++;
		}
	}
	public void method8() {
		int hour = 0;
		int minute = 0;
		
		while (hour < 24) {
			minute = 0;
			while (minute < 60) {
				System.out.printf("%d시 %d분\n", hour, minute);
				minute++;
			}
			hour++;
		}
	}
	public void method9() {
		int menuNum = 0;
		
		while (menuNum != 9) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10 사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 눌렀슴");
			}
		}
	}
	public void method10() {
		while (true) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10 사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); return; 
			case 4 : System.out.println("끝났다니까?");
			default : System.out.println("잘못 눌렀슴");
			}
		}
	}
}
