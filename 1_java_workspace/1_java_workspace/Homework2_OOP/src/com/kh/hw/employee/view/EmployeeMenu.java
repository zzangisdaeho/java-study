package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		int opEmployeeMenu = 0;
		
		while(opEmployeeMenu != 9) {
			
			System.out.println("1. ��� �߰� : ");
			System.out.println("2. ��� ���� : ");
			System.out.println("3. ��� ���� : ");
			System.out.println("4. ��� ��� : ");
			System.out.println("9. ���α׷� ���� : ");
			System.out.print("�޴� ��ȣ�� �������� : ");
			opEmployeeMenu = Integer.parseInt(sc.nextLine());
			
			switch (opEmployeeMenu) {
			case 1 : insertEmp(); break;
			case 2 : updateEmp(); break;
			case 3 : deleteEmp(); break;
			case 4 : printEmp(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	
	public void insertEmp() {
		System.out.print("��� ��ȣ : ");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		System.out.print("��� ���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�? (y/n) : ");
		String choice = sc.nextLine();
//		if ((choice.toLowerCase()).equals("y"))
//		if (choice.toUpperCase().equals("Y"))
		if (choice.equalsIgnoreCase("y")) {
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			System.out.print("��� ���� : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("���ʽ� �� : ");
			double bonus = Double.parseDouble(sc.nextLine());
			
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		}
		else {
			ec.add(empNo, name, gender, phone);
		}
	}
	
	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� : ");
		int  opUpdateEmp = Integer.parseInt(sc.nextLine());
		switch (opUpdateEmp) {
		case 1 : 
			System.out.print("������ ��ȭ��ȣ : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case 2 : 
			System.out.print("������ ��� ���� : ");
			int salary = Integer.parseInt(sc.nextLine());
			ec.modify(salary);
			break;
		case 3 :
			System.out.print("������ ���ʽ� �� : ");
			double bonus = Double.parseDouble(sc.nextLine());
			ec.modify(bonus);
			break;
		case 9 : 
			System.out.println("���θ޴��� ���ư��ϴ�");
			return;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			return;
		}
	}
	
	public void deleteEmp() {
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		String opDeleteEmp = sc.nextLine();
		if (opDeleteEmp.equalsIgnoreCase("y")) {
			ec.remove();
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		}
	}
	
	public void printEmp() {
		if (ec.inform() == null) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println(ec.inform());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
