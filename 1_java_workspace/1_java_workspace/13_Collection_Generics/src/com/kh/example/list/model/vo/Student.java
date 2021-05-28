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
		final int prime = 31; //31은 컴퓨터가 계산하기 좋은 소수
		int result = 1;
		result = prime * result + ((name==null)? 0 : name.hashCode());
		result = prime * result + score;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; // 객체가 같으므로 ture
		}
		if (obj == null) {
			return false; // 비교할게 null이라면 false
		}
		if (getClass() != obj.getClass()) {
			return false; // 클래스에 대한 정보가 다르면 다른객체
		}
		// 여기까지 기본 셋팅
		
		Student other = (Student)obj; 
		// 필드끼리 비교
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
		// 이름에 대해서 오른차순 정렬
		String otherName = ((Student)o).getName();
		
		return name.compareTo(otherName); // 오름차순
//		return -name.compareTo(otherName); // 내림차순
		//String 클래스는 정렬하는 메소드 compareTo가 이미 오버라이딩 되어있다. 가져다 쓰면된다.
		
		/*
		 * compareTo() 의 반환값 (int)
		 * 	비교 주체가 비교 대상과 같으면 0
		 * 	비교 주체가 비교 대상보다 크면 1
		 * 	비교 주체가 비교 대상보다 작으면 -1
		 * 	오름차순, 내림차순을 바꾸고 싶다면 return값에 '-' 붙여주면 된다.
		 */
		
	}
}
