package com.kh.variable;

public class A_Variable {
	public void declareVariable() {
		/* ���� ���� �� �ʱ�ȭ
		 * A. ���� ����
		 * 1. ����
		 * 2. ������
		 * 3. ������
		 * B. �ʱ�ȭ(����)
		 */
		boolean isTrue;
		
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		float fNum;
		double dNum;
		
		char ch;
		String str;
		
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0F;
		dNum = 8.0;
		
		ch = 'A';
		str = "�ڽſ�";
		str = "A";
		
		
		System.out.println("isTrue��  �� : " + isTrue);
		System.out.println("bNum�� �� :" + bNum);
		System.out.println("sNum�� �� :" + sNum);
		System.out.println("iNum�� �� :" + iNum);
		System.out.println("lNum�� �� :" + lNum);
		System.out.println("fNum�� �� :" + fNum);
		System.out.println("dNum�� �� :" + dNum);
		System.out.println("ch�� �� :" + ch);
		System.out.println("str�� �� :" + str);
		
	}
	
	public void initVariable() {
		boolean isTrue = false;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8;
		//L�Ⱥٿ��� 4����Ʈ���� �Ⱥٿ��� ������� int�������� ó������
		
		float fNum = 4.0F;
		double dNum = 8.0;
		
		char ch = 'A';
		String str = "�ڽſ�";
		
		System.out.println("isTrue��  �� : " + isTrue);
		System.out.println("bNum�� �� :" + bNum);
		System.out.println("sNum�� �� :" + sNum);
		System.out.println("iNum�� �� :" + iNum);
		System.out.println("lNum�� �� :" + lNum);
		System.out.println("fNum�� �� :" + fNum);
		System.out.println("dNum�� �� :" + dNum);
		System.out.println("ch�� �� :" + ch);
		System.out.println("str�� �� :" + str);
	}
}
