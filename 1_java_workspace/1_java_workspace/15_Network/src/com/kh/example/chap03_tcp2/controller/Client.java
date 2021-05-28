package com.kh.example.chap03_tcp2.controller;

import java.io.BufferedReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startclient() {
		// 0. 서버의 ip주소와 port번호 알아내기
		int port = 9015;
		
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			// 1. 클라이언트 용 소켓 객체 생성
			Socket socket = new Socket(serverIP, port);
			
			BufferedReader br = null;
			PrintWriter pw = null;
			if(socket != null) {
				//2. 입출력 스트림 오픈
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				// 3. 보조 스트림
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				// 4. 읽고 쓰기
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.print("대화 입력 : ");
					String message = sc.nextLine();
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")){
						
						break;
					}
					
					String recieveMessage = br.readLine();
					System.out.println(recieveMessage);
					String recieveMessage1 = br.readLine();
					System.out.println(recieveMessage1);
					String recieveMessage2 = br.readLine();
					System.out.println(recieveMessage2);
					
//					System.out.print("보낼 메세지 : ");
//					String sendMessage = sc.nextLine();
//					pw.println(sendMessage);
//					pw.flush();
//					String takeMessage = br.readLine();
//					System.out.println("상대편 메세지  : " + takeMessage);
					
				}
				while(true);
			}
			br.close();
			pw.close();
			socket.close();
		}
		catch (UnknownHostException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
		}
		
		
	}
}
