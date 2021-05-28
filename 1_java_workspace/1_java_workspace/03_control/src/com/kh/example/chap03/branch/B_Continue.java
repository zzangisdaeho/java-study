package com.kh.example.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	// continue문 : 반복문 내에서만 사용할 수 있음
	// continue문 아래의 내용은 실행하지 않고
	// 증감식 또는 다음 값으로 건너뛰라는 의미 == 아래 생략
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// 1~100까지 정수들의 합계 출력
		// 단, 4의 배수는 뺴고 계산
		
		int num = 100;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if (i%4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void method2() {
		// 구구단을 출력하되 짝수 단, 짝수 수는 빼고 출력
		// ex.
		for (int dan = 2 ; dan < 10 ; dan++) {
			if (dan % 2 == 1) {
				System.out.println("===== "+dan+ " 단=====");
				for (int i = 1; i < 9 ; i++) {
					if(i % 2 == 1) {
						System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
					}
				}
			}
		}
	}
}
