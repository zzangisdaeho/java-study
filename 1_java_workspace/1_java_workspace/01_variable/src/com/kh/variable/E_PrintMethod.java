package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "�ȳ��ϼ���";
	String str2 = "�ݰ����ϴ�";
	
	
	public void printlnExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
	}
	public void printExample() {
		String str1 = "�ȳ��ϼ���1";
		String str2 = "�ݰ����ϴ�1";
		
		System.out.print(str1);
		System.out.print(str2);
		
	}
	public void printfExample() {
		System.out.println();
		System.out.printf("%s, �ڽſ��Դϴ�. %s",str1,str2);
		System.out.println();
		System.out.printf("%s, ģ�ϰ�������.",str2);
	}
}
