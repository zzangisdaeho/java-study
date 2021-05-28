package baemin;

public enum FeeType implements EnumMapperType {
	PERCENT("정율"),
	MONEY("정액");

	private String title;
	
	private FeeType(String title) {
		this.title = title;
	}

	@Override
	public String getCode() {
		return name();
	}

	@Override
	public String getTitle() {
		return this.title;
	}

}
