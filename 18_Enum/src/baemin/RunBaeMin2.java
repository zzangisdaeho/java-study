package baemin;

import java.util.List;

public class RunBaeMin2 {

	public static void main(String[] args) {

		EnumMapper mapper = new EnumMapper();
		
		mapper.put("FeeType", FeeType.class);
		// 스프링에서 이렇게 만든 EnumMapper를 bean으로 등록 한다. 인스턴스를 한번만 생성하기 위한것.
		
		
		
		// 스프링에서 등록한 bean에서 조회하면 인스턴스를 한번만 생성하는 목적이 완료된다.
		List<EnumMapperValue> list = mapper.get("FeeType");
		
		list.forEach(System.out::println);
	}

}
