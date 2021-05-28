package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member; // ���߿� �ٽø����� null��

public class MemberController {
	private Member[] m  = new Member[SIZE];
	public static final int SIZE = 10;
		
//	for(int i = 0; i < m.length; i++) {
//		m[i] = new Member();
//	}
	// �� ���⼭ ��ü������ �ȵ�.
	
//	m[0] = new Member();
	// �λ� �̰͵��ȵǳ�
	
	public MemberController() {
		for(int i = 0; i < m.length; i++) {
		m[i] = new Member();
		}
	}
	
	
	public int existMemberNum() {
		int MemberNum = 0;
		for (int i = 0 ; i < m.length; i++) {
//			if(!m[i].getId().equals(null)) {
			if(m[i].getId() != " ") { //�̰� �� ������ �ȳ���?? equals�� �ƴѵ�? �ʱ�ȭ�� �ּҰ� ���Ƽ���µ�? ���ش� ���ϰڴ�.
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
