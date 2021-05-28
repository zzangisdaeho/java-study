package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("���α׷� ����"); finish = true; break;
			default : System.out.println("�߸��Է��� �ٽ��ϼ�");
			}
		}
	}
	public void addList() {
		System.out.println("**** ������ ��ġ�� �� �߰� ****");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		if(mc.addList(music)==1) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
	}
	public void addAtZero() {
		System.out.println("**** ù ��ġ�� �� �߰� ****");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		if(mc.addAtZero(music)==1) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
	}
	public void printAll() {
		System.out.println("**** ��ü �� ��� ��� ****");
		
		mc.printAll();
	}
	public void searchMusic() {
		System.out.println("**** Ư�� �� �˻� ****");
		System.out.print("�˻� �� �� �� : ");
		String title = sc.nextLine();
		
		Music m = mc.searchMusic(title);
		if(m != null) {
			System.out.println(m);
		}
		else {
			System.out.println("�˻��� ���� �����ϴ�.");
		}
	}
	public void removeMusic() {
		System.out.println("**** Ư�� �� ���� ****");
		System.out.print("���� �� �� �� : ");
		String title = sc.nextLine();
		
		Music m = mc.removeMusic(title);
		if(m != null) {
			System.out.println(m + " �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	public void setMusic() {
		System.out.println("**** Ư�� �� ���� ****");
		System.out.print("�˻� �� �� �� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �� �� �� : ");
		String newTitle = sc.nextLine();
		System.out.print("���� �� ���� �� : ");
		String newSinger = sc.nextLine();
		
		Music nMusic = new Music(newTitle, newSinger);
		
		Music result = mc.setMusic(title, nMusic);
		if(result != null) {
			System.out.println(result + " �� ���� ����Ǿ����ϴ�.");
		}
		else {
			System.out.println("������ ���� �����ϴ�.");
		}
		
	}
	public void ascTitle() {
		if(mc.ascTitle()==1) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
		
	}
	public void descSinger() {
		if(mc.descSinger()==1) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
		
	}
	
}
