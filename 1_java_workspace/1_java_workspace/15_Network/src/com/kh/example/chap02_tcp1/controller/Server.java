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
	//		포트와 연결되어 외부(클라이언트)의 요청을 기다리다 요청이 들어오면 Socket생성하여
	//		통신이 이루어지도록 함
	// Socket (Client Socket)
	//		서버와 클라이언트 간의 통신 담당
	//		InputStream, OutputStream을 보유하고 있어 이 스트림을 통해
	//		통신이 이루어짐
	
	public void serverStart() {
		// 서버용 TCP 소켓 프로그래밍 순서
		// 1) 서버의 포트 번호 정함
		// 2) 서버용 소켓 객체 생성 (포트와 결합)
		// 3) 클라이언트 요청 대기
		// 4) 클라이언트 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		// 5) 연결된 클라이언트와 입출력 스트림 생성
		// 6) 보조스트림 
		// 7) 스트림을 통해서 읽고 쓰기
		// 8) 통신 종료
		
		
		// 1) 서버의 포트 번호 정함
		int port = 7777;
		// 포트 번호 0 ~ 65535
		// 1023이하는 다른 곳에서 사용하고 있는 포트가 많기 때문에 이외 포트 지정
		
		try {
			// 2) 서버용 소켓 객체 생성 (포트와 결합) == ServerSocket
			ServerSocket server = new ServerSocket(port);
			
			// 3) 클라이언트 요청 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다.....");
			
			// 4) 클라이언트 요청이 오면 요청 수락(accept()) 후 해당 클라이언트에 대한 소켓(Socket) 객체 생성
			Socket client = server.accept();
			
			// 5) 연결된 클라이언트와 입출력 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			// 6) 보조스트림 
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);
			
			
			// 7) 스트림을 통해서 읽고 쓰기
			// 클라이언트 -> 서버로 전송한 메세지를 읽어옴
			String message = br.readLine();
			System.out.println("클라이언트가 보낸 메세지 : " + message);
			
			// 서버 -> 클라이언트로 메세지 전송
			pw.println("만나서 반갑습니다.");
			pw.flush(); // 자원 비워주기
			
			// 8) 통신 종료
			// 열려있는 스트림을 먼저 반납하고 마지막에 서버(결합된 포트)를 닫음
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
