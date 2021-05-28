package com.kh.example.chap01.run;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Run2 {

	public static void main(String[] args) {

		Math plusLambda = (first, second) -> first + second;
		System.out.println(plusLambda.Calc(4, 2));

		Math minusLambda = (first, second) -> first - second;
		System.out.println(minusLambda.Calc(4, 2));

		IntFunction<Integer> oneplus = (x) -> x + 1;
		System.out.println(oneplus.apply(1));

		BinaryOperator<String> stringSum = (x, y) -> x + " " + y;
		System.out.println(stringSum.apply("¾ß", "È£"));

		Function<String, Integer> intFunctionLambda = (String str) -> str.compareTo("abc") == 0 ? 1 : 0;

		System.out.println("intFunctionLambda test for abc=" + intFunctionLambda.apply("abc"));

		BiConsumer<String, String> biConsumer = (x, y) ->  System.out.println(x+","+y);

		biConsumer.accept("First", "Second");
		
		new Thread(()->{
		      System.out.println("Welcome Heejin blog");
		}).start();
		

	}

}
