package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	Scanner sc = new Scanner(System.in);
	// break문은 나와 가장 가까운 반복문을 나감
	
	public void method1(){
		// 문자열을 입력 받아 글자 갯수를 출력하는 반복 프로그램
		// 단, "end"가 입력되면 반복 종료
		// do-while문과 break 사용
		do {
			System.out.print("문자열을 입력하세요(end 종료) : ");
			String str = sc.nextLine();
			if (str.equals("end")) {
				System.out.println("종료합니당");
				break;
			}
			else {
				System.out.println(str + "글자 갯수는 : "+str.length());
			}
		}
		while(true);
	}
	public void method2() {
		//사용자에게 정수를 입력 받고 1부터 입력한 정수까지의 합 계산
		//for문과 break문 사용
		System.out.print("정수 입력해 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			if (i==num) {
				break;
			}
		}
		System.out.println(sum);
	}
}
