package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	private String userId; // 아이디
	private String userPwd;// 비밀번호
	private String userName;// 이름
	private Date enrollDate;// 회원가입 날짜
	
	//생성자의 사용 목적
	//	1. 객체 생성
	//	2. 매개변수로 전달받은 값으로 필드 초기화
	
	//생성자 사용 시 주의사항
	//	1. 반드시 생성자 명은 클래스명과 동일해야 한다.
	//	2. 리턴형이 존재하지 않는다.
	
	public User() {} // 기본 생성자 : 객체 생성만
	// 아무 매개변수가 없느 ㄴ생성자
	// JVM이 기본적으로 생성해줌
	// 매개변수가 있는 생성자를 만들면 자동 생성이 되지 않기 때문에 반드시 명시해야 한다.
	
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
