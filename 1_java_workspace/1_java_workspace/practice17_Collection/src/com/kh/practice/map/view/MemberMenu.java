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
		System.out.println("======== KH 사이트 ========");
		
		boolean finish = false;
		while(!finish) {
			System.out.println("******* 메인 메뉴 ********");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int mainMenuSelect = Integer.parseInt(sc.nextLine());
			switch(mainMenuSelect) {
			case 1 : joinMembership(); break;
			case 2 : logIn(); memberMenu(); break;
			case 3 : sameName(); break;
			case 9 : System.out.println("프로그램 종료"); finish = true; break;
			default : System.out.println("님 잘못입력함 ㅋㅋㅋ 병ㅅ??"); break;
			}
		}
	}
	public void memberMenu() {
		boolean finish = false;
		while(!finish) {
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int memberMenuSelect = Integer.parseInt(sc.nextLine());
			switch(memberMenuSelect) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("로그아웃 되었습니다"); finish = true; break;
			default : System.out.println("그것도 재대로 입력 못하냐 ㅋㅋ"); break;
			}
		}
	}
	public void joinMembership() {
		System.out.println("******* 회원 가입 메뉴 ********");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		
		if (mc.joinMembership(id, m)) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		}
		else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			joinMembership();
		}
	}
	public void logIn() {
		System.out.println("******* 로그인 메뉴 ********");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String result = mc.logIn(id, password);
		if(result == null) {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			logIn();
		}
		else {
			System.out.println(result + "님, 환영합니다!");
		}
	}
	public void changePassword() {
		System.out.println("******* 비밀번호 번경 메뉴 ********");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();
		
		if(mc.changePassword(id, oldPw, newPw)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		}
		else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			changePassword();
		}
		
	}
	public void changeName() {
		System.out.println("******* 이름 번경 메뉴 ********");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String oldName = mc.logIn(id, password);
		if(oldName != null) {
			System.out.println("현재 설정된 이름 : " + oldName);
			System.out.print("변경할 이름 : ");
			String newName = sc.nextLine();
			
			mc.changeName(id, newName);
			System.out.println("이름 변경에 성공했습니다.");
		}
		else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			changeName();
		}
	}
	public void sameName() {
		System.out.println("******* 이름으로 검색하기 ********");
		System.out.print("검색할 이름 : ");
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
