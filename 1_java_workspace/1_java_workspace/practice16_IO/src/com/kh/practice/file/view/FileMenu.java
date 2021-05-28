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
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			
			mainMenuSelect = Integer.parseInt(sc.nextLine());
			
			switch(mainMenuSelect) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽�. �ٽ� �Է� ����");
			}
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		boolean finish = false;
		while(!finish) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("exit�� �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String plot = sc.nextLine();
			if (!plot.equals("exit��")) {
				sb.append(plot);
				sb.append("\n");
			}
			else {
				finish = true;
				boolean saved = false;
				while(!saved) {
					System.out.print("������ ���� ���� �Է����ּ���(�ڵ� txt����) : ");
					String file = sc.nextLine() + ".txt";
					if(fc.checkName(file)) {
						String saveOp = "";
						System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�? (y/n)");
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
		System.out.print("�� ���� �� : ");
		String file = sc.nextLine() + ".txt";
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		}
		else {
			System.out.println("���� �����̴� ����� ����");
		}
	}
	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String file = sc.nextLine() + ".txt";
		if(fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			boolean finish = false;
			while(!finish) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("exit�� �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String plot = sc.nextLine();
				if (!plot.equals("exit��")) {
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
			System.out.println("���� �����̴� ����� ����");
		}
	}
}
