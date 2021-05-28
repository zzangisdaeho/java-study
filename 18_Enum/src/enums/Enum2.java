package enums;

public enum Enum2 {

	ON("ÄÑÁü"), OFF("²¨Áü");
	
	final private String krName;

	public String getKrName() {
		return krName;
	}

	private Enum2(String krName) {
		this.krName = krName;
	}
	
	public Enum2 switchOpposite() {
		if(this == Enum2.ON) return Enum2.OFF;
		else return Enum2.ON;
	}
}
