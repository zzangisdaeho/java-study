package com.kh.example.chap03_package_import.controller;

import java.util.Date;
import java.sql.Date;

//import java.util.Scanner;

public class PackageImport {
	public void importTest() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
//		-----------------Scanner�� Ǯ����
		
		Math.random();
		Integer.parseInt("123");
		System.out.println();
		Object obj = new Object();
//		java.lang ��Ű�� �� Ŭ������� import�� �ʿ����
		
		Date date1 = new Date(); // util
		java.sql.Date date2 = new java.sql.Date(100L); // sql
		
		
		
	}
}
