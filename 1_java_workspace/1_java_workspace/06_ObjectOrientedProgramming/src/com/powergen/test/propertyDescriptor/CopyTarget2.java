package com.powergen.test.propertyDescriptor;

import java.util.Date;

public class CopyTarget2 {

	private String name;
	private int age;
	private Date birth;
	private String address;
	private String lover;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLover() {
		return lover;
	}

	public void setLover(String lover) {
		this.lover = lover;
	}

	@Override
	public String toString() {
		return "CopyTarget2 [name=" + name + ", age=" + age + ", birth=" + birth + ", address=" + address + ", lover="
				+ lover + "]";
	}
	
}
