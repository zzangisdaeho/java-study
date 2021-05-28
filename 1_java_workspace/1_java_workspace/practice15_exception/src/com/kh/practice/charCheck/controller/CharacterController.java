package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {}
	public int countAlpha(String s) throws CharCheckException{
//		int countLetterNum = s.length();
//		return countLetterNum;
		String[] a = s.split("");
		int count = 0;
		char[] b = new char[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i].charAt(0);
		}
		
		for (int i = 0; i < b.length; i++) {
			if(b[i] == ' ') {
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�.");
			}
			else if ((b[i] >= 'a' && b[i] <= 'z') || (b[i] >= 'A' && b[i] <= 'Z')) {
				count++;
			}
		}
		return count;
	}
}
