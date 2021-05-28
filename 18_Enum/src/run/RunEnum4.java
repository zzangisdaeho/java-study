package run;

import java.util.Arrays;

import enums.Enum4;
import enums.Enum5_PayType;

public class RunEnum4 {

	public static void main(String[] args) {
		Enum4 find = Enum4.findByPayCode("COUPON2");
		System.out.println(find);
		System.out.println(find.getTitle());
		
	}
}
