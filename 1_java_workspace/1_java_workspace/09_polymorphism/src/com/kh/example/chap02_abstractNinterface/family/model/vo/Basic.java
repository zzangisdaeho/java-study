package com.kh.example.chap02_abstractNinterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable{
								//Marker Interface
	
	//�������̽����� �ʵ�� �׻� ��� �ʵ�
	/* public static final */ double PI = 3.14;
	
	//�������̽����� �޼ҵ�� �׻� public abstract(���� ����)
	/* public abstract */ void eat();
	/* public abstract */ void sleep();
	
	
}
