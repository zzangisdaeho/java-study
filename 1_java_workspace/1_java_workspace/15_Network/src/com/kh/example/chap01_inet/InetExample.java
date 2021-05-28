package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetExample {
	public static void main(String[] args) {
		// InetAddress getLocalHost() : 지역 호스트(서버 제공자)의 Host명과 IP주소 얻기
		try {
			InetAddress localIP = InetAddress.getLocalHost();
			
			// String getHostName() : 호스트의 이름 반환
			System.out.println("내 PC 명 : "+ localIP.getHostName());
			
			// String getHostAddress() : 호스트 IP주소 반환
			System.out.println("내 IP : " + localIP.getHostAddress());
			
			// byte[] getAddress() : IP주소를 byte배열로 반환
			byte[] ipAddress = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddress));
			
			System.out.println();
			
			// InetAddress getByName(String host) : 도메인 명(host)을 통해 IP주소를 얻음
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr");
			
			System.out.println("iei 서버 명 : " + ieiIP.getHostName());
			System.out.println("iei 서버 명 : " + ieiIP.getHostAddress());
			
			System.out.println();
			
			// InternetAddress[] getAllbyName(String host) : 도메인 명을 통해 모든 IP주소를 얻음
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP 개수 : " + googleIPs.length);
			for(InetAddress ip : googleIPs)
				System.out.println(ip.getHostAddress());
			
			System.out.println();
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 개수 : " + naverIPs.length);
			for(InetAddress ip : naverIPs)
				System.out.println(ip.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
