package com.kh.test.extend;

public class Run {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
		p1.testprint();
		p2.testprint(); // ���������� �޾Ƶ� �ڽ��� �޼ҵ尡 ����ȴ�. ���� ���ε��� ���� ����

	}

}
