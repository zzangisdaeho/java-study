package com.powergen.test.propertyDescriptor;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Run {

	public static void main(String[] args) throws ParseException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, IntrospectionException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		TestClass before = new TestClass("daeho", 30, sdf.parse("1990-01-18"), "서울시 송파구");
//		TestClass before = new TestClass("daeho", 30, sdf.parse("1990-01-18"), null);

		TestClass after = new TestClass();
		after.setAddress("있어");
		
		new BeanUtil().copy(before, after);
		
		System.out.println("=========================");
		System.out.println(after);
		
//		TestInTest inside = new TestInTest();
//		inside.setLoverNm("김회진");
//		
//		TestClass before = new TestClass("daeho", 30, sdf.parse("1990-01-18"), "서울시 송파구", inside);
//		
//		TestClass after = new TestClass();
//		CopyTarget after2 = new CopyTarget();
//		
//		new BeanUtil().copy(before, after2);
//		
//		System.out.println("=========================");
//		System.out.println(after);
		
		
	}

}
