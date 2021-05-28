package com.kh.example.chap02_tcp1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void startClient() {
		// Ŭ���̾�Ʈ �� TCP���� ���α׷��� ����
		// 1) ������ IP�ּҿ� ��Ʈ��ȣ�� ������ Ŭ���̾�Ʈ �� ���� ��ü ����
		// 2) ����� ��Ʈ�� ����
		// 3) ���� ��Ʈ��
		// 4) ��Ʈ������ �а� ����
		// 5) ��� ����
		
		// 0) ������ IP�ּҿ� ��Ʈ��ȣ �˾Ƶα�
		int port = 7777;
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) ������ IP�ּҿ� ��Ʈ��ȣ�� ������ Ŭ���̾�Ʈ �� ���� ��ü ����
			Socket socket = new Socket(serverIP, port); // ���ῡ ������ ��� null�� ��ȯ
			
			// �������� ������ ������ ��쿡
			if(socket != null) {
				// 2) ����� ��Ʈ�� ����
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				// 3) ���� ��Ʈ��
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				// 4) ��Ʈ������ �а� ����
				// Ŭ���̾�Ʈ -> ���� �޼��� ����
				pw.println("�ݰ�����");
				pw.flush();
				
				// ���� --> Ŭ���̾�Ʈ �޼��� �б�
				System.out.println(br.readLine());
				
				// 5) ��� ����
				pw.close();
				br.close();
				
				socket.close();
			}
			
		}
		catch (UnknownHostException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
