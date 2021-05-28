package com.kh.hw.view;

import java.util.Scanner;

import com.kh.hw.controller.Function;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Function fc = new Function();
	
	public void displayMenu() {
		int menuNum = 0;
		while (menuNum != 9)  {
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : fc.calculator(); return; //return 을 break; 로 바꿀시 메소드 진행 후 메뉴로 자동으로 돌아옴.
			case 2 : fc.totalCalculator(); return;
			case 3 : fc.printProfile(); return;
			case 4 : fc.printScore(); return;
			case 5 : fc.printStarNumber(); return;
			case 6 : fc.sumRandom(); return;
			case 7 : fc.exceptGugu(); return;
			case 8 : fc.diceGame(); return;
			case 9 : System.out.println("종료합니다"); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		
		}
	}
}
