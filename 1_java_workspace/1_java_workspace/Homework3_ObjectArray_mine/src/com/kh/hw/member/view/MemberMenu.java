package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu(){}
	
	public void mainMenu() {
		
		int mainMenuSelect = 0;
		while(mainMenuSelect != 9) {
			System.out.printf("�ִ� ��� ������ ȸ�� ���� %d���Դϴ�.\n", MemberController.SIZE);
			
			int MemberNum = mc.existMemberNum();
			System.out.printf("���� ��ϵ� ȸ�� ���� %d ���Դϴ�.\n", MemberNum);
			
			if(MemberNum != 10 ) {
				System.out.println("1. �� ȸ�� ���");
			}
			else {
				System.out.println("ȸ�� ���� ��� á��. �Ϻ� �޴��� ������ ����");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("���α׷� �����ϰڽ�"); break;
			default : System.out.println("�߸� ������. �ٽ� �Է����.");
			}
		}
	}
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		
		String inputId = " ";
		while(mc.checkId(inputId)) {
			System.out.print("���̵� : ");
			inputId = sc.nextLine();
			if (mc.checkId(inputId)) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		System.out.print("�̸� : ");
		String inputName = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String inputPassword = sc.nextLine();
		
		System.out.print("�̸��� : ");
		String inputEmail = sc.nextLine();
		
		char inputGender = ' ';
		while(true){
			System.out.print("����(M/F) : ");
			inputGender = sc.nextLine().charAt(0);
			if (inputGender != 'M' && inputGender != 'm' &&
					inputGender != 'F' && inputGender != 'f') {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
			else {
				break;
			}
		}
		
		System.out.print("���� : ");
		int inputAge = Integer.parseInt(sc.nextLine());
		
		
		mc.insertMember(inputId, inputName, inputPassword, inputEmail, inputGender, inputAge);
		
	}
	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int searchMemberSelect = Integer.parseInt(sc.nextLine());
		
		switch (searchMemberSelect) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�"); mainMenu(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); mainMenu();
		}
	}
	public void searchId() {
		System.out.print("�˻��� ���̵� : ");
		String id = sc.nextLine();
		if (mc.searchId(id)==null) {
			System.out.println("�˻� ����� �����ϴ�.");
			mainMenu();
		}
		else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchId(id));
			mainMenu();
		}
	}
	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		Member[] searchName = mc.searchName(name);
		
		if(searchName.length == 0) {
			System.out.println("��ȸ ��� �����ϴ�.");
		}
		else {
			for (int i = 0; i < searchName.length; i++) {
				System.out.println(searchName[i].inform());
			}
		}
		
		
	}
	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.nextLine();
		
		Member[] searchEmail = mc.searchEmail(email);
		if(searchEmail.length == 0) {
			System.out.println("��ȸ ��� �����ϴ�.");
		}
		else {
			for (int i = 0; i < searchEmail.length; i++) {
				System.out.println(searchEmail[i].inform());
			}
		}
	}
	public void updateMember() {
		System.out.println("1.��й�ȣ �����ϱ�");
		System.out.println("2.�̸� �����ϱ�");
		System.out.println("3.�̸��� �����ϱ�");
		System.out.println("9.�������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int updateMemberSelect = Integer.parseInt(sc.nextLine());
		
		switch (updateMemberSelect) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�"); mainMenu(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�"); mainMenu(); break;
		}
	}
	public void updatePassword() {
		System.out.print("���� �� ȸ�� ���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("���� �� ��й�ȣ : ");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id, password)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	public void updateName() {
		System.out.print("���� �� ȸ�� ���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("���� �� �̸� : ");
		String name = sc.nextLine();
		
		if(mc.updateName(id, name)){
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	public void updateEmail() {
		System.out.print("���� �� ȸ�� ���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("���� �� �̸��� : ");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id, email)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("1. �޴� ��ȣ : ");
		int deleteMemberSelect = Integer.parseInt(sc.nextLine());
		
		switch (deleteMemberSelect) {
		case 1 : deleteOne(); break;
		case 2 : deleteAll(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�."); mainMenu(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); mainMenu(); break;
		}
		
	}
	public void deleteOne() {
		System.out.print("������ ȸ�� ID : ");
		String id = sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		char choice = sc.nextLine().charAt(0);
//		mc.delete(id); //�̰� ������ ���� ���� �� ���ǽ����� ���⶧���� �ȵ�.
		if (choice == 'Y' || choice == 'y') {
			if (mc.delete(id)) {
				System.out.println("���������� �����Ͽ����ϴ�");
			}
			else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			}
		}
		else {
			System.out.println("���� �޴��� ���ư��ϴ�.");
		}
		mainMenu();
	}
	public void deleteAll() {
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		char choice = sc.nextLine().charAt(0);
		
		if (choice == 'Y' || choice == 'y') {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("���� �޴��� ���ư��ϴ�.");
		}
		mainMenu();
	}
	public void printAll() {
		if (mc.existMemberNum() == 0) {
			System.out.println("����� ȸ���� �����ϴ�.");
			mainMenu();
		}
		else {
			Member[] m = mc.printAll();
			for (int i = 0; i < m.length; i++) {
				if (m[i].getId() == " ") {
					continue;
				}
				else {
					System.out.println(m[i].inform());
				}
			}
			mainMenu();
		}
	}
}
