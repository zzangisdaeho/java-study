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
		// 클라이언트 용 TCP소켓 프로그래밍 순서
		// 1) 서버의 IP주소와 포트번호를 가지고 클라이언트 용 소켓 객체 생성
		// 2) 입출력 스트림 오픈
		// 3) 보조 스트림
		// 4) 스트림으로 읽고 쓰기
		// 5) 통신 종료
		
		// 0) 서버의 IP주소와 포트번호 알아두기
		int port = 7777;
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) 서버의 IP주소와 포트번호를 가지고 클라이언트 용 소켓 객체 생성
			Socket socket = new Socket(serverIP, port); // 연결에 실패할 경우 null값 반환
			
			// 서버와의 연결이 성공한 경우에
			if(socket != null) {
				// 2) 입출력 스트림 오픈
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				// 3) 보조 스트림
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				// 4) 스트림으로 읽고 쓰기
				// 클라이언트 -> 서버 메세지 전송
				pw.println("반가워요");
				pw.flush();
				
				// 서버 --> 클라이언트 메세지 읽기
				System.out.println(br.readLine());
				
				// 5) 통신 종료
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
