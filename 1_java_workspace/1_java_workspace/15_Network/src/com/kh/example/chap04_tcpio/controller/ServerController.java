package com.kh.example.chap04_tcpio.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {
	// Ŭ���̾�Ʈ�κ��� �޾ƿ��� ��ü �����͸� ����ϱ�
	
	public void startServer() {
		// 1. ���� ��Ʈ ���ϱ�
		int port = 3000;
		
		try {
			// 2. ������ ���� ��ü ����(��Ʈ ����)
			ServerSocket server = new ServerSocket(port);
			
			// 3. ��ٸ���
			System.out.println("��ٸ��� ��;");
			
			// 4. ��û ���� �� Ŭ���̾�Ʈ ���� ����
			Socket client = server.accept();
			
			// 5. ����� ��Ʈ�� ����
			// 6. ���� ��Ʈ��
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			
			// 7. �а� ����
			Object receive = null;
			while(true) {
				receive = ois.readObject();
				if(receive != null) {
					System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + receive);
				}
				else {
					break;
				}
			}
			// 8. ��� ����
			ois.close();
			server.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
