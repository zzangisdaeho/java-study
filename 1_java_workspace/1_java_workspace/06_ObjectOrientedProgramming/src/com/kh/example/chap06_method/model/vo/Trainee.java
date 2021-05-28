package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH"; //final �������� �� �빮�ڴ�
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
		// ��� ���� �ߴ� ����
		// this�� ���� ��ü�� �ּҰ� ����ִ� ���۷��� �������;;; ��?
		// ����, �ּ� ���� ����� �ִٴ� �� ���ھ�..? ��?
		// �� �ּҰ� �Ҵ� �ǳİ�! Heap������ ������ �Ҵ���� �� �ּ� ���� �����ڳ�;
		// ��, ��ü�� �����ƴٴ� �����?
		// this. �ϴ� ���� ������ ��ü�� ���ؼ� ������ �����ϴ°Ŷ� ����
		// (�� �� ������ �ʵ� ����ϴ°Ŷ���)
		// score --> static���� == Ŭ���� ����
		// static���� ���� ����, �޼ҵ���� ���α׷� ������ �� static������ �ö󰡼� ������
		// ����, ��ü�� �����ؼ� ������ �ʿ䰡 ����
		// this.score --> ��ü �ȿ� ���� score ������ ���� ���ڴ� ��� �̾߱�
		// ����, static������ ��ü �����ؼ� ������ �ʿ䰡 ���ٰ� ������� �� ��.
		Trainee.score = score;
	}
	//�̸��� ���� setter
	public void setName(String name) {
		this.name = name;
	}
	
	// �̸��� ���� getter
	public String getName() {
		return name;
	}
	
	// �п��� ���� setter �п��� ����̹Ƿ� setter �ʿ� ����
	
	// �п��� ���� getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// �ݿ� ���� setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	// �ݿ� ���� getter
	public char getClassRoom() {
		return classRoom;
	}
	// �ð��� ���� setter
	public void setTime(String time) {
		this.time = time;
	}
	
	// �ð��� ���� getter
	public String getTime() {
		return time;
	}
	
	// ������ ���� setter
	public static void setScore(double score) {
		Trainee.score = score;
	}
	
	// ������ ���� getter
	public static double getScore() {
		return score;
	}
	
	public String inform() {
		return (ACADEMY + " " + name + " �Ʒû��� " + classRoom + "�� " + time + "�̰�, "
				+ score + "���Դϴ�.");
	}
}
