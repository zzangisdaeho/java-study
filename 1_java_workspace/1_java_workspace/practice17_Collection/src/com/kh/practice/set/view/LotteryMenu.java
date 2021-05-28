package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch(mainMenuSelect) {
			case 1 : insertObject(); break;
			case 2 : deleteObject(); break;
			case 3 : winObject(); break;
			case 4 : sortedWinObject(); break;
			case 5 : searchWinner(); break;
			case 9 : System.out.println("�ý��� �����մϴ�"); finish = true; break;
			default : System.out.println("�߸� �Է��Ͻ� �ٽ��ϼ�");
			}
		}
	}
	public void insertObject() {
		System.out.print("�߰��� ��÷ ��� �� : ");
		int theNumberOfSlot = Integer.parseInt(sc.nextLine());
		int successCount = 0;
		
		for (int i = 0; i < theNumberOfSlot; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ ('-'����) : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			if(lc.insertObject(l)) {
				successCount++;
			}
			else {
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
				i--;
			}
		}
		System.out.println(successCount + "�� �߰� �Ϸ�Ǿ����ϴ�.");
	}
	public void deleteObject() {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ ('-'����) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		if(lc.deleteObject(l)) {
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
	public void winObject() {
		System.out.println(lc.winObject());
	}
	public void sortedWinObject() {
//		System.out.println(lc.sortedWinObject());
		
		TreeSet<Lottery> ts = lc.sortedWinObject();
		Iterator<Lottery> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ ('-'����) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		if (lc.searchWinner(l)) {
			System.out.println("������ ��÷�ǽ� ��");
		}
		else {
			System.out.println("�ȵɳ��� ���ص� �ȵǴ���");
		}
	}
	
}
