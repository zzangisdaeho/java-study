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
	// ���Ͽ� �ִ� ��ü ������ �о�� �������� ������
	
	public ClientController() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("���ǰ�", 20));
		list.add(new Person("������", 30));
		list.add(new Person("�����", 14));
		
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
			// 0. ������ ���� IP�� ��Ʈ��ȣ �˾Ƴ���
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1. ���� ��ü ����
			Socket socket = new Socket(serverIP, 3000);
			
			if(socket != null) {
				// 2. ����� ��Ʈ�� ����
				// 3. ������Ʈ��
				ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());
				
				// 4. �а� ����
				ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("person.txt"));
				
				try {
					while(true) {
						Person p = (Person)objIn.readObject();
						objOut.writeObject(p); // socket.getOutputStream() �� write �ϰڴ�.
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
