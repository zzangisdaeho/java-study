package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] pc = new int[2];
		int sCount = 0;
		int eCount = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				sCount ++;
			}
		}
		pc[0] = sCount;
		
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				eCount ++;
			}
		}
		pc[1] = eCount;
		
		return pc;
	}
	
	public void insertStudent(String name, int age, double height,
			double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		Student[] ps;
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				continue;
			}
			else {
				count++;
			}
		}
		
		ps = new Student[count];
		int write = 0;
		
		for (int i = 0; i < ps.length; i++) {
			if (s[i] == null) {
				continue;
			}
			else {
				ps[write] = s[i];
				write++;
			}
		}
		
		return ps;
	}
	
	public void insertEmployee(String name, int age, double height,
			double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		Employee[] pe;
		int count = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				continue;
			}
			else {
				count++;
			}
		}
		
		pe = new Employee[count];
		int write = 0;
		
		for (int i = 0; i < pe.length; i++) {
			if (s[i] == null) {
				continue;
			}
			else {
				pe[write] = e[i];
				write++;
			}
		}
		
		return pe;
	}
	
}
