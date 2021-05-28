package com.kh.test.pickDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Run3 {

	public static void main(String[] args) {
		String maxSyncDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		Date date = new Date();
		
		maxSyncDate = sdf.format(date);
		
		System.out.println("======================maxSyncDate========================");
		System.out.println(maxSyncDate);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -30);
		maxSyncDate = sdf.format(cal.getTime());
		System.out.println("======================maxSyncDate========================");
		System.out.println(maxSyncDate);

	}

}
