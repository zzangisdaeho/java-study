package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member; // 나중에 다시만들어보자 null로

public class MemberController {
	private Member[] m  = new Member[SIZE];
	public static final int SIZE = 10;
		
//	for(int i = 0; i < m.length; i++) {
//		m[i] = new Member();
//	}
	// 왜 여기서 객체생성이 안돼.
	
//	m[0] = new Member();
	// 인생 이것도안되네
	
	public MemberController() {
		for(int i = 0; i < m.length; i++) {
		m[i] = new Member();
		}
	}
	
	
	public int existMemberNum() {
		int MemberNum = 0;
		for (int i = 0 ; i < m.length; i++) {
//			if(!m[i].getId().equals(null)) {
			if(m[i].getId() != " ") { //이건 왜 에러가 안나지?? equals가 아닌뎁? 초기화시 주소가 같아서라는데? 이해는 못하겠다.
				MemberNum++;
			}
//			if(m[i] != null) {
//				MemberNum++;
//			}
		}
		return MemberNum;
	}
	
	public boolean checkId(String inputId) {
		for (int i = 0 ; i < m.length; i++) {
			if (m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	public void insertMember(String id, String name, String password, 
			String email, char gender, int age) {
		for (int i = 0 ; i < m.length; i++) {
			if (m[i].getId().equals(" ")) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	public String searchId(String id) {
		String find = null;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				find = (m[i].inform());
			}
		}
		return find; 
	}
	public Member[] searchName(String name) {
		Member[] searchName;
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().equals(name)) {
				 count++;
			}
		}
		searchName = new Member[count];
		count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().equals(name)) {
				searchName[count] = m[i];
				count++;
			}
		}
		
		return searchName;
	}
	public Member[] searchEmail(String email) {
		Member[] searchEmail;
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getEmail().equals(email)) {
				 count++;
			}
		}
		searchEmail = new Member[count];
		count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getEmail().equals(email)) {
				searchEmail[count] = m[i];
				count++;
			}
		}
		return searchEmail;
	}
	public boolean updatePassword(String id, String password) {
		boolean check = checkId(id);
		boolean result = false;
		if (check) {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getId().equalsIgnoreCase(id)) {
					m[i].setPassword(password);
					result = true;
				}
			}
		}
		else {
			result = false;
		}
		return result;
	}
	public boolean updateName(String id, String name) {
		boolean check = checkId(id);
		boolean result = false;
		if (check) {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getId().equalsIgnoreCase(id)) {
					m[i].setName(name);
					result = true;
				}
			}
		}
		else {
			result = false;
		}
		return result;
	}
	public boolean updateEmail(String id, String email) {
		boolean check = checkId(id);
		boolean result = false;
		if (check) {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getId().equalsIgnoreCase(id)) {
					m[i].setEmail(email);
					result = true;
				}
			}
		}
		else {
			result = false;
		}
		return result;
	}
	public boolean delete(String id) {
		boolean check = checkId(id);
		boolean result = false;
		if (check) {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getId().equalsIgnoreCase(id)) {
					m[i] = new Member();
					result = true;
				}
			}
		}
		else {
			result = false;
		}
		return result;
	}
	public void delete(){
		for (int i = 0; i < m.length; i++) {
			m[i] = new Member();
		}
	}
	public Member[] printAll() {
		return m;
	}
}
