package com.kh.example.chap01_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.kh.example.chap01_String.controller.StringController;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); // Wed Nov 27 13:29:19 KST 2019
		
		System.out.println(today.getTime());
		// 1970년 1월 1일 00시 00분 00초 이후로 흐른 시간을 가져오는 메소드
		
		Date time = new Date(1574829149680L);
		System.out.println(time);
		
		Date origin = new Date(0L);
		System.out.println(origin);
		
		Date date = new Date(2019, 3, 28);
		System.out.println(date);
		
	}
	public void method2() {
		//Calendar test
//		Calendar c  = new Calendar();
		// Calendar의 생성자는 protected로 만들어져있기 때문에 다른 클래스에서 객체 생성 불가능
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		// 년, 월, 일, 시, 분, 초 등의 정보를 Calendar에 있는 상수로 제공
		int year = Calendar.YEAR;
		System.out.println(year);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM)); // AM : 0, PM : 1
//		String ampm = (c.get(Calendar.AM_PM) == 0)? "오전" : "오후";
		String ampm = (c.get(Calendar.AM_PM) == Calendar.AM)? "오전" : "오후";
		System.out.println(ampm);
		System.out.println(c.get(Calendar.HOUR)); // 12시간 기반
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 24시간 기반
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}
	public void method3() {
		// GregorianCalendar Test
		// GregorianCalendar는 현재 날짜가 아닌 특정 날짜 값을 입력하여 객체 생성하는 기능 제공
		int year = 2020;
		int month = 3;
		int date = 28;
		int hour = 15;
		int min = 20;
		int sec = 0;
		
		Calendar c = new GregorianCalendar(year, month, date, hour, min, sec); // 형변환으로 Calendar Gregor와 일치하는 Calendar내 매개변수값을 넣어줌
		long time = c.getTimeInMillis(); // Calendar 내 메소드 getTimeInMillis를 사용해서 1970년 이후로 지정한 시간까지의 값을 Long형으로 받아옴
		System.out.println(time);
		Date endDay = new Date(time); // Date(Long)생성자를 이용하여 70년 이후 long만큼 흐른 시간이 언제인지 Date값으로 가져옴
		System.out.println(endDay);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-E요일 HH시 mm분 ss초"); // 생성자를 이용하여 프린트 할 format 요소 배치
		String fmt = sdf.format(endDay); // SimpleDateFormat 내 format 메소드를 이용하여 String값으로 받음
		System.out.println(fmt);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-E요일 a hh시 mm분 ss초");
		String fmt2 = sdf2.format(endDay);
		System.out.println(fmt2);
		
		
	}
}
