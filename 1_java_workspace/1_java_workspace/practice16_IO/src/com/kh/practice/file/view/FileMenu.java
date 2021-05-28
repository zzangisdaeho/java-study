package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	FileController fc = new FileController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int mainMenuSelect = 0;
		while(mainMenuSelect != 9) {
			mainMenuSelect = 0;
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(mainMenuSelect) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨슴. 다시 입력 ㄱㄱ");
			}
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		boolean finish = false;
		while(!finish) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("exit끝 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String plot = sc.nextLine();
			if (!plot.equals("exit끝")) {
				sb.append(plot);
				sb.append("\n");
			}
			else {
				finish = true;
				boolean saved = false;
				while(!saved) {
					System.out.print("저장할 파일 명을 입력해주세요(자동 txt형식) : ");
					String file = sc.nextLine() + ".txt";
					if(fc.checkName(file)) {
						String saveOp = "";
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n)");
						saveOp = sc.nextLine();
						if(saveOp.equalsIgnoreCase("y")) {
							fc.fileSave(file, sb);
							saved = true;
						}
						else {
							continue;
						}
					}
					else {
						fc.fileSave(file, sb);
						saved = true;
					}
				}
			}
		}
	}
	public void fileOpen(){
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine() + ".txt";
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		}
		else {
			System.out.println("없는 파일이다 색희야 ㅎㅎ");
		}
	}
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine() + ".txt";
		if(fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			boolean finish = false;
			while(!finish) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("exit끝 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String plot = sc.nextLine();
				if (!plot.equals("exit끝")) {
					sb.append(plot);
					sb.append("\n");
				}
				else {
					fc.fileEdit(file, sb);
					finish = true;
				}
			}
		}
		else {
			System.out.println("없는 파일이다 색희야 ㅎㅎ");
		}
	}
}
