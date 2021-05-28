package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH"; //final 변수명은 다 대문자다
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee(){
		System.out.println(this);
	}
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
//		this.score = score;
		// 노란 줄이 뜨는 이유
		// this는 현재 객체의 주소가 담겨있는 레퍼런스 변수라고;;; 어?
		// 봐봐, 주소 값이 담겨져 있다는 건 뭐겠어..? 응?
		// 얹 주소가 할당 되냐고! Heap영역에 공간이 할당됐을 때 주소 값이 생기자너;
		// 즉, 객체가 생성됐다는 얘기지?
		// this. 하는 순간 생성된 객체를 통해서 변수에 접근하는거란 말야
		// (이 때 변수는 필드 얘기하는거란다)
		// score --> static변수 == 클래스 변수
		// static예약어가 붙은 변수, 메소드들은 프로그램 시작할 떄 static영역에 올라가서 공유됨
		// 따라서, 객체를 생성해서 접근할 필요가 없음
		// this.score --> 객체 안에 들어가서 score 변수를 갖고 오겠다 라는 이야기
		// 굳이, static변수를 객체 생성해서 가져올 필요가 없다고 노란줄이 뜬 것.
		Trainee.score = score;
	}
	//이름에 대한 setter
	public void setName(String name) {
		this.name = name;
	}
	
	// 이름에 대한 getter
	public String getName() {
		return name;
	}
	
	// 학원에 대한 setter 학원은 상수이므로 setter 필요 없싐
	
	// 학원에 대한 getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// 반에 대한 setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	// 반에 대한 getter
	public char getClassRoom() {
		return classRoom;
	}
	// 시간에 대한 setter
	public void setTime(String time) {
		this.time = time;
	}
	
	// 시간에 대한 getter
	public String getTime() {
		return time;
	}
	
	// 점수에 대한 setter
	public static void setScore(double score) {
		Trainee.score = score;
	}
	
	// 점수에 대한 getter
	public static double getScore() {
		return score;
	}
	
	public String inform() {
		return (ACADEMY + " " + name + " 훈련생은 " + classRoom + "반 " + time + "이고, "
				+ score + "점입니다.");
	}
}
