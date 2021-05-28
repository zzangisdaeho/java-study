package com.kh.example.animal.model.vo;

public class Mouse extends Dog{
	private String type;
	
	public Mouse(String name, int age, double weight, double height, String hair, String type) {
		super(name, age, weight,height,hair);
		this.type = type;
		
	}
	public void setName(String name) {
		setName(name); // 자신이 물려받았으므로 사용 가능하지만 좋지 않은 습관. super. 사용하자.
	}
	
	public int method3() {
		return super.finalMethod(); //몇대를 물려도 자신에게까지 온 메소드이기에 바로 사용 가능.
	}
}
