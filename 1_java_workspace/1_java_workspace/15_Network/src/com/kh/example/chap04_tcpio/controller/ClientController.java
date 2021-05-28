package com.kh.example.chap04_tcpio.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.kh.example.chap04_tcpio.model.vo.Person;

public class ClientController {
	// 파일에 있는 객체 정보를 읽어와 서버한테 보내줌
	
	public ClientController() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("강건강", 20));
		list.add(new Person("남나눔", 30));
		list.add(new Person("도대담", 14));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));) {
			
			for(Person p : list) {
				oos.writeObject(p);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void startClient() {
		
		try {
			// 0. 서버에 대한 IP와 포트번호 알아내기
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1. 소켓 객체 생성
			Socket socket = new Socket(serverIP, 3000);
			
			if(socket != null) {
				// 2. 입출력 스트림 생성
				// 3. 보조스트림
				ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());
				
				// 4. 읽고 쓰기
				ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("person.txt"));
				
				try {
					while(true) {
						Person p = (Person)objIn.readObject();
						objOut.writeObject(p); // socket.getOutputStream() 로 write 하겠다.
					}
					
				}
				catch (EOFException e) {
					objOut.writeObject(null);
					objOut.flush();
					
					objIn.close();
					objOut.close();
					socket.close();
				}
				
				
				
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
