package data;

import java.util.Scanner;

public class SwitchCase {
	Scanner sc = new Scanner(System.in);
	
	public void budInfo() {
		System.out.print("��������?");
		int level = Integer.parseInt(sc.nextLine());
		
		switch (level) {
		case 1 : 
			System.out.println(level +"�� �౹�Դϴ�.");
			break;
		case 2 :
			System.out.println(level +"�� �����ܰ��Դϴ�.");
			break;
		case 3 :
			System.out.println(level +"�� �Ǻΰ��Դϴ�.");
			break;
		case 4 :
			System.out.println(level +"�� ġ���Դϴ�.");
			break;
		case 5 :
			System.out.println(level +"�� �ｺ Ŭ���Դϴ�.");
			break;
		}
	}
}
