package kh.com.example.practice7.run;

import kh.com.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee a = new Employee();
		a.setAddress("����� ������");
		a.setAge(25);
		a.setBonusPoint(0.05);
		a.setDept("������");
		a.setEmpName("ȫ�浿");
		a.setEmpNo(100);
		a.setGender('��');
		a.setJob("����");
		a.setPhone("010-1234-5678");
		a.setSalary(2500000);
		
		int empNo = a.getEmpNo();
		String empName = a.getEmpName();
		String dept = a.getDept();
		String job = a.getJob();
		int age = a.getAge();
		char gender = a.getGender();
		int salary = a.getSalary();
		double bonusPoint = a.getBonusPoint();
		String phone = a.getPhone();
		String address = a.getAddress();
		
		System.out.println(empNo);
		System.out.println(empName);
		System.out.println(dept);
		System.out.println(job);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(salary);
		System.out.println(bonusPoint);
		System.out.println(phone);
		System.out.println(address);
		
		
	}

}
