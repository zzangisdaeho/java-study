package com.kh.example.chap04_tcpio.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {
	// 클라이언트로부터 받아오는 객체 데이터를 출력하기
	
	public void startServer() {
		// 1. 서버 포트 정하기
		int port = 3000;
		
		try {
			// 2. 서버용 소켓 객체 생성(포트 결합)
			ServerSocket server = new ServerSocket(port);
			
			// 3. 기다리기
			System.out.println("기다리는 중;");
			
			// 4. 요청 수락 후 클라이언트 소켓 생성
			Socket client = server.accept();
			
			// 5. 입출력 스트림 생성
			// 6. 보조 스트림
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			
			// 7. 읽고 쓰기
			Object receive = null;
			while(true) {
				receive = ois.readObject();
				if(receive != null) {
					System.out.println("클라이언트가 보낸 메세지 : " + receive);
				}
				else {
					break;
				}
			}
			// 8. 통신 종료
			ois.close();
			server.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
