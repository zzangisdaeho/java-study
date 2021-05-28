package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	public void inputScanner1(){
		//사용자의 정보를 입력받고, 입력받은 정보를 출력하는 기능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 넣어 : ");
		
		String name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		System.out.print("키 입력 : ");
		
		double height = sc.nextDouble();
		
		System.out.printf("%s 님은 %d 세이며, 키는 %fcm입니다.",name,age,height);
		
	}
	
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		System.out.print("주소 : ");
//		String address = sc.nextLine();
		
//		int age = sc.nextInt();
//		sc.nextLine(); // buffer에 남아있는 줄바꿈 제거
//		
//		System.out.print("주소 : ");
//		String address = sc.nextLine();
//		
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println(name + "님은 " + age + "세이며, 사는 곳은 " + address + "입니다.");
		
	}
	
	
	
}
