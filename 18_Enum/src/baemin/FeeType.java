package baemin;

public enum FeeType implements EnumMapperType {
	PERCENT("����"),
	MONEY("����");

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
