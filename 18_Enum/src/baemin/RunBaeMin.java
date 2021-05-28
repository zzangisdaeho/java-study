package baemin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunBaeMin {

	public static void main(String[] args) {

		List<EnumMapperValue> list = Arrays.stream(FeeType.values()).map(EnumMapperValue::new).collect(Collectors.toList());
		
		for(EnumMapperValue one : list) {
			System.out.println(one);
		}
		
	}

}
