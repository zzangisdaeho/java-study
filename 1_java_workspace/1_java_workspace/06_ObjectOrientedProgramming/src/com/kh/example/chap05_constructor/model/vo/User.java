package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	private String userId; // ���̵�
	private String userPwd;// ��й�ȣ
	private String userName;// �̸�
	private Date enrollDate;// ȸ������ ��¥
	
	//�������� ��� ����
	//	1. ��ü ����
	//	2. �Ű������� ���޹��� ������ �ʵ� �ʱ�ȭ
	
	//������ ��� �� ���ǻ���
	//	1. �ݵ�� ������ ���� Ŭ������� �����ؾ� �Ѵ�.
	//	2. �������� �������� �ʴ´�.
	
	public User() {} // �⺻ ������ : ��ü ������
	// �ƹ� �Ű������� ���� ��������
	// JVM�� �⺻������ ��������
	// �Ű������� �ִ� �����ڸ� ����� �ڵ� ������ ���� �ʱ� ������ �ݵ�� ����ؾ� �Ѵ�.
	
	public User(String userId) {
		this.userId = userId;
	}
	
	public User(String userId,String userPwd,String userName) {
//		this.userId = userId;
		this(userId);
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public User(String userId,String userPwd,String userName,Date enrollDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);
		this.enrollDate=enrollDate;
	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
	
	
}
