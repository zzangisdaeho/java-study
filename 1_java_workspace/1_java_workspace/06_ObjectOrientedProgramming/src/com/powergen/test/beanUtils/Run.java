package com.powergen.test.beanUtils;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.BeanUtils;

import com.powergen.test.propertyDescriptor.CopyTarget;
import com.powergen.test.propertyDescriptor.CopyTarget2;
import com.powergen.test.propertyDescriptor.TestClass;
import com.powergen.test.propertyDescriptor.TestInTest;

public class Run {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IntrospectionException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		TestInTest inside = new TestInTest();
		inside.setLoverNm("김회진");
		
		TestClass before = new TestClass("daeho", 30, sdf.parse("1990-01-18"), "서울시 송파구", inside);
		
		CopyTarget after1 = new CopyTarget();
		BeanUtils.copyProperties(after1, before);
		System.out.println("=========================");
		System.out.println(after1);
		
		CopyTarget2 after2 = new CopyTarget2();
		BeanUtils.copyProperties(after2, before);
		System.out.println("=========================");
		System.out.println(after2);
		
	}

}
