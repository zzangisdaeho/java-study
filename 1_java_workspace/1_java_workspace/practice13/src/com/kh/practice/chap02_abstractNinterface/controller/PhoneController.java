package com.kh.practice.chap02_abstractNinterface.controller;

import com.kh.practice.chap02_abstractNinterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNinterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNinterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = {new GalaxyNote9(), new V40()};
		for(int i = 0; i < result.length; i++) {
			if(p[i] instanceof GalaxyNote9) {
				result[0] = ((GalaxyNote9)p[i]).printInformation();
			}
			else if (p[i] instanceof V40) {
				result[1] = ((V40)p[i]).printInformation();
			}
		}
		return result;
	}
}
