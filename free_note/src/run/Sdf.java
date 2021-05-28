package run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdf {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		
		String result = sdf.format(date);
		
		System.out.println(result);

	}

}
