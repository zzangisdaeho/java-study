package com.kh.practice.chap02_abstractNinterface.model.vo;

public interface Phone {
	public static char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'}; //12°³
	
	public abstract String makeCall();
	
	public abstract String takeCall();
	
}
