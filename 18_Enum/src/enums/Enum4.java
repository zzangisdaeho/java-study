package enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Enum4 {

	CASH("����", Arrays.asList("ACCOUNT_TRANSFER", "PEMITTANCE", "ON_SITE_PAYMENT", "TOSS")),
	CARD("ī��", Arrays.asList("PAYCO", "CARD", "KAKAO_PAY", "BAEMIN_PAY")),
	ETC("��Ÿ", Arrays.asList("POINT", "COUPON")),
	EMPTY("����", Collections.EMPTY_LIST);
	
	private String title;
	private List<String> payList;
	
	private Enum4(String title, List<String> payList) {
		this.title = title;
		this.payList = payList;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static Enum4 findByPayCode(String code) {
		return Arrays.stream(Enum4.values()).filter(enum4 -> enum4.hasPayCode(code)).findAny().orElse(EMPTY);
	}

	private boolean hasPayCode(String code) {
		return payList.stream().anyMatch(pay -> pay.equals(code));
	}
	
}
