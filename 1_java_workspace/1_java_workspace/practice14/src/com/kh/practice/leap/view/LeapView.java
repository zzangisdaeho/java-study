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
			System.out.println(thisYear+"���� �����Դϴ�");
		}
		else {
			System.out.println(thisYear+"���� ����Դϴ�");
		}
		
		Date today = new Date();
//		Long todayLong = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat
				("������ yyyy�� MM�� dd E���� a hh�� mm�� ss�� �Դϴ�");
		System.out.println(sdf.format(today));
		
		
		int endYear = c.get(c.YEAR);
		int endMonth = c.get(c.MONTH);
//		System.out.println(endMonth);
		int endDay = c.get(c.DATE);
		Calendar endSet = new GregorianCalendar(endYear, endMonth, endDay);
		
		
		long days = lc.leapDate(endSet);
		System.out.println("========== 1�� ��� ==========");
		System.out.println("1�� 1�Ϻ��� ���ñ��� �� ��¥ ���� : " + days);
		
		
		
		System.out.println("========== 2�� ��� ==========");
		Calendar a = Calendar.getInstance();
		long countDays = lc.leapDate2(a);
		System.out.println("1�� 1�Ϻ��� ���ñ��� �� ��¥ ���� : " + countDays);
	}
}
