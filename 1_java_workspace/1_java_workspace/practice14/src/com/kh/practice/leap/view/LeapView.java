package com.kh.practice.leap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	Date d;
	
	public LeapView() {
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(c.YEAR);
		
		if (lc.isLeapYear(thisYear)) {
			System.out.println(thisYear+"년은 윤년입니다");
		}
		else {
			System.out.println(thisYear+"년은 평년입니다");
		}
		
		Date today = new Date();
//		Long todayLong = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat
				("오늘은 yyyy년 MM월 dd E요일 a hh시 mm분 ss초 입니다");
		System.out.println(sdf.format(today));
		
		
		int endYear = c.get(c.YEAR);
		int endMonth = c.get(c.MONTH);
//		System.out.println(endMonth);
		int endDay = c.get(c.DATE);
		Calendar endSet = new GregorianCalendar(endYear, endMonth, endDay);
		
		
		long days = lc.leapDate(endSet);
		System.out.println("========== 1번 방법 ==========");
		System.out.println("1월 1일부터 오늘까지 총 날짜 수는 : " + days);
		
		
		
		System.out.println("========== 2번 방법 ==========");
		Calendar a = Calendar.getInstance();
		long countDays = lc.leapDate2(a);
		System.out.println("1월 1일부터 오늘까지 총 날짜 수는 : " + countDays);
	}
}
