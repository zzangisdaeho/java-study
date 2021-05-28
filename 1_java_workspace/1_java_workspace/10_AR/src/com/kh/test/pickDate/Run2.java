package com.kh.test.pickDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run2 {

	public static void main(String[] args) throws ParseException {
		
		String inputDate = "202101";
		SimpleDateFormat sdfyyyyMM = new SimpleDateFormat("yyyyMM");
		SimpleDateFormat sdfyyyyMMdd = new SimpleDateFormat("yyyyMMdd");
		Date syncDate = sdfyyyyMM.parse(inputDate);
		
		//이번달 1일 구하기
		Calendar cal = Calendar.getInstance();
		cal.setTime(syncDate);
		cal.set(cal.DAY_OF_MONTH, cal.getMinimum(Calendar.DAY_OF_MONTH));
		
		System.out.println(sdfyyyyMMdd.format(cal.getTime()));
		
		//이번달 말일 구하기
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(syncDate);
		cal2.set(cal.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(sdfyyyyMMdd.format(cal2.getTime()));
	}
}
