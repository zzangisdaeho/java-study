package com.kh.example.chap03_package_import.controller;

import java.util.Date;
import java.sql.Date;

//import java.util.Scanner;

public class PackageImport {
	public void importTest() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
//		-----------------Scanner의 풀네임
		
		Math.random();
		Integer.parseInt("123");
		System.out.println();
		Object obj = new Object();
//		java.lang 패키지 내 클래스들로 import가 필요없숴
		
		Date date1 = new Date(); // util
		java.sql.Date date2 = new java.sql.Date(100L); // sql
		
		
		
	}
}
