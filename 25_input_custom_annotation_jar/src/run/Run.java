package run;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

import prac1.custom_annotation.MyAnnotation;
import prac1.custom_annotation.MyAnnotationTime;
import prac1.object.Book;

@MyAnnotation
public class Run {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Arrays
		.stream(Book.class.getDeclaredAnnotations())
		.forEach(System.out::println); 
		
		
		try {
			Field C = Book.class.getDeclaredField("C");
			if(C != null) {
				Annotation annotation = C.getDeclaredAnnotation(MyAnnotationTime.class);
				
				if(annotation != null) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
					sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
					System.out.println("Time : " + sdf.format(new Date()));
				}
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
