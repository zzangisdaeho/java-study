package com.kh.example.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Run2 {
	public static void main(String[] args) {
		
		List<String> targetList = new ArrayList<String>();
		targetList.add("a");
		targetList.add("b");
		targetList.add("c");
		targetList.add("d");
		Iterator<String> ite = targetList.iterator();
		 
		while(ite.hasNext()) {
		     String str = ite.next();
		     if ("a".equals(str)) {
		          ite.remove();
		     }
		     else if ("c".equals(str)) {
		    	 ite.remove();
		     }
		}
		
		for(String a : targetList) {
			System.out.println(a);
		}
		
	}

}
