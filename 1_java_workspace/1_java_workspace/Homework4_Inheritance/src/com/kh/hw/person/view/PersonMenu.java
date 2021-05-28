package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	public Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int mainMenuSelect = 0;
		while (mainMenuSelect != 9) {
			mainMenuSelect = 0;
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			int sCount = pc.personCount()[0];
			System.out.printf("���� ����� �л��� %d�� �Դϴ�.\n", sCount);
			
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			int eCount = pc.personCount()[1];
			System.out.printf("���� ����� ����� %d�� �Դϴ�.\n", eCount);
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); 
			}
		}
	}
	
	public void studentMenu() {
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ����");
		System.out.println("9. ��������");
		int sCount = pc.personCount()[0];
		
		if (sCount == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			System.out.print("�޴� ��ȣ : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); studentMenu(); break;
			case 2 : printStudent(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); studentMenu();
			}
			
		}
		else {
			System.out.print("�޴� ��ȣ : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : insertStudent(); break;
			case 2 : printStudent(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); studentMenu();
			}
		}
	}
	
	public void employeeMenu() {
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("9. ��������");
		int eCount = pc.personCount()[1];
		
		if (eCount == 10) {
			System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			System.out.print("�޴� ��ȣ : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); employeeMenu(); break;
			case 2 : printEmployee(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); employeeMenu();
			}
			
		}
		else {
			System.out.print("�޴� ��ȣ : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : insertEmployee(); break;
			case 2 : printEmployee(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); employeeMenu();
			}
		}
	}
	
	public void insertStudent() {
		System.out.print("�л� �̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�л� ���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("�л� Ű : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("�л� ������ : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("�л� �г� : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.print("�л� ���� : ");
		String major = sc.nextLine();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		
		int sCount = pc.personCount()[0];
		
		if (sCount < 3) {
			System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("N")) {
				studentMenu();
			}
			else {
				insertStudent();
			}
		}
		else if(sCount == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
			studentMenu();
		}
		
	}
	
	public void printStudent() {
		Student[] ps = pc.printStudent();
		for(int i = 0; i < ps.length; i++) {
			String print = ps[i].toString();
			System.out.println(print);
		}
		studentMenu();
	}
	
	public void insertEmployee() {
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		
		System.out.print("��� ���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("��� Ű : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("��� ������ : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("��� �޿� : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.print("��� �μ� : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		int eCount = pc.personCount()[1];
		
		if (eCount < 10) {
			System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("N")) {
				employeeMenu();
			}
			else {
				insertEmployee();
			}
		}
		else if(eCount == 10) {
			System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
			employeeMenu();
		}
	}
	
	public void printEmployee() {
		Employee[] pe = pc.printEmployee();
		for(int i = 0; i < pe.length; i++) {
			String print = pe[i].toString();
			System.out.println(print);
		}
		employeeMenu();
	}
}
