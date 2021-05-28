package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_Dowhile {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// Ű����� ���ڿ��� �Է� �޴µ� exit�� ������ �ݺ� ����
		
		String str = "";
		
		while(!str.equals("exit")) {
			System.out.print("���ڿ��� �Է��Ͻÿ� (exit�� ����) : ");
			str =  sc.nextLine();
			System.out.println("str : " + str);
		}
	}
	
	public void method1_1() {
		String str = null;
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : "+str);
		}
		while(!str.equals("exit"));
	}
	
	public void method2(){
		System.out.println("1. �׽�Ʈ1");
		System.out.println("2. �׽�Ʈ2");
		System.out.println("3. �׽�Ʈ3");
		System.out.println("9. ����");
		
		int menuNum = 0;
		
		do {
			System.out.print("�޴� ���� : ");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
			case 9 : System.out.println("�����մϴ�"); break;
			default : System.out.println("�ùٸ� ��ȣ�� �Է��ض�");
			}
		}
		while(menuNum != 9);
	}
	
	public void method3(){
		int menuNum;
		do {
			System.out.println("1. �׽�Ʈ1");
			System.out.println("2. �׽�Ʈ2");
			System.out.println("3. �׽�Ʈ3");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
			case 9 : System.out.println("�����մϴ�"); break; // return���� ���ܰ�� ��Ż (��������)
			default : System.out.println("�ùٸ� ��ȣ�� �Է��ض�");
			}
		}
		while(menuNum!=0); //���� �ݺ��϶�
	}
	

	public void method4(){
		//���� �ϳ��� �Է¹޾� �� ���� 1~9 ������ ���� ���� �� ���� ������ ���
		//������ ���� ������ "1~9������ ����� �Է��Ͽ��� �մϴ�. ���
		System.out.print("���� : ");
		int ran = (int)(Math.random()*9+1);
		System.out.println(ran);
//		int num = Integer.parseInt(sc.nextLine());
		
		if (!(ran <= 9) || !(ran >=1)) {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
		else {
			for(int i = 1;i <10; i++) {
				System.out.printf("%d * %d = %d\n", ran,i,(ran*i));
			}
		}
	}
}
