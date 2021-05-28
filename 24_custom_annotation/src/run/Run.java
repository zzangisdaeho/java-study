package run;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import prac1.custom_annotation.MyAnnotation;
import prac1.custom_annotation.MyAnnotationTime;
import prac1.object.Book;

public class Run {

	public static void main(String[] args) {
		Arrays
		.stream(Book.class.getDeclaredAnnotations())
		.forEach(System.out::println);
		
		String value = Book.class.getDeclaredAnnotation(MyAnnotation.class).value();
		System.out.println(value);
		String name = Book.class.getDeclaredAnnotation(MyAnnotation.class).name();
		System.out.println(name);
		int number = Book.class.getDeclaredAnnotation(MyAnnotation.class).number();
		System.out.println(number);
		
		System.out.println("====================================================");
		
		Method[] methods = Book.class.getMethods();
		
		for(Method m : methods) {
			String methodName = m.getName();
			System.out.println("methodName : " + methodName);
			
			if(m.isAnnotationPresent(MyAnnotationTime.class) && methodName.startsWith("g")){
//				Annotation[] annotations = m.getDeclaredAnnotations();
//				System.out.println(annotations[0]);
				
				MyAnnotationTime myAnnotationTime = m.getDeclaredAnnotation(MyAnnotationTime.class);
				System.out.println(myAnnotationTime.methodV());
			}
		}
	}

}
