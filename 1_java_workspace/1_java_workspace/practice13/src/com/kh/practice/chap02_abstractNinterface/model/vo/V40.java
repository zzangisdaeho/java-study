package com.kh.practice.chap02_abstractNinterface.model.vo;

public class V40 extends SmartPhone implements NotePen {

	public V40() {
		super.setMaker("LG");
	}

	@Override
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	
	@Override
	public String takeCall() {
		return "���� ��ư�� ����";
	}

	@Override
	public String picture() {
		return "1200, 1600�� Ʈ���� ī�޶�";
	}
		
	@Override
	public String charge() {
		return "��� ����, ��� ���� ����";
	}

	@Override
	public String touch() {
		return "������";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	@Override
	public String printInformation() {
		return "V40�� "+super.getMaker()+"���� ��������� ������ ������ ����\n"+
				makeCall()+"\n"+
				takeCall()+"\n"+
				picture()+"\n"+
				charge()+"\n"+
				touch()+"\n"+
				"������� �� ž�� ���� : "+bluetoothPen() +"\n";
	}
}
