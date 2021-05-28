package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<=0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			int i = 1;
			while (i <= num) {
				System.out.println(i);
				i++;
			}
		}
	}
	public void practice2() {
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			else {
				int i = 1;
				while (i <= num) {
					System.out.println(i);
					i++;
				}
				break;
			}
		}
	}
	public void practice2_1(){
		int num = -1;
		while (num<=0) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			else {
				int i = 1;
				while (i <= num) {
					System.out.println(i);
					i++;
				}
			}
		}
	}
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		if (num<=0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else{
			for (;num>0;num--) {
				System.out.println(num);
			}
		}
	}
	public void practice4() {
		int num = -1;
		while (num <= 0) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			else {
				for (;num>=1;num--) {
					System.out.println(num);
				}
				break; // for 문을 사용하려다보니 결국 break를 쓰게되다니 자존심이 상한다... 하지만 다시만들기 귀찮다..
			}
		}
	}
	public void practice4_1() {
		
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			else {
				for (;num>=1;num--) {
					System.out.println(num);
				}
				break;
			}
		}
	}
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i;
			if (i<num) {
				System.out.print(" + ");
			}
			else {
				System.out.print(" = ");
			}
		}
		System.out.print(sum);
	}
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 숫자 : ");
		int end = Integer.parseInt(sc.nextLine());
		
		if (start < 1 || end < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		
		int min;
		int max;
		
		if (start>end) {
			min = end;
			max = start;
		}
		else {
			min = start;
			max = end;
		}
		
		for (;min<=max;min++) {
			System.out.print(min+" ");
		}
	}
	public void practice6_1() {
		System.out.print("첫 번째 숫자 : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 숫자 : ");
		int end = Integer.parseInt(sc.nextLine());
		
		if (start < 1 || end < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			int min;
			int max;
			
			if (start>end) {
				min = end;
				max = start;
			}
			else {
				min = start;
				max = end;
			}
			
			for (;min<=max;min++) {
				System.out.print(min+" ");
			}
		}
	}
	public void practice7() {
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int start = Integer.parseInt(sc.nextLine());
			
			System.out.print("두 번째 숫자 : ");
			int end = Integer.parseInt(sc.nextLine());
			
			if (start < 1 || end < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			else {
				int min;
				int max;
				
				if (start>end) {
					min = end;
					max = start;
				}
				else {
					min = start;
					max = end;
				}
				
				for (;min<=max;min++) {
					System.out.print(min+" ");
				}
				break;
			}
		}
	}
	public void practice8() {
		System.out.print("숫자 : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		System.out.println("===== " + dan + "단 =====");
		
		for (int mul = 1; mul < 10; mul++) {
			System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
		}
	}
	public void practice9() {
		System.out.print("숫자 : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		if (dan>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		else {
			for (;dan<10;dan++) {
				System.out.println("===== " + dan + "단 =====");
				for (int mul = 1; mul < 10; mul++) {
					System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
				}
			}
		}
	}
	public void practice10() {
		while (true) {
			System.out.print("숫자 : ");
			int dan = Integer.parseInt(sc.nextLine());
			
			if (dan>9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			else {
				for (;dan<10;dan++) {
					System.out.println("===== " + dan + "단 =====");
					for (int mul = 1; mul < 10; mul++) {
						System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
					}
				}
				break;
			}
		}
	}
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("공차 : "); //공차는 맛있다. 타로밀크티 크으으
		int allowance = Integer.parseInt(sc.nextLine());
		
		int finalNumber = start + (allowance * 9);
		
		for (;start <= finalNumber ;start += allowance) {
			System.out.print(start + " ");
		}
	}
	public void practice11_1() {
		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("공차 : "); 
		int allowance = Integer.parseInt(sc.nextLine());
		
		int finalNumber = start + (allowance * 9);
		
		for (; ;start += allowance) {
			if (start > finalNumber) {
				break;
			}
			System.out.print(start + " ");
		}
	}
	public void practice12() {
		while (true) {
			System.out.print("연산자 (+, -, *, /, %) : "); 
			String strOp = sc.nextLine();
			char op = strOp.charAt(0);
			
			if (strOp.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수 1 : ");
			String str1 = sc.nextLine();
			int num1 = Integer.parseInt(str1);
			
			System.out.print("정수 2 : "); 
			String str2 = sc.nextLine();
			int num2 = Integer.parseInt(str2);
			
			
			if (num2 == 0 && op == '/') {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				continue;
			}
			else if (op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				continue;
			}
			else {
				int result = 0;
				switch (op) {
				case '+' : result = num1 + num2; break;
				case '-' : result = num1 - num2; break;
				case '*' : result = num1 * num2; break;
				case '/' : result = num1 / num2; break;
				case '%' : result = num1 % num2; break;
				}
				System.out.println(result);
				break;
			}
		}
	}
	public void practice13() {
		System.out.print("정수 입력 : ");
		int line = Integer.parseInt(sc.nextLine());
		
		for (int l = 1; l <= line ; l++) {
			for (int i = 1; i <= l ; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void practice14() {
		System.out.print("정수 입력 : ");
		int line = Integer.parseInt(sc.nextLine());
		
		for (; line>=1; line--) {
			for (int i = line; i>=1; i--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void practice15() {
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		String dec = "소수입니다.";
		
		if (num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				dec = "소수가 아닙니다.";
			}
			
		}
		System.out.println(dec);
	}
	public void practice16() {
		while (true) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(sc.nextLine());
			String dec = "소수입니다.";
			
			if (num<2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			for (int i = 2; i < num; i++) {
				if (num%i == 0) {
					dec = "소수가 아닙니다.";
				}
				
			}
			System.out.println(dec);
			break;
		}
	}
	public void practice17() {
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<2) {
			System.out.println("잘못 입력하셨습니다."); return;
		}
		
		int i = 0;
		int l = 0;
		int count = 0;
		
		
		for (i = 2; i <= num; i++) {
			if (i == 2) {
				System.out.print(i+ " ");
				count++;
				continue;
			}
			
			for (l = 2; l < i; l++) {
				if (i%l == 0) {
					break;
				}
			}
			if (l == i) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("2부터 %d까지 소수의 개수는 %d개 입니다.", num, count);
		
	}
	public void practice18() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int i = 0;
		int count = 0;
		
		for (i=1;i<=num;i++) {
			if (i%2 == 0 && i%3 == 0) {
				System.out.print(i + " ");
				count++;
			}
			else if (i%2 == 0 || i%3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("count : " + count);
		
	}
	public void practice19() {
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		char star = '*';
		char space = ' ';
		int i = 0;
		int j = 0;
		int l = 0;
		
		for (i = 1; i <= num; i++) {
			for (j = num-i; j >= 1; j--) {
				System.out.print(space);
			}
			for (l = 1; l <= i ; l++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	public void practice20() {
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		char star = '*';
		char space = ' ';
		int i = 0;
		int j = 0;
		int l = 0;
		
		
		for (i = 1 ; i<=num ; i++) {
			for (j = 1; j <= i ; j++) {
				System.out.print(star);
			}
			for (l = num ; l >= i ; l--) {
				System.out.print(space);
			}
			System.out.println();
		}
	
		for (i = 1; i <= (num-1); i++) {
			for (j = (num-1); j>=i; j--) {
				System.out.print(star);
			}
			for (l = i; l <= (num-1); l++) {
				System.out.print(space);
			}
			System.out.println();
		}
	}

	public void practice21() {
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		char star = '*';
		char space = ' ';
		
		int i = 0;
		int j = 0;
		int l = 0;
		
		for (i=1; i<=num; i++) {
			for (j=num; j>i; j--) {
				System.out.print(space);
			}
			for (l=1; l<=(i*2-1); l++) {
				System.out.print(star);
			}
			for (j=num; j>i; j--) {
				System.out.print(space);
			}
			System.out.println();
		}
}
	public void practice22() {
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
	
		char star = '*';
		char space = ' ';
		
		int i = 0;
		int j = 0;
		int l = 0;
		
		for(i = 1; i <= num; i++) {
			System.out.print(star);
		}
		System.out.println();
		
		for (i = 1; i <= num-2; i++) {
			System.out.print(star);
			for (l = 1; l <= num-2; l++) {
				System.out.print(space);
			}
			System.out.print(star);
			System.out.println();
		}
		
		for(i = 1; i <= num; i++) {
			System.out.print(star);
		}
		System.out.println();
}

}
