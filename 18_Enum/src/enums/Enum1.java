package enums;

public enum Enum1 {

	MOBILE("안드로이드"), WEB("스프링"), SERVER("리눅스");

	public String name = "";

	public String getName() {
		return name;
	}

//	private Enum1() {
//	}

	private Enum1(String name) {
		this.name = name;
	}
	
}
