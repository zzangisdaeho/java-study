package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	Scanner sc = new Scanner(System.in);
	
	//���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
	//�ش��ϴ� ���� ���� ��� default�� ��ɹ� ����
	//case�� ���๮ ���̿��� : (�ݸ�)�� ����ϸ�
	// break�� ������ ������ �ʰ� ��� ������
	
	//Switch(����){
	// case 1 : ���๮ 1; break; --> ���� ���� 1�� ��� ����
	// case 2 : ���๮ 2; break; --> ���� ���� 2�� ��� ����
	// default : ���๮ 3; break; --> ������ ���� case���� ���� ��� ����
	//}
	
	public void method1() {
		//���� �� ���� ���� ��ȣ ���� 1���� �Է� �޾Ƽ�
		//���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϱ�
		System.out.print("���� 1 �Է� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� 2 �Է� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("���� ��ȣ �Է�(+, -, *, /) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0; //�׻� �ʱ�ȭ �س��� ���� �߿�
		
		switch(op) {
		case '+' : result = num1 + num2;
		break;
		
		case '-' : result = num1 - num2;
		break;
		
		case '*' : result = num1 * num2;
		break;
		
		case '/' : result = num1 / num2;
		break;
		
		default : System.out.println("4 ��ȣ�� �ϳ��� �Է��ϼ���");
		break;
		}
		if (op == '+' || op =='-' || op == '*' || op == '/') {
			System.out.println(num1 + " " + op + " "+num2+" = "+result);
		}
	}
	public void method2() {
		// ���ϰ��Կ��� �� ������ �Է� ���� ���� ������ ����ϴ� �޼ҵ�
		// ��� : 1000��, ������ : 2000��, Ű�� : 5000��
		// ������ "�߸��Է��ϼ̽��ϴ�"
		System.out.print("��� ������ Ű�� �� �ϳ��� �Է��ϼ��� : ");
		String fruit = sc.nextLine();
		int price = 0; //�ʱ�ȭ ����!!!
		
		switch (fruit) {
		case "���" : price = 1000;
		break;
		case "������" : price = 2000;
		break;
		case "Ű��" : price = 5000;
		break;
		default : System.out.println("��� ������ Ű�� �� ���� ������ �Դϴ�.");
		break;
		}
		//if (fruit == "���" || fruit == "������" || fruit == "Ű��")// ���ڿ� �񱳴� .equals�� �ؾ���;; 
		if (fruit.equals("���") || fruit.equals("������") || fruit.equals("Ű��")) {	
			System.out.println(fruit + " : "+price+"��");
		}
	}
	public void method3() {
		//1���� 12������ ���� �Է� �޾� �ش��ϴ� ���� ���� ������ ��¥ ���
		System.out.print("�˻��ϰ��� �ϴ� ���� �Է��ϼ���(1~12) : ");
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
		default : System.out.println("1~12 ���̷� �Է��ϼ���");
		break;
		}
		System.out.println(month + "���� ������ ���� " + lastday + "�Դϴ�");
		
	}
	public void method4() {
		//����ڰ� �Է��� ��ȣ�� ���� �ش� ��ȣ�� �´� �޴� ����
		System.out.println("���Ͻô� ��ȣ�� �����ϼ���");
		System.out.println("1. ȸ�� ���");
		System.out.println("2. ȸ�� ����");
		System.out.println("3. ȸ�� ����");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1 :
			System.out.println("ȸ�� ��� �޴��Դϴ�");
			break;
		case 2 :
			System.out.println("ȸ�� ���� �޴��Դϴ�");
			break;
		case 3 :
			System.out.println("ȸ�� ���� �޴��Դϴ�");
			break;
		}
	}
	
}
