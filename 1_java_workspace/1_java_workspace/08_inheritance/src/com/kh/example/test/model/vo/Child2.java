package com.kh.example.test.model.vo;

public class Child2 extends Parent { //������Ű���ϱ� import���ص� ������
	// Ŭ���� Child2�� ��ӹ޴´� Parent Ŭ������
	private String str;
	
	public Child2() {
//		super.num = 10;
		//The field Parent.num is not visible
		//num�� private ���������ڷ� �����Ǿ� �ֱ� ������ Parent������ ���
		
		super.dNum = 10.0;
		// dNum�� ���������ڴ� default
		// default�� ���� : Ŭ���� ����, ���� ��Ű��
		// Child2�� Parent�� ���� ��Ű���� �ֱ� ������ ��� ����
		
		super.bool = false;
		// bool�� ���������ڴ� protected
		// protected�� ���� : Ŭ���� ����, ���� ��Ű��, �ļ� Ŭ����
		// Child2�� Parent�� ���� ��Ű���� �����鼭 Child2�� Parent�� �ļ��̱� ������ ��� ����(�� �� �ϳ��� �ǵ� ��)
		
		super.ch = ' ';
		// ch�� ���������� public
		// public�� ������ ���� ����
		
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
}
