package com.kh.example.test.model.vo;

public class Child2 extends Parent { //같은패키지니까 import안해도 괜찮아
	// 클래스 Child2는 상속받는다 Parent 클래스를
	private String str;
	
	public Child2() {
//		super.num = 10;
		//The field Parent.num is not visible
		//num은 private 접근제한자로 지정되어 있기 때문에 Parent에서만 사용
		
		super.dNum = 10.0;
		// dNum의 접근제한자는 default
		// default의 범위 : 클래스 내부, 같은 패키지
		// Child2와 Parent는 같은 패키지에 있기 때문에 사용 가능
		
		super.bool = false;
		// bool의 접근제한자는 protected
		// protected의 범위 : 클래스 내부, 같은 패키지, 후손 클래스
		// Child2와 Parent는 같은 패키지에 있으면서 Child2가 Parent의 후손이기 때문에 사용 가능(둘 중 하나만 되도 됨)
		
		super.ch = ' ';
		// ch의 접근제한자 public
		// public은 누구나 접근 가능
		
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
}
