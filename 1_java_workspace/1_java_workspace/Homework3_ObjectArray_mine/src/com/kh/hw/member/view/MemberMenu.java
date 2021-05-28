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
			System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", MemberController.SIZE);
			
			int MemberNum = mc.existMemberNum();
			System.out.printf("현재 등록된 회원 수는 %d 명입니다.\n", MemberNum);
			
			if(MemberNum != 10 ) {
				System.out.println("1. 새 회원 등록");
			}
			else {
				System.out.println("회원 수가 모두 찼슴. 일부 메뉴만 오픈험 ㅎㅎ");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch (mainMenuSelect) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("프로그램 종료하겠슴"); break;
			default : System.out.println("잘못 눌렀슴. 다시 입력허셈.");
			}
		}
	}
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		
		String inputId = " ";
		while(mc.checkId(inputId)) {
			System.out.print("아이디 : ");
			inputId = sc.nextLine();
			if (mc.checkId(inputId)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
		
		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String inputPassword = sc.nextLine();
		
		System.out.print("이메일 : ");
		String inputEmail = sc.nextLine();
		
		char inputGender = ' ';
		while(true){
			System.out.print("성별(M/F) : ");
			inputGender = sc.nextLine().charAt(0);
			if (inputGender != 'M' && inputGender != 'm' &&
					inputGender != 'F' && inputGender != 'f') {
				System.out.println("성별을 다시 입력하세요.");
			}
			else {
				break;
			}
		}
		
		System.out.print("나이 : ");
		int inputAge = Integer.parseInt(sc.nextLine());
		
		
		mc.insertMember(inputId, inputName, inputPassword, inputEmail, inputGender, inputAge);
		
	}
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int searchMemberSelect = Integer.parseInt(sc.nextLine());
		
		switch (searchMemberSelect) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다"); mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다."); mainMenu();
		}
	}
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		if (mc.searchId(id)==null) {
			System.out.println("검색 결과가 없습니다.");
			mainMenu();
		}
		else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id));
			mainMenu();
		}
	}
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		Member[] searchName = mc.searchName(name);
		
		if(searchName.length == 0) {
			System.out.println("조회 결과 없습니다.");
		}
		else {
			for (int i = 0; i < searchName.length; i++) {
				System.out.println(searchName[i].inform());
			}
		}
		
		
	}
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();
		
		Member[] searchEmail = mc.searchEmail(email);
		if(searchEmail.length == 0) {
			System.out.println("조회 결과 없습니다.");
		}
		else {
			for (int i = 0; i < searchEmail.length; i++) {
				System.out.println(searchEmail[i].inform());
			}
		}
	}
	public void updateMember() {
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int updateMemberSelect = Integer.parseInt(sc.nextLine());
		
		switch (updateMemberSelect) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다"); mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다"); mainMenu(); break;
		}
	}
	public void updatePassword() {
		System.out.print("수정 할 회원 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("수정 할 비밀번호 : ");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void updateName() {
		System.out.print("수정 할 회원 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("수정 할 이름 : ");
		String name = sc.nextLine();
		
		if(mc.updateName(id, name)){
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void updateEmail() {
		System.out.print("수정 할 회원 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("수정 할 이메일 : ");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("1. 메뉴 번호 : ");
		int deleteMemberSelect = Integer.parseInt(sc.nextLine());
		
		switch (deleteMemberSelect) {
		case 1 : deleteOne(); break;
		case 2 : deleteAll(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다."); mainMenu(); break;
		}
		
	}
	public void deleteOne() {
		System.out.print("삭제할 회원 ID : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char choice = sc.nextLine().charAt(0);
//		mc.delete(id); //이게 있으면 먼저 삭제 후 조건식으로 들어가기때문에 안돼.
		if (choice == 'Y' || choice == 'y') {
			if (mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다");
			}
			else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		else {
			System.out.println("메인 메뉴로 돌아갑니다.");
		}
		mainMenu();
	}
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char choice = sc.nextLine().charAt(0);
		
		if (choice == 'Y' || choice == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
		else {
			System.out.println("메인 메뉴로 돌아갑니다.");
		}
		mainMenu();
	}
	public void printAll() {
		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
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
