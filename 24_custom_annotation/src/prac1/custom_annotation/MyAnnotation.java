package prac1.custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface MyAnnotation {

	String value() default "default value"; //얘는 명시할 필요가 없음.
    String name () default "woosunghwan";
    int number() default 100; //Integer는 안됨
}
