package com.kh.test.pickDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) throws ParseException {
		String inputDate = "20210117";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date syncDate = sdf.parse(inputDate);
		
		//3개월 전 첫날 구하기
		Calendar cal = Calendar.getInstance();
		cal.setTime(syncDate);
		cal.add(cal.MONTH, -3);
		cal.set(cal.DATE, 1);
		
		String changedDate = sdf.format(cal.getTime());
		System.out.println(changedDate);
		
		//저번달 말일 구하기
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(syncDate);
		cal2.add(cal2.MONTH, -1);
		cal2.set(cal.DATE, cal2.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String changedDate2 = sdf.format(cal2.getTime());
		System.out.println(changedDate2);
		
		//이번달 첫일 구하기
		Calendar cal3 = Calendar.getInstance();
		cal3.setTime(syncDate);
		cal3.set(cal3.DATE, 1);
		
		String changedDate3 = sdf.format(cal3.getTime());
		System.out.println(changedDate3);
		
		//이번달 말일 구하기
		Calendar cal4 = Calendar.getInstance();
		cal4.setTime(syncDate);
		cal4.set(cal4.DATE, cal4.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String changedDate4 = sdf.format(cal4.getTime());
		System.out.println(changedDate4);

		//지난주 시작일(월요일)
		Calendar cal5 = Calendar.getInstance();
		cal5.setTime(syncDate);
		int week = cal5.get(Calendar.WEEK_OF_MONTH);
		cal5.set(Calendar.WEEK_OF_MONTH, week-1);
		cal5.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		String changedDate5 = sdf.format(cal5.getTime());
		System.out.println(changedDate5);
		
		//지난주 끝일(일요일)
		Calendar cal6 = Calendar.getInstance();
		cal6.setTime(syncDate);
		int week2 = cal6.get(Calendar.WEEK_OF_MONTH);
		cal6.set(Calendar.WEEK_OF_MONTH, week-1);
		cal6.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal6.add(Calendar.DAY_OF_MONTH, 7);
		String changedDate6 = sdf.format(cal6.getTime());
		System.out.println(changedDate6);
		
		//현재 날짜 주차

 		Calendar c = Calendar.getInstance();
 		c.setTime(syncDate);
 		int week3 = c.get(Calendar.WEEK_OF_MONTH);
// 		String week3 = String.valueOf(c.get(Calendar.WEEK_OF_MONTH));
 		System.out.println(c.get(Calendar.DAY_OF_WEEK));
 		if(c.get(Calendar.DAY_OF_WEEK) == 1) {
 			week3--;
 		}
 		System.out.println(week3);
 		
 		//저번주가 이변년도의 몇번째주?
 		Calendar cc = Calendar.getInstance();
 		cc.setTime(syncDate);
 		cc.add(cc.DATE, -7);
 		int weeks = cc.get(Calendar.WEEK_OF_YEAR);
 		if(cc.get(Calendar.DAY_OF_WEEK) == 1) {
 			System.out.println("일요일입니다");
 			weeks--;
 		}
 		System.out.println(weeks);
 		int year = cc.get(Calendar.YEAR);
 		System.out.println("" + year + weeks);


 		//어제
 		Calendar cal7 = Calendar.getInstance();
		cal7.setTime(syncDate);
		cal7.add(Calendar.DAY_OF_MONTH, -1);
		String changedDate7 = sdf.format(cal7.getTime());
		System.out.println(changedDate7);
 		
		String cut = changedDate7.substring(0, changedDate7.length()-2);
		System.out.println(cut);



	}

}
