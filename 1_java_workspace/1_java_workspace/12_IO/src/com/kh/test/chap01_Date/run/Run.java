package com.kh.test.chap01_Date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.kh.test.chap01_Date.model.NumberGenerator;

public class Run {

	public static void main(String[] args) {
		NumberGenerator numberGenerator = NumberGenerator.makeGenerator();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(new Date());
		
//		String result = numberGenerator.getNumber("org", "mainma", "subsub", date);
		String result = numberGenerator.getNumber("org", "mainma", "subsub", "20201124");
		
		System.out.println(result);

	}

}
