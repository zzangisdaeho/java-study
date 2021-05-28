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
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
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
			case 9 : System.out.println("프로그램 종료"); finish = true; break;
			default : System.out.println("잘못입력함 다시하셈");
			}
		}
	}
	public void addList() {
		System.out.println("**** 마지막 위치에 곡 추가 ****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		if(mc.addList(music)==1) {
			System.out.println("저장 성공");
		}
		else {
			System.out.println("저장 실패");
		}
	}
	public void addAtZero() {
		System.out.println("**** 첫 위치에 곡 추가 ****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		if(mc.addAtZero(music)==1) {
			System.out.println("저장 성공");
		}
		else {
			System.out.println("저장 실패");
		}
	}
	public void printAll() {
		System.out.println("**** 전체 곡 목록 출력 ****");
		
		mc.printAll();
	}
	public void searchMusic() {
		System.out.println("**** 특정 곡 검색 ****");
		System.out.print("검색 할 곡 명 : ");
		String title = sc.nextLine();
		
		Music m = mc.searchMusic(title);
		if(m != null) {
			System.out.println(m);
		}
		else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	public void removeMusic() {
		System.out.println("**** 특정 곡 삭제 ****");
		System.out.print("삭제 할 곡 명 : ");
		String title = sc.nextLine();
		
		Music m = mc.removeMusic(title);
		if(m != null) {
			System.out.println(m + " 삭제하였습니다.");
		}
		else {
			System.out.println("삭제할 곡이 없습니다.");
		}
	}
	public void setMusic() {
		System.out.println("**** 특정 곡 수정 ****");
		System.out.print("검색 할 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 할 곡 명 : ");
		String newTitle = sc.nextLine();
		System.out.print("수정 할 가수 명 : ");
		String newSinger = sc.nextLine();
		
		Music nMusic = new Music(newTitle, newSinger);
		
		Music result = mc.setMusic(title, nMusic);
		if(result != null) {
			System.out.println(result + " 의 값이 변경되었습니다.");
		}
		else {
			System.out.println("수정할 곡이 없습니다.");
		}
		
	}
	public void ascTitle() {
		if(mc.ascTitle()==1) {
			System.out.println("정렬 성공");
		}
		else {
			System.out.println("정렬 실패");
		}
		
	}
	public void descSinger() {
		if(mc.descSinger()==1) {
			System.out.println("정렬 성공");
		}
		else {
			System.out.println("정렬 실패");
		}
		
	}
	
}
