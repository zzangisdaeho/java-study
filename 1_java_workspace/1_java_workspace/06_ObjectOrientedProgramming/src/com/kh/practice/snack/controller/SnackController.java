package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name,
			String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "���� �Ϸ�Ǿ����ϴ�.";
//		public User saveData(String kind, String name,
//				String flavor, int numOf, int price) {
//			s = new Snack(kind, name, flavor, numOf, price);
//			
//			return s;
	}
	
	public String confirmData() {
//		String name = s.getName();
//		String flavor = s.getFlavor();
//		String kind = s.getKind();
//		int numOf = s.getNumOf();
//		int price = s.getPrice();
//		
//		return kind + " ("+ name +" - " + flavor + ") " + numOf +"�� "+price+"��";
		
		return s.information();
		
	}
	
	
	
	
}
