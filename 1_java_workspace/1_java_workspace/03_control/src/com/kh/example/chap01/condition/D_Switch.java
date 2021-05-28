package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	Scanner sc = new Scanner(System.in);
	
	//조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	//해당하는 값이 없을 경우 default의 명령문 수행
	//case와 수행문 사이에는 : (콜른)을 써야하며
	// break가 없으면 멈추지 않고 계속 수행함
	
	//Switch(변수){
	// case 1 : 실행문 1; break; --> 변수 값이 1일 경우 실행
	// case 2 : 실행문 2; break; --> 변수 값이 2일 경우 실행
	// default : 실행문 3; break; --> 변수의 값이 case문에 없을 경우 실행
	//}
	
	public void method1() {
		//정수 두 개와 연산 기호 문자 1개를 입력 받아서
		//연산 기호 문자에 해당하는 계산을 수행하고 출력하기
		System.out.print("정수 1 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 2 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산 기호 입력(+, -, *, /) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0; //항상 초기화 해놓는 습관 중요
		
		switch(op) {
		case '+' : result = num1 + num2;
		break;
		
		case '-' : result = num1 - num2;
		break;
		
		case '*' : result = num1 * num2;
		break;
		
		case '/' : result = num1 / num2;
		break;
		
		default : System.out.println("4 기호중 하나를 입력하세요");
		break;
		}
		if (op == '+' || op =='-' || op == '*' || op == '/') {
			System.out.println(num1 + " " + op + " "+num2+" = "+result);
		}
	}
	public void method2() {
		// 과일가게에서 각 과일을 입력 했을 때의 가격을 출력하는 메소드
		// 사과 : 1000원, 복숭아 : 2000원, 키위 : 5000원
		// 없으면 "잘못입력하셨습니다"
		System.out.print("사과 복숭아 키위 중 하나를 입력하세요 : ");
		String fruit = sc.nextLine();
		int price = 0; //초기화 습관!!!
		
		switch (fruit) {
		case "사과" : price = 1000;
		break;
		case "복숭아" : price = 2000;
		break;
		case "키위" : price = 5000;
		break;
		default : System.out.println("사과 복숭아 키위 만 재고로 보유중 입니다.");
		break;
		}
		//if (fruit == "사과" || fruit == "복숭아" || fruit == "키위")// 문자열 비교는 .equals로 해야함;; 
		if (fruit.equals("사과") || fruit.equals("복숭아") || fruit.equals("키위")) {	
			System.out.println(fruit + " : "+price+"원");
		}
	}
	public void method3() {
		//1부터 12사이의 값을 입력 받아 해당하는 숫자 달의 마지막 날짜 출력
		System.out.print("검색하고자 하는 월을 입력하세요(1~12) : ");
		int month = Integer.parseInt(sc.nextLine());
		int lastday = 0 ;
		
		switch (month) {
		case 1 : case 3: case 5: case 7:
			case 8 : case 10: case 12 : lastday = 31;
		break;
		case 2 : lastday = 28;
		break;
		case 4 : case 6 : case 9 :
			case 11 : lastday = 30;
		break;
		default : System.out.println("1~12 사이로 입력하세요");
		break;
		}
		System.out.println(month + "달의 마지막 일은 " + lastday + "입니다");
		
	}
	public void method4() {
		//사용자가 입력한 번호에 따라 해당 번호에 맞는 메뉴 선택
		System.out.println("원하시는 번호를 선택하세요");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭제");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1 :
			System.out.println("회원 등록 메뉴입니다");
			break;
		case 2 :
			System.out.println("회원 수정 메뉴입니다");
			break;
		case 3 :
			System.out.println("회원 삭제 메뉴입니다");
			break;
		}
	}
	
}
