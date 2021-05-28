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
		// 1970�� 1�� 1�� 00�� 00�� 00�� ���ķ� �帥 �ð��� �������� �޼ҵ�
		
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
		// Calendar�� �����ڴ� protected�� ��������ֱ� ������ �ٸ� Ŭ�������� ��ü ���� �Ұ���
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		// ��, ��, ��, ��, ��, �� ���� ������ Calendar�� �ִ� ����� ����
		int year = Calendar.YEAR;
		System.out.println(year);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM)); // AM : 0, PM : 1
//		String ampm = (c.get(Calendar.AM_PM) == 0)? "����" : "����";
		String ampm = (c.get(Calendar.AM_PM) == Calendar.AM)? "����" : "����";
		System.out.println(ampm);
		System.out.println(c.get(Calendar.HOUR)); // 12�ð� ���
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 24�ð� ���
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}
	public void method3() {
		// GregorianCalendar Test
		// GregorianCalendar�� ���� ��¥�� �ƴ� Ư�� ��¥ ���� �Է��Ͽ� ��ü �����ϴ� ��� ����
		int year = 2020;
		int month = 3;
		int date = 28;
		int hour = 15;
		int min = 20;
		int sec = 0;
		
		Calendar c = new GregorianCalendar(year, month, date, hour, min, sec); // ����ȯ���� Calendar Gregor�� ��ġ�ϴ� Calendar�� �Ű��������� �־���
		long time = c.getTimeInMillis(); // Calendar �� �޼ҵ� getTimeInMillis�� ����ؼ� 1970�� ���ķ� ������ �ð������� ���� Long������ �޾ƿ�
		System.out.println(time);
		Date endDay = new Date(time); // Date(Long)�����ڸ� �̿��Ͽ� 70�� ���� long��ŭ �帥 �ð��� �������� Date������ ������
		System.out.println(endDay);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-E���� HH�� mm�� ss��"); // �����ڸ� �̿��Ͽ� ����Ʈ �� format ��� ��ġ
		String fmt = sdf.format(endDay); // SimpleDateFormat �� format �޼ҵ带 �̿��Ͽ� String������ ����
		System.out.println(fmt);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-E���� a hh�� mm�� ss��");
		String fmt2 = sdf2.format(endDay);
		System.out.println(fmt2);
		
		
	}
}
