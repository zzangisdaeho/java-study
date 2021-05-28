package com.kh.practice.chap02_abstractNinterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	public GalaxyNote9() {
		super.setMaker("�Ｚ");
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
		return "1200�� ��� ī�޶�";
	}
		
	@Override
	public String charge() {
		return "��� ����, ��� ���� ����";
	}

	@Override
	public String touch() {
		return "������, ������ ����";
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

	@Override
	public String printInformation() {
		return "������ ��Ʈ9�� "+super.getMaker()+"���� ��������� ������ ������ ����\n"+
				makeCall()+"\n"+
				takeCall()+"\n"+
				picture()+"\n"+
				charge()+"\n"+
				touch()+"\n"+
				"������� �� ž�� ���� : "+bluetoothPen() +"\n";
	}
	
}
