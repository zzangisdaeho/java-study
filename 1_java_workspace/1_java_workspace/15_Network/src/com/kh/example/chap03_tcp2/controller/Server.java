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
		
		// 1. 포트 번호 지정
		int port = 9015;
		
		try {
			// 2. 서버용 소켓을 포트와 결합하여 생성
			ServerSocket server = new ServerSocket(port);
			
			// 3. 클라이언트의 요청 기다리기
			System.out.println("클라이언트의 요청을 기다리고 있습니다.....");
			
//			while(true) {
				// 4. 클라이언트의 요청 수락 후 클라이언트 소켓 객체 생성
				Socket client = server.accept();
				System.out.println("클라이언트 연결로 소켓 생성 성공");
				
				// 5. 입출력 스트림 생성
				InputStream input = client.getInputStream();
				OutputStream output = client.getOutputStream();
				
				//6. 보조스트림
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				while(true) {
					// 7. 읽고 쓰기
					String message = br.readLine(); // 반대편에서 전송한 메세지 읽기
					
					if(!message.equals("exit")) {
						System.out.println("클라이언트가 보낸 메세지 : " + message);
						pw.println("메세지 받기 성공");
						pw.flush();
					}
					else {
						System.out.println("접속 종료");
						break;
					}
					System.out.print("보낼 메세지 : ");
					String sendMessage = sc.nextLine();
					if(!sendMessage.equals("exit")) {
						pw.println(sendMessage);
						System.out.println(sendMessage + " 전송 완료");
						pw.flush();
					}
					else {
						System.out.println("접속 종료합니다");
						break;
					}
//					String takeMessage = br.readLine();
//					System.out.println("상대편 메세지  : " + takeMessage);
//					System.out.print("보낼 메세지 : ");
//					String sendMessage = sc.nextLine();
//					pw.println(sendMessage);
//					pw.flush();
					
				}
				
				// 8. 통신 종료
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
