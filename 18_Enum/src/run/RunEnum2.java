package run;

import enums.Enum2;

public class RunEnum2 {

	public static void main(String[] args) {
		Enum2 enum2 = Enum2.ON;
		System.out.println(enum2.name());
		System.out.println(enum2);

		Enum2 switched = enum2.switchOpposite();
		System.out.println(switched);
	}
}
