package com.kh.example.animal.model.vo;

public class Mouse extends Dog{
	private String type;
	
	public Mouse(String name, int age, double weight, double height, String hair, String type) {
		super(name, age, weight,height,hair);
		this.type = type;
		
	}
	public void setName(String name) {
		setName(name); // �ڽ��� �����޾����Ƿ� ��� ���������� ���� ���� ����. super. �������.
	}
	
	public int method3() {
		return super.finalMethod(); //��븦 ������ �ڽſ��Ա��� �� �޼ҵ��̱⿡ �ٷ� ��� ����.
	}
}
