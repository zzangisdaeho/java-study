package prac1.object;

import prac1.custom_annotation.MyAnnotation;
import prac1.custom_annotation.MyAnnotationTime;

//@MyAnnotation(name = "daeho", number = 31)
@MyAnnotation("input")
public class Book {

	private String B = "BOOK";
	
	@MyAnnotationTime
	private String C = "BOOK";
	private String a = "a";
	private String d = "d";
	private String e = "e";
	
//	@MyAnnotation // '@MyAnnotation' not applicable to constructor 컴파일에러
//    public Book(){
//
//    }
	
	@MyAnnotationTime
    private void f(){
        System.out.println("F");
    }

	@MyAnnotationTime(methodV = "되라아아아")
    public void g(){
        System.out.println("g");
    }

    public int h(){
        return 100;
    }
}
