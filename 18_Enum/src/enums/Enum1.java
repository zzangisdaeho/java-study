package enums;

public enum Enum1 {

	MOBILE("�ȵ���̵�"), WEB("������"), SERVER("������");

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
