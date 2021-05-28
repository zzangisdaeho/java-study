package com.kh.example.chap03_tcp2.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public void startSever() {
		Scanner sc= new Scanner(System.in);
		
		// 1. ��Ʈ ��ȣ ����
		int port = 9015;
		
		try {
			// 2. ������ ������ ��Ʈ�� �����Ͽ� ����
			ServerSocket server = new ServerSocket(port);
			
			// 3. Ŭ���̾�Ʈ�� ��û ��ٸ���
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�.....");
			
//			while(true) {
				// 4. Ŭ���̾�Ʈ�� ��û ���� �� Ŭ���̾�Ʈ ���� ��ü ����
				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ ����� ���� ���� ����");
				
				// 5. ����� ��Ʈ�� ����
				InputStream input = client.getInputStream();
				OutputStream output = client.getOutputStream();
				
				//6. ������Ʈ��
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				while(true) {
					// 7. �а� ����
					String message = br.readLine(); // �ݴ����� ������ �޼��� �б�
					
					if(!message.equals("exit")) {
						System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + message);
						pw.println("�޼��� �ޱ� ����");
						pw.flush();
					}
					else {
						System.out.println("���� ����");
						break;
					}
					System.out.print("���� �޼��� : ");
					String sendMessage = sc.nextLine();
					if(!sendMessage.equals("exit")) {
						pw.println(sendMessage);
						System.out.println(sendMessage + " ���� �Ϸ�");
						pw.flush();
					}
					else {
						System.out.println("���� �����մϴ�");
						break;
					}
//					String takeMessage = br.readLine();
//					System.out.println("����� �޼���  : " + takeMessage);
//					System.out.print("���� �޼��� : ");
//					String sendMessage = sc.nextLine();
//					pw.println(sendMessage);
//					pw.flush();
					
				}
				
				// 8. ��� ����
				br.close();
				pw.close();
				server.close();
//			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
