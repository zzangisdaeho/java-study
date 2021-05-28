package prac1.custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface MyAnnotation {

	String value() default "default value"; //��� ����� �ʿ䰡 ����.
    String name () default "woosunghwan";
    int number() default 100; //Integer�� �ȵ�
}
