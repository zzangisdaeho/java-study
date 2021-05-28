package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_Dowhile {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// 키보드로 문자열을 입력 받는데 exit가 들어오면 반복 종료
		
		String str = "";
		
		while(!str.equals("exit")) {
			System.out.print("문자열을 입력하시요 (exit는 종료) : ");
			str =  sc.nextLine();
			System.out.println("str : " + str);
		}
	}
	
	public void method1_1() {
		String str = null;
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : "+str);
		}
		while(!str.equals("exit"));
	}
	
	public void method2(){
		System.out.println("1. 테스트1");
		System.out.println("2. 테스트2");
		System.out.println("3. 테스트3");
		System.out.println("9. 종료");
		
		int menuNum = 0;
		
		do {
			System.out.print("메뉴 선택 : ");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
			case 9 : System.out.println("종료합니다"); break;
			default : System.out.println("올바른 번호를 입력해라");
			}
		}
		while(menuNum != 9);
	}
	
	public void method3(){
		int menuNum;
		do {
			System.out.println("1. 테스트1");
			System.out.println("2. 테스트2");
			System.out.println("3. 테스트3");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
			case 9 : System.out.println("종료합니다"); break; // return으로 전단계로 이탈 (강제종료)
			default : System.out.println("올바른 번호를 입력해라");
			}
		}
		while(menuNum!=0); //무한 반복일땐
	}
	

	public void method4(){
		//정수 하나를 입력받아 그 수가 1~9 사이의 수일 때만 그 수의 구구단 출력
		//조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다. 출력
		System.out.print("정수 : ");
		int ran = (int)(Math.random()*9+1);
		System.out.println(ran);
//		int num = Integer.parseInt(sc.nextLine());
		
		if (!(ran <= 9) || !(ran >=1)) {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
		else {
			for(int i = 1;i <10; i++) {
				System.out.printf("%d * %d = %d\n", ran,i,(ran*i));
			}
		}
	}
}
