package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1 : System.out.println("입력 메뉴입니다.");
		break;
		case 2 : System.out.println("수정 메뉴입니다.");
		break;
		case 3 : System.out.println("조회 메뉴입니다.");
		break;
		case 4 : System.out.println("삭제 메뉴입니다.");
		break;
		case 7 : System.out.println("종료 메뉴입니다.");
		break;
		default : System.out.println("알맞지 않은 메뉴 번호 입니다.");
		break;
		}
		
	}
	public void practice2() {
		System.out.print("양수를 입력해 주세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num % 2 == 0) {
			System.out.println("짝수다");
		}
		else if (num % 2 == 1){
			System.out.println("홀수다");
		}
		else {
			System.out.println("양수만 입력해 주세요");
		}
	}
	public void practice3() {
		System.out.print("국어 점수 입력 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수 입력 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수 입력 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		int total = kor + eng + math;
		double avg = total / (double)3;
		System.out.println(avg);
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		System.out.print("검색할 월을 입력하세요(1~12) : ");
		int month = Integer.parseInt(sc.nextLine());
		String season = ""; //제발 초기화좀 시키자
		
		if (month>=1 && month<=12) {
			switch (month) {
			case 12 : case 1 : case 2 : season = "겨울";
			break;
			case 3 : case 4 : case 5 : season = "봄";
			break;
			case 6 : case 7 : case 8 : season = "여름";
			break;
			case 9 : case 10 : case 11 : season = "겨울";
			break;
			}
			System.out.println(month + "월은 " + season + "입니다.");
		}
		else {
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	public void practice5() {
		String id = "myId";
		String pass = "myPassword12";
		
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String inputPass = sc.nextLine();
		
		if (inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("로그인 성공");
		}
		else if (!inputId.equals(id) && inputPass.equals(pass)){
			System.out.println("아이디가 틀렸습니다");
		}
		else if (inputId.equals(id) && !inputPass.equals(pass)) {
			System.out.println("비밀번호가 틀렸습니다");
		}
		else {
			System.out.println("아이디와 비밀번호가 틀렸습니다");
		}
	}
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String author = sc.nextLine();
		String l1 = "게시글 조회";
		String l2 = "게시글 작성, 댓글 작성";
		String l3 = "회원관리, 게시글 관리";
		
		
		switch (author) {
		case "관리자" : System.out.println(l1+", "+l2+", "+l3);
		break;
		case "회원" : System.out.println(l1+", "+l2);
		break;
		case "비회원" : System.out.println(l1);
		break;
		default : System.out.println("관리자, 회원, 비회원 중 하나를 입력해 주세요");
		}
	}
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI 지수 : "+bmi);
		if (bmi<18.5) {
			System.out.println("저체중");
		}
		else if (bmi<23) {
			System.out.println("정상체중");
		}
		else if (bmi<25) {
			System.out.println("과체중");
		}
		else if (bmi<30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도비만");
		}
	}
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("피연산자2 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력(+, -, *, /) : ");
		char op = sc.nextLine().charAt(0);
		double result = 0;
		
		if (num1>0 && num2>0) {
			switch(op) {
			case '+' : result = num1 + num2;
			break;
			case '-' : result = num1 - num2;
			break;
			case '*' : result = num1 * num2;
			break;
			case '/' : result = (double)num1 / (double)num2;
			break;
			default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			if (op == '+' || op == '-' || op == '*' || op == '/') {
				System.out.println
				(num1 + " " + op + " " + num2 + " = " + result);
			}
		}
	}
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mScore = Integer.parseInt(sc.nextLine());
		System.out.print("기말 고사 점수 : ");
		int fScore = Integer.parseInt(sc.nextLine());
		System.out.print("과제 점수 : ");
		int aScore = Integer.parseInt(sc.nextLine());
		System.out.print("출석 회수 : ");
		int cScore = Integer.parseInt(sc.nextLine());
//		System.out.println(cScore);
		
		double weightMS = mScore * 0.2;
		double weightFS = fScore * 0.3;
		double weightAS = aScore * 0.3;
		double weightCS = ((double)cScore /(double)20 * 100) * 0.2;
//		System.out.println(weightCS);
		if (!(cScore>14)) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", cScore);
			System.out.println();
		}
		else {
			double total = weightMS + weightFS + weightAS + weightCS;
		
			System.out.println("==========결과=========");
			System.out.println("중간 고사 점수(20) : " + weightMS);
			System.out.println("기말 고사 점수(30) : " + weightFS);
			System.out.println("과제 점수(30) : " + weightAS);
			System.out.printf("출석 점수(20) : %.1f", weightCS);
			System.out.println();
			System.out.println("총점 : " + total);
		
			if (total >= 70) {
				System.out.println("PASS");
			}
			else if (!(total >= 70)) {
				System.out.println("Fail [점수 미달]");
			}
		}
	}
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("10. 비밀번호 생성");
		System.out.print("선택 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		switch (select) {
		case 1 : practice1();
		break;
		case 2 : practice2();
		break;
		case 3 : practice3();
		break;
		case 4 : practice4();
		break;
		case 5 : practice5();
		break;
		case 6 : practice6();
		break;
		case 7 : practice7();
		break;
		case 8 : practice8();
		break;
		case 9 : practice9();
		break;
		case 10 : practice11();
		break;
		default : System.out.println("1~10 사이의 정수를 입력하세요");
		}
		
	}
	public void practice11() {
		System.out.print("비밀번호 입력(1000 ~ 9999) : ");
		String password = sc.nextLine();
		int intPass = Integer.parseInt(password);
		
		if (intPass > 9999 || intPass < 1000) {
			System.out.println("자리수 안맞음");
		}
		else {
			char pass1 = password.charAt(0);
			char pass2 = password.charAt(1);
			char pass3 = password.charAt(2);
			char pass4 = password.charAt(3);
			if(pass1 == pass2 || pass1 == pass3 || pass1 == pass4 ||
					pass2 == pass3 || pass2 == pass4 ||
					pass3 == pass4) {
				System.out.println("중복 값 있음. 실패.");
			}
			else {
				System.out.println("생성 성공.");
			}
		}
	}
}
