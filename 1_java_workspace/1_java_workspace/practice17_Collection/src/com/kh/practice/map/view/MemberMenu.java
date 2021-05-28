package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("======== KH ����Ʈ ========");
		
		boolean finish = false;
		while(!finish) {
			System.out.println("******* ���� �޴� ********");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch(mainMenuSelect) {
			case 1 : joinMembership(); break;
			case 2 : logIn(); memberMenu(); break;
			case 3 : sameName(); break;
			case 9 : System.out.println("���α׷� ����"); finish = true; break;
			default : System.out.println("�� �߸��Է��� ������ ����??"); break;
			}
		}
	}
	public void memberMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("�޴� ��ȣ �Է� : ");
			int memberMenuSelect = Integer.parseInt(sc.nextLine());
			switch(memberMenuSelect) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("�α׾ƿ� �Ǿ����ϴ�"); finish = true; break;
			default : System.out.println("�װ͵� ���� �Է� ���ϳ� ����"); break;
			}
		}
	}
	public void joinMembership() {
		System.out.println("******* ȸ�� ���� �޴� ********");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		
		if (mc.joinMembership(id, m)) {
			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
		}
		else {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			joinMembership();
		}
	}
	public void logIn() {
		System.out.println("******* �α��� �޴� ********");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		
		String result = mc.logIn(id, password);
		if(result == null) {
			System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			logIn();
		}
		else {
			System.out.println(result + "��, ȯ���մϴ�!");
		}
	}
	public void changePassword() {
		System.out.println("******* ��й�ȣ ���� �޴� ********");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("���� ��й�ȣ : ");
		String oldPw = sc.nextLine();
		System.out.print("���ο� ��й�ȣ : ");
		String newPw = sc.nextLine();
		
		if(mc.changePassword(id, oldPw, newPw)) {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
		}
		else {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			changePassword();
		}
		
	}
	public void changeName() {
		System.out.println("******* �̸� ���� �޴� ********");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		
		String oldName = mc.logIn(id, password);
		if(oldName != null) {
			System.out.println("���� ������ �̸� : " + oldName);
			System.out.print("������ �̸� : ");
			String newName = sc.nextLine();
			
			mc.changeName(id, newName);
			System.out.println("�̸� ���濡 �����߽��ϴ�.");
		}
		else {
			System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���");
			changeName();
		}
	}
	public void sameName() {
		System.out.println("******* �̸����� �˻��ϱ� ********");
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		Set<Entry<String, Member>> setEntry = mc.sameName(name).entrySet();
		for(Entry<String, Member> e : setEntry) {
//			String searchedKey = e.getKey();
//			String searchedName = e.getValue().getName();
//			System.out.println(searchedName + "-" + searchedKey);
			System.out.println(e.getValue().getName() + "-" + e.getKey());
		}
	}
}
