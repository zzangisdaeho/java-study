package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		if ((year%4 == 0 && year % 100 != 0) || (year%4 == 0 && year % 400 ==0)) {
			return true;
		}
		else {
			return false;
		}
	}
	public long leapDate(Calendar c) {
		int startYear = 1;
		int startMonth = 0;
		int startDay = 1;
		Calendar startSet = new GregorianCalendar(startYear, startMonth, startDay);
		Long startLong = startSet.getTimeInMillis();
		
		Long endLong = c.getTimeInMillis(); // 매개변수 사용
		
		long totalLong = endLong - startLong;
		long days = totalLong / (86400*1000);
		
		return days;
		
//		int startYear = 1;
//		int startMonth = 0;
//		int startDay = 1;
//		Calendar startSet = new GregorianCalendar(startYear, startMonth, startDay);
//		Long startLong = startSet.getTimeInMillis();
	}
	public long leapDate2(Calendar c) {
		int nowYear = c.get(c.YEAR); // 매개변수 사용
//		System.out.println(nowYear);
		int nowMonth = c.get(c.MONTH); // 매개변수 사용
//		System.out.println(nowMonth);
		int nowDate = c.get(c.DATE); // 매개변수 사용
//		System.out.println(nowDate);
		long count = 0L;
		
		for(int i = 1; i < nowYear; i++) {
			if (isLeapYear(i)) {
				count += 366;
			}
			else {
				count += 365;
			}
		}
		for(int i = 1; i < nowMonth+1; i++) {
			switch (i) {
			case 1 : case 3 : case 5 : case 7: case 8 : case 10 : case 12 :
				count += 31; break;
			case 4 : case 6 : case 9 : case 11 :
				count += 30; break;
			case 2 : 
				count += ((isLeapYear(nowYear) == true)? 29 : 28);
//				if (isLeapYear(nowYear)) {
//					count += 29;
//				}
//				else {
//					count += 28;
//				}
				
			}
		}
		count += nowDate;
		
		return count;
	}
}
