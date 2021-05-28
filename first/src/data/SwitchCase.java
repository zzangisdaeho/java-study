package data;

import java.util.Scanner;

public class SwitchCase {
	Scanner sc = new Scanner(System.in);
	
	public void budInfo() {
		System.out.print("몇층갈꺼?");
		int level = Integer.parseInt(sc.nextLine());
		
		switch (level) {
		case 1 : 
			System.out.println(level +"층 약국입니다.");
			break;
		case 2 :
			System.out.println(level +"층 정형외과입니다.");
			break;
		case 3 :
			System.out.println(level +"층 피부과입니다.");
			break;
		case 4 :
			System.out.println(level +"층 치과입니다.");
			break;
		case 5 :
			System.out.println(level +"층 헬스 클럽입니다.");
			break;
		}
	}
}
