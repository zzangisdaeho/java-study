package com.kh.example.chap02_tcp1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// ServerSocket
	//		��Ʈ�� ����Ǿ� �ܺ�(Ŭ���̾�Ʈ)�� ��û�� ��ٸ��� ��û�� ������ Socket�����Ͽ�
	//		����� �̷�������� ��
	// Socket (Client Socket)
	//		������ Ŭ���̾�Ʈ ���� ��� ���
	//		InputStream, OutputStream�� �����ϰ� �־� �� ��Ʈ���� ����
	//		����� �̷����
	
	public void serverStart() {
		// ������ TCP ���� ���α׷��� ����
		// 1) ������ ��Ʈ ��ȣ ����
		// 2) ������ ���� ��ü ���� (��Ʈ�� ����)
		// 3) Ŭ���̾�Ʈ ��û ���
		// 4) Ŭ���̾�Ʈ ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
		// 5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		// 6) ������Ʈ�� 
		// 7) ��Ʈ���� ���ؼ� �а� ����
		// 8) ��� ����
		
		
		// 1) ������ ��Ʈ ��ȣ ����
		int port = 7777;
		// ��Ʈ ��ȣ 0 ~ 65535
		// 1023���ϴ� �ٸ� ������ ����ϰ� �ִ� ��Ʈ�� ���� ������ �̿� ��Ʈ ����
		
		try {
			// 2) ������ ���� ��ü ���� (��Ʈ�� ����) == ServerSocket
			ServerSocket server = new ServerSocket(port);
			
			// 3) Ŭ���̾�Ʈ ��û ���
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�.....");
			
			// 4) Ŭ���̾�Ʈ ��û�� ���� ��û ����(accept()) �� �ش� Ŭ���̾�Ʈ�� ���� ����(Socket) ��ü ����
			Socket client = server.accept();
			
			// 5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			// 6) ������Ʈ�� 
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);
			
			
			// 7) ��Ʈ���� ���ؼ� �а� ����
			// Ŭ���̾�Ʈ -> ������ ������ �޼����� �о��
			String message = br.readLine();
			System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + message);
			
			// ���� -> Ŭ���̾�Ʈ�� �޼��� ����
			pw.println("������ �ݰ����ϴ�.");
			pw.flush(); // �ڿ� ����ֱ�
			
			// 8) ��� ����
			// �����ִ� ��Ʈ���� ���� �ݳ��ϰ� �������� ����(���յ� ��Ʈ)�� ����
			pw.close();
			br.close();
			output.close();
			input.close();
			
			server.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
