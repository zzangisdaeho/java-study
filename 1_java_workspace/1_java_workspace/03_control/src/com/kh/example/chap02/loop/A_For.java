package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(초기식; 조건식; 증감식){
	// 	실행 문장;
	// }
	// 초기식 -> 조건식 확인 -> (조건식이 true일 때) 실행문장 수행 -> 증감식 -> 조건식 확인 -> (반복)
	// 조건식 결과가 false가 될 때까지 반복
	// 
	// for문 안에 있는 초기식, 조건식, 증감식은 생략이 가능하나 
	// 초기식은 무엇인지, 조건은 무엇인지, 증감은 얼마나 되는지를 따로 다 표기해야 함
	// 결국 for( ) 안에서만 생략될 뿐, 모두 필요한 요소임
	
	int c = 10;
	
	public void method1() {
		// 1부터 5까지 출력
		
		int a = 1;
		for (;a <=5;a++) {
		System.out.println(a+"번째 반복문 수행");
		}
		System.out.println(a);
		
		
//		for (int b = 1; b <= 5; b++) {
//			System.out.println(b+"번째 반복문 수행");
//		}
		
	}
	
	public void method1_1() {
//		for (int i = 1; i <= 5; i++) { 		1 ~ 5
		for (int i = 0; i < 5; i++) {	  //0 ~ 4
			System.out.println("내 이름은 머머리야");
		}
		
	}
	
	public void method2() {
		//0부터 -4까지
//		for (int i = 0; i>-5; i--) {
//			System.out.println(i);
		
		//5부터 1까지
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		
		}
	}
	public void method2_1() {
		for (int i = 8; i>=3; i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
			
		}
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요.\n단 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.");
		System.out.print("첫 번째 숫자 : ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 숫자 : ");
		int end = Integer.parseInt(sc.nextLine());
		
		int max = 0;
		int min = 0;
				
		if (start > end) { //우려한 상황
			max = start;
			min = end;
		}
		else {
			max = end;
			min = start;
		}
		
//		for (;min <= max; min++ ) {
//		System.out.println(min);
//		}
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}
	public void method4_1() {
		// 정수 하나를 입력받아 그 수가 1~9 사이의 수일 때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해 주세요 : ");
		int dan  = Integer.parseInt(sc.nextLine());
		
		if (!(dan<1) && !(dan>9)) {
			for (int i =1; i<= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan,i,(dan*i));
			}
		}
		
		else {System.out.println("1~9 사이로 입력해 주세요");}
	}
	
	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		Math.random();
		// 0 <= Math.random < 1
		// 0 <= Math.random * 10 < 10
		// 0 <= (int)(Math.random * 10) < 10   => 0~9 정수만 나옴
		// 0 <= (int)(Math.random * 10) + 1 < 10    => 1~10 정수만 나옴
		
		int random = (int)(Math.random()*10) + 1; // 1~10 정수만 나옴
		int sum = 0;
		
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 정수 합계 = %d",random,sum);
		//ex)
		//random = 3
		//1, 2, 3 ==> sum
		//sum = 1+2+3 = 6
		
	}
	public void method6() {
		// 중첩 for문 : for문 안에 for문 사용 가능
		// 2단부터 9단까지 출력
		int dan;
		int	mul;
		
		for (dan = 2 ; dan <= 9; dan++) {
			System.out.println("==============" + dan + "===============");
			for (mul = 1 ; mul <= 9; mul++) {
				System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
			}
		}
		
	}
	public void method7() {
		// 아날로그 시계
		int hour;
		int minute;
		
		for (hour = 00; hour <= 23; hour++) {
			for (minute = 00; minute < 60; minute++) {
				System.out.printf("%d시 %d분\n", hour, minute);
			}
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("***** 몇개 출력할꺼? : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method9() {
		// 한 줄에 별표 문자를 입력할 줄 수와 칸 수를 사용자에게 입력 받음
		// 이 때, 줄 수와 칸 수가 일치하는 줄에는 줄 번호에 대한 정수 출력
		/*
		 * 줄 수 : 6
		 * 칸 수 : 6
		 * 1*****
		 * *2****
		 * **3***
		 * ***4**
		 * ****5*
		 * *****6
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수를 입력하세요 : ");
		int line = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j == i) {
					System.out.print(j);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int row = Integer.parseInt(sc.nextLine());
		System.out.print("칸 수 : ");
		int col = Integer.parseInt(sc.nextLine());
		
		for (int r =1; r <= row; r++) {
			for (int c = 1; c <= col; c++) {
				if(r==c) {
					System.out.print(r);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	
//	public void prac1() {
//		int c = 5;
//		System.out.println(c);
//	}
//	public void prac2() {
//		System.out.println(c);
//	}
	
	
	
}
