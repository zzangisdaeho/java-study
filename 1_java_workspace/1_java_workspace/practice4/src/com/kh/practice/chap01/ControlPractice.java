package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1 : System.out.println("�Է� �޴��Դϴ�.");
		break;
		case 2 : System.out.println("���� �޴��Դϴ�.");
		break;
		case 3 : System.out.println("��ȸ �޴��Դϴ�.");
		break;
		case 4 : System.out.println("���� �޴��Դϴ�.");
		break;
		case 7 : System.out.println("���� �޴��Դϴ�.");
		break;
		default : System.out.println("�˸��� ���� �޴� ��ȣ �Դϴ�.");
		break;
		}
		
	}
	public void practice2() {
		System.out.print("����� �Է��� �ּ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num % 2 == 0) {
			System.out.println("¦����");
		}
		else if (num % 2 == 1){
			System.out.println("Ȧ����");
		}
		else {
			System.out.println("����� �Է��� �ּ���");
		}
	}
	public void practice3() {
		System.out.print("���� ���� �Է� : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� �Է� : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� �Է� : ");
		int math = Integer.parseInt(sc.nextLine());
		
		int total = kor + eng + math;
		double avg = total / (double)3;
		System.out.println(avg);
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + total);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	public void practice4() {
		System.out.print("�˻��� ���� �Է��ϼ���(1~12) : ");
		int month = Integer.parseInt(sc.nextLine());
		String season = ""; //���� �ʱ�ȭ�� ��Ű��
		
		if (month>=1 && month<=12) {
			switch (month) {
			case 12 : case 1 : case 2 : season = "�ܿ�";
			break;
			case 3 : case 4 : case 5 : season = "��";
			break;
			case 6 : case 7 : case 8 : season = "����";
			break;
			case 9 : case 10 : case 11 : season = "�ܿ�";
			break;
			}
			System.out.println(month + "���� " + season + "�Դϴ�.");
		}
		else {
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	public void practice5() {
		String id = "myId";
		String pass = "myPassword12";
		
		System.out.print("���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String inputPass = sc.nextLine();
		
		if (inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("�α��� ����");
		}
		else if (!inputId.equals(id) && inputPass.equals(pass)){
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
		}
		else if (inputId.equals(id) && !inputPass.equals(pass)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
		else {
			System.out.println("���̵�� ��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
	}
	public void practice6() {
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String author = sc.nextLine();
		String l1 = "�Խñ� ��ȸ";
		String l2 = "�Խñ� �ۼ�, ��� �ۼ�";
		String l3 = "ȸ������, �Խñ� ����";
		
		
		switch (author) {
		case "������" : System.out.println(l1+", "+l2+", "+l3);
		break;
		case "ȸ��" : System.out.println(l1+", "+l2);
		break;
		case "��ȸ��" : System.out.println(l1);
		break;
		default : System.out.println("������, ȸ��, ��ȸ�� �� �ϳ��� �Է��� �ּ���");
		}
	}
	public void practice7() {
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI ���� : "+bmi);
		if (bmi<18.5) {
			System.out.println("��ü��");
		}
		else if (bmi<23) {
			System.out.println("����ü��");
		}
		else if (bmi<25) {
			System.out.println("��ü��");
		}
		else if (bmi<30) {
			System.out.println("��");
		}
		else {
			System.out.println("����");
		}
	}
	public void practice8() {
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("�����ڸ� �Է�(+, -, *, /) : ");
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
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			if (op == '+' || op == '-' || op == '*' || op == '/') {
				System.out.println
				(num1 + " " + op + " " + num2 + " = " + result);
			}
		}
	}
	public void practice9() {
		System.out.print("�߰� ��� ���� : ");
		int mScore = Integer.parseInt(sc.nextLine());
		System.out.print("�⸻ ��� ���� : ");
		int fScore = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� : ");
		int aScore = Integer.parseInt(sc.nextLine());
		System.out.print("�⼮ ȸ�� : ");
		int cScore = Integer.parseInt(sc.nextLine());
//		System.out.println(cScore);
		
		double weightMS = mScore * 0.2;
		double weightFS = fScore * 0.3;
		double weightAS = aScore * 0.3;
		double weightCS = ((double)cScore /(double)20 * 100) * 0.2;
//		System.out.println(weightCS);
		if (!(cScore>14)) {
			System.out.printf("Fail [�⼮ ȸ�� ���� (%d/20)]", cScore);
			System.out.println();
		}
		else {
			double total = weightMS + weightFS + weightAS + weightCS;
		
			System.out.println("==========���=========");
			System.out.println("�߰� ��� ����(20) : " + weightMS);
			System.out.println("�⸻ ��� ����(30) : " + weightFS);
			System.out.println("���� ����(30) : " + weightAS);
			System.out.printf("�⼮ ����(20) : %.1f", weightCS);
			System.out.println();
			System.out.println("���� : " + total);
		
			if (total >= 70) {
				System.out.println("PASS");
			}
			else if (!(total >= 70)) {
				System.out.println("Fail [���� �̴�]");
			}
		}
	}
	public void practice10() {
		System.out.println("������ ����� �����ϼ���");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦�� / Ȧ��");
		System.out.println("3. �հ� / ���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.println("10. ��й�ȣ ����");
		System.out.print("���� : ");
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
		default : System.out.println("1~10 ������ ������ �Է��ϼ���");
		}
		
	}
	public void practice11() {
		System.out.print("��й�ȣ �Է�(1000 ~ 9999) : ");
		String password = sc.nextLine();
		int intPass = Integer.parseInt(password);
		
		if (intPass > 9999 || intPass < 1000) {
			System.out.println("�ڸ��� �ȸ���");
		}
		else {
			char pass1 = password.charAt(0);
			char pass2 = password.charAt(1);
			char pass3 = password.charAt(2);
			char pass4 = password.charAt(3);
			if(pass1 == pass2 || pass1 == pass3 || pass1 == pass4 ||
					pass2 == pass3 || pass2 == pass4 ||
					pass3 == pass4) {
				System.out.println("�ߺ� �� ����. ����.");
			}
			else {
				System.out.println("���� ����.");
			}
		}
	}
}
