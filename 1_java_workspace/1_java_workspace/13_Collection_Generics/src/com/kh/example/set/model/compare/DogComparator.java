package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		double standard = ((Dog)o1).getWeight();
		double object = ((Dog)o2).getWeight();
		
		String sName = ((Dog)o1).getName();
		String oName = ((Dog)o2).getName();
		
		if(standard > object) {
			return 1;
		}
		else if (standard == object) {
//			return 0;
			return sName.compareTo(oName);
		}
		else{
			return -1;
		}
	}
}
