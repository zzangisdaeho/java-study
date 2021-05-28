package run;

import enums.Enum5;
import enums.Enum5_PayType;

public class RunEnum5 {

	public static void main(String[] args) {
		Enum5 find = Enum5.findByPayCode(Enum5_PayType.CARD);
		System.out.println(find);
		System.out.println(find.getTitle());
		
	}
}
