package run;

import java.util.Arrays;
import java.util.function.Function;

import enums.Enum3;

public class RunEnum3 {

	public static void main(String[] args) {
		Enum3 enum3 = Enum3.CALC_B;
		System.out.println(enum3);
		
		Function<Integer, Integer> func = enum3.getCalculate();
		System.out.println(func.apply(3));

		int calculated = enum3.doCalculate(3);
		System.out.println(calculated);
		
		Arrays.asList("ACCOUNT_TRANSFER", "PEMITTANCE", "ON_SITE_PAYMENT", "TOSS");
	}
}
