package enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Enum5 {

	CASH("현금", Arrays.asList(Enum5_PayType.ACCOUNT_TRANSFER, Enum5_PayType.REMITTANCE, Enum5_PayType.ON_SITE_PAYMENT, Enum5_PayType.TOSS)),
	CARD("카드", Arrays.asList(Enum5_PayType.PAYCO, Enum5_PayType.CARD, Enum5_PayType.KAKAO_PAY, Enum5_PayType.BAEMIN_PAY)),
	ETC("기타", Arrays.asList(Enum5_PayType.POINT, Enum5_PayType.COUPON)),
	EMPTY("없음", Collections.EMPTY_LIST);
	
	private String title;
	private List<Enum5_PayType> payList;
	
	private Enum5(String title, List<Enum5_PayType> payList) {
		this.title = title;
		this.payList = payList;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static Enum5 findByPayCode(Enum5_PayType payType) {
		return Arrays.stream(Enum5.values()).filter(enum5 -> enum5.hasPayCode(payType)).findAny().orElse(EMPTY);
	}

	private boolean hasPayCode(Enum5_PayType payType) {
		return payList.stream().anyMatch(pay -> pay.equals(payType));
	}
	
}
