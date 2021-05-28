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
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			int sCount = pc.personCount()[0];
			System.out.printf("현재 저장된 학생은 %d명 입니다.\n", sCount);
			
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			int eCount = pc.personCount()[1];
			System.out.printf("현재 저장된 사원은 %d명 입니다.\n", eCount);
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); 
			}
		}
	}
	
	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		int sCount = pc.personCount()[0];
		
		if (sCount == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			System.out.print("메뉴 번호 : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); studentMenu(); break;
			case 2 : printStudent(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); studentMenu();
			}
			
		}
		else {
			System.out.print("메뉴 번호 : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : insertStudent(); break;
			case 2 : printStudent(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); studentMenu();
			}
		}
	}
	
	public void employeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		int eCount = pc.personCount()[1];
		
		if (eCount == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			System.out.print("메뉴 번호 : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); employeeMenu(); break;
			case 2 : printEmployee(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); employeeMenu();
			}
			
		}
		else {
			System.out.print("메뉴 번호 : ");
			int studentMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (studentMenuSelect) {
			case 1 : insertEmployee(); break;
			case 2 : printEmployee(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); employeeMenu();
			}
		}
	}
	
	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학생 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("학생 키 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("학생 몸무게 : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("학생 학년 : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.print("학생 전공 : ");
		String major = sc.nextLine();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		
		int sCount = pc.personCount()[0];
		
		if (sCount < 3) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("N")) {
				studentMenu();
			}
			else {
				insertStudent();
			}
		}
		else if(sCount == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
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
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 키 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("사원 몸무게 : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("사원 급여 : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 부서 : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		int eCount = pc.personCount()[1];
		
		if (eCount < 10) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("N")) {
				employeeMenu();
			}
			else {
				insertEmployee();
			}
		}
		else if(eCount == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
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
