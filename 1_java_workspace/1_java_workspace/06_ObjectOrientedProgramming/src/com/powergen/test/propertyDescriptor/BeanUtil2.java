package com.powergen.test.propertyDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtil2 {

	public void copy2(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Method m : obj.getClass().getMethods()) {
			// The getter should start with "get" 
			// I ignore getClass() method because it never returns null
			if (m.getName().startsWith("get") && !m.getName().equals("getClass")) {
				// These getters have no arguments
				if (m.invoke(obj) == null) {
					// Do something
				}
				if (m.invoke(obj).equals("")) {
					// Do something
				}
			}
		}
	}
}
