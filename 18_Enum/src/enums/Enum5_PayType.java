package enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Enum5_PayType {

	ACCOUNT_TRANSFER("������ü"),
	REMITTANCE("�������Ա�"),
	ON_SITE_PAYMENT("�������"),
	TOSS("�佺"),
	PAYCO("������"),
	CARD("�ſ�ī��"),
	KAKAO_PAY("īī������"),
	BAEMIN_PAY("�������"),
	POINT("����Ʈ"),
	COUPON("����"),
	EMPTY("����");
	
	private String title;

	private Enum5_PayType(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
}
