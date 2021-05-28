package enums;

import java.util.function.Function;

public enum Enum3 {

	CALC_A(value -> value),
	CALC_B(value -> value * 3),
	CALC_C(value -> value * 10),
	CALC_ETC(value -> 0);
	
	private Function<Integer, Integer> calculate;
	
	public Function<Integer, Integer> getCalculate() {
		return calculate;
	}

	public int doCalculate(int value) {
		return calculate.apply(value);
	}

	private Enum3(Function<Integer, Integer> calculate) {
		this.calculate = calculate;
	}
	
}
