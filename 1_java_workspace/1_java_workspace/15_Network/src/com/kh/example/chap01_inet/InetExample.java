package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetExample {
	public static void main(String[] args) {
		// InetAddress getLocalHost() : ���� ȣ��Ʈ(���� ������)�� Host��� IP�ּ� ���
		try {
			InetAddress localIP = InetAddress.getLocalHost();
			
			// String getHostName() : ȣ��Ʈ�� �̸� ��ȯ
			System.out.println("�� PC �� : "+ localIP.getHostName());
			
			// String getHostAddress() : ȣ��Ʈ IP�ּ� ��ȯ
			System.out.println("�� IP : " + localIP.getHostAddress());
			
			// byte[] getAddress() : IP�ּҸ� byte�迭�� ��ȯ
			byte[] ipAddress = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddress));
			
			System.out.println();
			
			// InetAddress getByName(String host) : ������ ��(host)�� ���� IP�ּҸ� ����
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr");
			
			System.out.println("iei ���� �� : " + ieiIP.getHostName());
			System.out.println("iei ���� �� : " + ieiIP.getHostAddress());
			
			System.out.println();
			
			// InternetAddress[] getAllbyName(String host) : ������ ���� ���� ��� IP�ּҸ� ����
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("���� IP ���� : " + googleIPs.length);
			for(InetAddress ip : googleIPs)
				System.out.println(ip.getHostAddress());
			
			System.out.println();
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� IP ���� : " + naverIPs.length);
			for(InetAddress ip : naverIPs)
				System.out.println(ip.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
