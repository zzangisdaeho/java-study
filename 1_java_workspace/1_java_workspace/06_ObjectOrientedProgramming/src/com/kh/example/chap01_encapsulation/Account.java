package com.kh.example.chap01_encapsulation;

public class Account {
	// �ɹ� �ʵ� = �ɹ� ���� = �ʵ� = ��������
	private String name = "�ڽſ�";
	private String phone = "010-9468-8140";
	private String pwd = "password";
	private int bankCode = 3030;
	private int balance = 0; //�ܾ�
	
	
	
	
	
	
	public void method() {
		int a = 10; // ��������
	}
	
	
	public void deposit(int money) {
		//�Ա��� ���� �޼ҵ�
		if (money > 0 ) {
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
			balance += money;
			
		}
		else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	public void withdraw(int money) {
		//����� ���� �޼ҵ�
		
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� "+ money + "���� ��ݵǾ����ϴ�.");
			
		}
		else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ��� " + balance + "�� �Դϴ�.");
	}
}
