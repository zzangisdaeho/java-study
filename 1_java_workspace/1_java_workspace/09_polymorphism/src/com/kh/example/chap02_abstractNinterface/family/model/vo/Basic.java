package com.kh.example.chap02_abstractNinterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable{
								//Marker Interface
	
	//인터페이스에서 필드는 항상 상수 필드
	/* public static final */ double PI = 3.14;
	
	//인터페이스에서 메소드는 항상 public abstract(생략 가능)
	/* public abstract */ void eat();
	/* public abstract */ void sleep();
	
	
}
