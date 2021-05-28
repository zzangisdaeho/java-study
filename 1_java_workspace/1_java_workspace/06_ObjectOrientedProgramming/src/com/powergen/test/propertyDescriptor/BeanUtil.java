package com.powergen.test.propertyDescriptor;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtil {

	/**
	 * modelMapper와 비슷한 역할이지만, null은 복사하지 않는다.(마지막줄에 해당기능 있음)
	 * 같은 클래스에서만 적용된다는 한계 있음.
	 * @param source
	 * @param target
	 * @throws IntrospectionException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public void copy(Object source, Object target)
			throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		BeanInfo beanInfo = Introspector.getBeanInfo(source.getClass());
		PropertyDescriptor[] pdList = beanInfo.getPropertyDescriptors();
		int index = 0;
		for (PropertyDescriptor pd : pdList) {
			System.out.println("========== index : " + index++ + " ==========");
			System.out.println(pd);
			Method writeMethod = null;
			Method readMethod = null;
			try {
				writeMethod = pd.getWriteMethod();
				System.out.println("writeMethod : " + writeMethod);
				readMethod = pd.getReadMethod();
				System.out.println("readMethod : " + readMethod);
			} catch (Exception e) {
			}

			if (readMethod == null || writeMethod == null) {
				continue;
			}

			Object val = readMethod.invoke(source);
			System.out.println("Object val : " + val);
			if (val != null) {
				Object afterWrite = writeMethod.invoke(target, val);
				System.out.println("After write : " + afterWrite);
			}
		}
	}
}
