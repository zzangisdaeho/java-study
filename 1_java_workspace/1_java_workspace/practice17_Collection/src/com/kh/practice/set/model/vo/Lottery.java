package com.kh.practice.set.model.vo;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((name==null)? 0 : name.hashCode());
		result = result + prime * result + ((phone == null)? 0 : phone.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Lottery other = (Lottery)obj;
		
		if (name == null && other.name != null) return false;
		if (!name.equals(other.name)) return false;
		if (phone == null && other.phone != null) return false;
		if (!phone.equals(other.phone)) return false;
		
		return true;
	}
}
