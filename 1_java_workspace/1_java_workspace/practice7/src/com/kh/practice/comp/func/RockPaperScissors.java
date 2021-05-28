package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);
	
	public void rps() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		int dualNum = 0;
		int userWinNum = 0;
		int userLoseNum = 0;
		int userDrawNum = 0;
		
		while (true) {
			double ran = (Math.random()*10);
			System.out.println(ran);
			
			String comChoice = null;
			if (ran<=3.3333333333) {
				comChoice = "가위";
			}
			else if (ran <= 6.6666666666) {
				comChoice = "바위";
			}
			else {
				comChoice = "보";
			}
			
			System.out.print("가위, 바위, 보??? : ");
			String userChoice = sc.nextLine();
			
			if (userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보")) {
			}
			else if (userChoice.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패"
						, dualNum, userWinNum, userDrawNum, userLoseNum);
				break;
			}
			else {
				System.out.println("가위, 바위, 보 중에 입력하라는게 그렇게나 힘들더냐");
				continue;
			}
//			if (userChoice.equals("exit")) {
//				System.out.printf("%d전 %d승 %d무 %d패"
//						, dualNum, userWinNum, userDrawNum, userLoseNum);
//				break;
//			}
//			else if (!userChoice.equals("가위") && !userChoice.equals("바위") && !userChoice.equals("보")) {
//				System.out.println("가위, 바위, 보 중에 입력하라는게 그렇게나 힘들더냐");
//				continue;
//			}
			
			
			System.out.println("컴퓨터 : " + comChoice);
			System.out.println(name + " : " + userChoice);
			
			if (userChoice.equals("가위") && comChoice.equals("바위")) {
				System.out.println("졌습니다 ㅠㅠ");
				dualNum++;
				userLoseNum++;
			}
			else if (userChoice.equals("가위") && comChoice.equals("보")) {
				System.out.println("이겼습니다!");
				dualNum++;
				userWinNum++;
			}
			else if (userChoice.equals("바위") && comChoice.equals("가위")) {
				System.out.println("이겼습니다!");
				dualNum++;
				userWinNum++;
			}
			else if (userChoice.equals("바위") && comChoice.equals("보")) {
				System.out.println("졌습니다 ㅠㅠ");
				dualNum++;
				userLoseNum++;
			}
			else if (userChoice.equals("보") && comChoice.equals("가위")) {
				System.out.println("졌습니다 ㅠㅠ");
				dualNum++;
				userLoseNum++;
			}
			else if (userChoice.equals("보") && comChoice.equals("바위")) {
				System.out.println("이겼습니다!");
				dualNum++;
				userWinNum++;
			}
			else {
				System.out.println("비겼습니다.");
				dualNum++;
				userDrawNum++;
			}
		}
	}
}
