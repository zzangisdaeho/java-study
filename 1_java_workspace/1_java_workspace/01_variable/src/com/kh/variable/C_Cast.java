package com.kh.variable;

public class C_Cast {
	public void rule(){
		//����ȯ���� boolean�� ���ܵ�
		boolean flag = true;
		//flag = 100;
		//int�� boolean���� �ٲ� �� ����
		
		//����(2byte)�� ���� ������ �׺�ȯ
		int num = 'A'; //���� �ϳ��� �����ڵ尪���� ���ڰ� �����Ǿ��־� ����
		System.out.println("num : "+num);
		
		char ch = 97;
		System.out.println("ch : "+ch);
		
		char ch2 = (char)num;
		System.out.println("ch2 : "+ch2);
		
		int num2 = -1234567890;
		char ch3 = (char)num2;
		System.out.println("ch3 : "+ch3);
	}
	public void rule2() {
		// �ٸ� �ڷ��� ������ ������ ū �ڷ������� �ڵ� ����ȯ �Ŀ� ����ó��
		int iNum = 10;
		long lNum = 100;
		//int sum = iNum + lNum;
		
		//���1. ���� ����� int�� ���� ����ȯ�ϱ�
		int sum1 = (int)(iNum + lNum);
		
		//���2. Long���� int�� ���� ����ȯ�ϱ�
		int sum2 = iNum + (int)lNum;
		
		//���3. ��� ���� long������ �ޱ�
		long sum3 = iNum + lNum;
		System.out.println(sum3);
	}
	public void dataLoss() {
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
	}
}
