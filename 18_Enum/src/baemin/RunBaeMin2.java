package baemin;

import java.util.List;

public class RunBaeMin2 {

	public static void main(String[] args) {

		EnumMapper mapper = new EnumMapper();
		
		mapper.put("FeeType", FeeType.class);
		// ���������� �̷��� ���� EnumMapper�� bean���� ��� �Ѵ�. �ν��Ͻ��� �ѹ��� �����ϱ� ���Ѱ�.
		
		
		
		// ���������� ����� bean���� ��ȸ�ϸ� �ν��Ͻ��� �ѹ��� �����ϴ� ������ �Ϸ�ȴ�.
		List<EnumMapperValue> list = mapper.get("FeeType");
		
		list.forEach(System.out::println);
	}

}
