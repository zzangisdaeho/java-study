package com.kh.hw.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	
	public void calculator() {
		System.out.print("첫 번째 정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 정수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("연산자  (+, -, x, /) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if (op == '+' || op == '-' || op == 'x' || op == 'X' || op == '/') {
			switch (op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case 'x' : result = num1 * num2; break;
			case 'X' : result = num1 * num2; break;
			case '/' : 
				if (num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					result = 0;
				}
				else {
					result = num1 / num2;
				}
				 break;
			}
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		}
		
	}
	public void totalCalculator() {
		System.out.print("첫 번째 정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 정수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		if (num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지 정수들의 합 : %d", min, max, sum);
	}
	public void printProfile() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		String age = sc.nextLine();
		System.out.print("성별 : ");
		String sex = sc.nextLine();
		System.out.print("성격 : ");
		String character = sc.nextLine();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+sex);
		System.out.println("성격 : "+character);
	}
	public void printScore() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int classLev = Integer.parseInt(sc.nextLine());
		
		System.out.print("반 : ");
		int whClass = Integer.parseInt(sc.nextLine());
		
		System.out.print("번 : ");
		int classNum = Integer.parseInt(sc.nextLine());
		
		System.out.print("성별 (M/F) : ");
		char sex = sc.nextLine().charAt(0);
		if (sex == 'M' || sex == 'm') {
			sex = '남';
		}
		else if (sex == 'F' || sex == 'f') {
			sex = '여';
		}
		
		System.out.print("성적 : ");
		double score = Double.parseDouble(sc.nextLine());
		char grade = ' ';
		if (score >= 90) { grade = 'A';}
		else if (score >= 80){ grade = 'B';}
		else if (score >= 70){ grade = 'C';}
		else if (score >= 60){ grade = 'D';}
		else { grade = 'F';}
		
		
		
		System.out.printf("%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f이고 %c학점입니다. "
				,classLev,whClass,classNum,sex,name,score,grade);
	}
	public void printStarNumber() {
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<= 0) {
			System.out.println("양수가 아닙니다.");
			return;
		}
		
		for (int i =1; i <= num; i++) {
			for (int l = 1; l <= i ; l++) {
				if (l==i) {
					System.out.print(l);
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	public void sumRandom() {
		int ran = (int)(Math.random()*100 + 1);
		int sum = 0;
		
		for (int i = 1; i <= ran; i++) {
			sum+=i;
		}
		System.out.printf("1부터 %d 까지의 합 : %d", ran, sum);
	}
	public void exceptGugu() {
		System.out.print("정수 : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= 9 ; i++) {
			if (i%dan == 0) {
				continue;
			}
			else {
				System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			}
		}
	}
	public void diceGame() {
		while (true) {
			System.out.print("주사위 두 개의 합을 맞춰보세요 (1~12입력) : ");
			int select = Integer.parseInt(sc.nextLine());
			
			int ran = (int)(Math.random()*10 + 2);
			System.out.println("주사위의 합 : "+ran);
			
			
			if (select == ran) {
				System.out.println("정답입니다.");
				System.out.print("계속 하시겠습니까? (y/n) : ");
				char choice = sc.nextLine().charAt(0);
				
				if (choice == 'Y' || choice == 'y') {
					continue;
				}
				else if (choice == 'N' || choice =='n'){
					break;
				}
			}
			else { 
				System.out.println("틀렸습니다.");
			}
		}
	}
}
