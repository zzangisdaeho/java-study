package kh.com.example.practice4.run;

import kh.com.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student a = new Student();
		a.setter(80, 3, "±Ë¥Î»£", 160, 'M');
		a.information();
	}

}
