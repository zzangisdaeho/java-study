package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		int standard = ((Student)o1).getScore(); // ��ü
		int object = ((Student)o2).getScore(); // ���
		
		String standardName = ((Student)o1).getName();
		String objectName = ((Student)o2).getName();
		// ��������
		if(standard > object) {
			return 1;
		}
		else if (standard == object) {
//			return 0;
			return standardName.compareTo(objectName);
		}
		else {
			return -1;
		}
		
	}
	
}
