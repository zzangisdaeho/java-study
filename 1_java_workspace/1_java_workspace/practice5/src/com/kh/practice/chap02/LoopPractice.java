package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<=0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		if (num<=0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
			else {
				for (;num>=1;num--) {
					System.out.println(num);
				}
				break; // for ���� ����Ϸ��ٺ��� �ᱹ break�� ���ԵǴٴ� �������� ���Ѵ�... ������ �ٽø���� ������..
			}
		}
	}
	public void practice4_1() {
		
		while (true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		System.out.print("ù ��° ���� : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		int end = Integer.parseInt(sc.nextLine());
		
		if (start < 1 || end < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
		System.out.print("ù ��° ���� : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		int end = Integer.parseInt(sc.nextLine());
		
		if (start < 1 || end < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
			System.out.print("ù ��° ���� : ");
			int start = Integer.parseInt(sc.nextLine());
			
			System.out.print("�� ��° ���� : ");
			int end = Integer.parseInt(sc.nextLine());
			
			if (start < 1 || end < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
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
		System.out.print("���� : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		System.out.println("===== " + dan + "�� =====");
		
		for (int mul = 1; mul < 10; mul++) {
			System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
		}
	}
	public void practice9() {
		System.out.print("���� : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		if (dan>9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
		else {
			for (;dan<10;dan++) {
				System.out.println("===== " + dan + "�� =====");
				for (int mul = 1; mul < 10; mul++) {
					System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
				}
			}
		}
	}
	public void practice10() {
		while (true) {
			System.out.print("���� : ");
			int dan = Integer.parseInt(sc.nextLine());
			
			if (dan>9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
				continue;
			}
			else {
				for (;dan<10;dan++) {
					System.out.println("===== " + dan + "�� =====");
					for (int mul = 1; mul < 10; mul++) {
						System.out.printf("%d * %d = %d\n", dan, mul, (dan*mul));
					}
				}
				break;
			}
		}
	}
	public void practice11() {
		System.out.print("���� ���� : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� : "); //������ ���ִ�. Ÿ�ι�ũƼ ũ����
		int allowance = Integer.parseInt(sc.nextLine());
		
		int finalNumber = start + (allowance * 9);
		
		for (;start <= finalNumber ;start += allowance) {
			System.out.print(start + " ");
		}
	}
	public void practice11_1() {
		System.out.print("���� ���� : ");
		int start = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� : "); 
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
			System.out.print("������ (+, -, *, /, %) : "); 
			String strOp = sc.nextLine();
			char op = strOp.charAt(0);
			
			if (strOp.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("���� 1 : ");
			String str1 = sc.nextLine();
			int num1 = Integer.parseInt(str1);
			
			System.out.print("���� 2 : "); 
			String str2 = sc.nextLine();
			int num2 = Integer.parseInt(str2);
			
			
			if (num2 == 0 && op == '/') {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			else if (op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���");
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
		System.out.print("���� �Է� : ");
		int line = Integer.parseInt(sc.nextLine());
		
		for (int l = 1; l <= line ; l++) {
			for (int i = 1; i <= l ; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void practice14() {
		System.out.print("���� �Է� : ");
		int line = Integer.parseInt(sc.nextLine());
		
		for (; line>=1; line--) {
			for (int i = line; i>=1; i--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void practice15() {
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		String dec = "�Ҽ��Դϴ�.";
		
		if (num<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				dec = "�Ҽ��� �ƴմϴ�.";
			}
			
		}
		System.out.println(dec);
	}
	public void practice16() {
		while (true) {
			System.out.print("���� : ");
			int num = Integer.parseInt(sc.nextLine());
			String dec = "�Ҽ��Դϴ�.";
			
			if (num<2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			
			for (int i = 2; i < num; i++) {
				if (num%i == 0) {
					dec = "�Ҽ��� �ƴմϴ�.";
				}
				
			}
			System.out.println(dec);
			break;
		}
	}
	public void practice17() {
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
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
		System.out.printf("2���� %d���� �Ҽ��� ������ %d�� �Դϴ�.", num, count);
		
	}
	public void practice18() {
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
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
		System.out.print("���� �Է� : ");
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
		System.out.print("���� �Է� : ");
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
		System.out.print("���� �Է� : ");
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
		System.out.print("���� �Է� : ");
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
