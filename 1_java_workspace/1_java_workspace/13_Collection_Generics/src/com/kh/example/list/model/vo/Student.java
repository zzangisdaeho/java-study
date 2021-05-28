package com.kh.example.list.model.vo;

public class Student implements Comparable {
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "name : " + name + ", score : " + score;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31; //31�� ��ǻ�Ͱ� ����ϱ� ���� �Ҽ�
		int result = 1;
		result = prime * result + ((name==null)? 0 : name.hashCode());
		result = prime * result + score;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; // ��ü�� �����Ƿ� ture
		}
		if (obj == null) {
			return false; // ���Ұ� null�̶�� false
		}
		if (getClass() != obj.getClass()) {
			return false; // Ŭ������ ���� ������ �ٸ��� �ٸ���ü
		}
		// ������� �⺻ ����
		
		Student other = (Student)obj; 
		// �ʵ峢�� ��
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}
		else if(!name.equals(other.name)) {
			return false;
		}
		
		if(score != other.score) {
			return false;
		}
		
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// �̸��� ���ؼ� �������� ����
		String otherName = ((Student)o).getName();
		
		return name.compareTo(otherName); // ��������
//		return -name.compareTo(otherName); // ��������
		//String Ŭ������ �����ϴ� �޼ҵ� compareTo�� �̹� �������̵� �Ǿ��ִ�. ������ ����ȴ�.
		
		/*
		 * compareTo() �� ��ȯ�� (int)
		 * 	�� ��ü�� �� ���� ������ 0
		 * 	�� ��ü�� �� ��󺸴� ũ�� 1
		 * 	�� ��ü�� �� ��󺸴� ������ -1
		 * 	��������, ���������� �ٲٰ� �ʹٸ� return���� '-' �ٿ��ָ� �ȴ�.
		 */
		
	}
}
