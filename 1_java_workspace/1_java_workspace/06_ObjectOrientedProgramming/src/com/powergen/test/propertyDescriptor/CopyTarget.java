package com.powergen.test.propertyDescriptor;

import java.util.Date;

public class CopyTarget {

	private String name;
	private int age;
	private Date birth;
	private String address;
	private TestInTest another;

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

	public TestInTest getAnother() {
		return another;
	}

	public void setAnother(TestInTest another) {
		this.another = another;
	}

	@Override
	public String toString() {
		return "TestClass [name=" + name + ", age=" + age + ", birth=" + birth + ", address=" + address + ", another="
				+ another + "]";
	}
	
}
