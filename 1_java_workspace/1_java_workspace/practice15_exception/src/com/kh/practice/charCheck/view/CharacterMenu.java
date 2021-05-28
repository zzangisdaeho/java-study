package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	
	
	public void menu() {
		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		
		try {
			int countLetterNum = new CharacterController().countAlpha(s);
			System.out.printf("'%s'�� ���Ե� ������ ���� : %d", s, countLetterNum);
		}
		catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
