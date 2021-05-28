package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
			
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1: insertMember(); break;
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		} while(menuNum != 9);
		
	}

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		boolean check = false;
		String id = null;
		do {
			System.out.print("아이디 : ");
			String inputId = sc.next();
			check = mc.checkId(inputId);
			if(check) {
				id = inputId;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		} while(!check);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		
		String genderStr = null;
		char gender = ' ';
		do {
			System.out.print("성별(M/F) : ");
			genderStr = sc.next();
			if(genderStr.toUpperCase().equals("M") || genderStr.toUpperCase().equals("F")) {
				gender = genderStr.charAt(0);
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		} while(!genderStr.toUpperCase().equals("M") && !genderStr.toUpperCase().equals("F"));
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		String result = mc.searchId(id);
		
		if(result == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}
		System.out.println();
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		Member[] result = mc.searchName(name);
		int count = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] != null) {
				count++;
				break;
			}
		}
		
		if(count == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i = 0; i < result.length; i++) {
				if(result[i] != null) {
					System.out.println(result[i].inform());
				}
			}
		}
		System.out.println();
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		Member[] result = mc.searchEmail(email);
		int count = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] != null) {
				count++;
				break;
			}
		}
		
		if(count == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i = 0; i < result.length; i++) {
				if(result[i] != null) {
					System.out.println(result[i].inform());
				}
			}
		}
		System.out.println();
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		boolean check = mc.updatePassword(id, password);
		if(check) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		System.out.println();
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		boolean check = mc.updateName(id, name);
		if(check) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		System.out.println();
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		boolean check = mc.updateEmail(id, email);
		if(check) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		System.out.println();
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		if(sc.next().toUpperCase().equals("Y")) {
			boolean check = mc.delete(id);
			if(check) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		System.out.println();
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		if(sc.next().toUpperCase().equals("Y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
		System.out.println();
	}
	
	public void printAll() {
		Member[] m = mc.printAll();
		
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null) {
					System.out.println(m[i].inform());
				}
			}
		}
		System.out.println();
	}
}
