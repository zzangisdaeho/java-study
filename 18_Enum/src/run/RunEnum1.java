package run;

import enums.Enum1;

public class RunEnum1 {

	public static void main(String[] args) {
		Enum1 web = Enum1.WEB;
		
		System.out.println(web);
		
		
		int webOrdinal = web.ordinal();
		String webName = web.getName();
		
		String webName2 = web.name;
		
		System.out.println(webOrdinal);
		System.out.println(webName);
		System.out.println(webName2);
	}
}
