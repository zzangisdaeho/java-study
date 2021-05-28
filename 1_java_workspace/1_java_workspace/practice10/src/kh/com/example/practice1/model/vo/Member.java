package kh.com.example.practice1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void changeName(String name) {
		this.memberName = name;
	}
	public void printName() {
		System.out.printf("아이디 : %s, 비번 : %s, 이름 : %s", memberId, memberPwd, memberName);
	}
	
}
