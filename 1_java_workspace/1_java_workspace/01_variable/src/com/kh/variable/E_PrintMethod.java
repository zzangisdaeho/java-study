package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "안녕하세요";
	String str2 = "반갑습니다";
	
	
	public void printlnExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
	}
	public void printExample() {
		String str1 = "안녕하세요1";
		String str2 = "반갑습니다1";
		
		System.out.print(str1);
		System.out.print(str2);
		
	}
	public void printfExample() {
		System.out.println();
		System.out.printf("%s, 박신우입니다. %s",str1,str2);
		System.out.println();
		System.out.printf("%s, 친하게지내요.",str2);
	}
}
