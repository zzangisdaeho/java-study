package baemin;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EnumMapper {
	private Map<String, List<EnumMapperValue>> factory = new LinkedHashMap<>();
	
	public EnumMapper() {}
	
	public void put(String key, Class<? extends EnumMapperType> e) {
		factory.put(key, toEnumValues(e));
	}
	
	public List<EnumMapperValue> toEnumValues(Class<? extends EnumMapperType> e) {
		//getEnumConstants() : Enum의 상수값을 리스트로 돌려준다
		return Arrays.stream(e.getEnumConstants()).map(EnumMapperValue::new).collect(Collectors.toList());
	}
	
	public List<EnumMapperValue> get(String key){
		return factory.get(key);
	}
	
	public Map<String, List<EnumMapperValue>> get(List<String> keys){
		if(keys == null || keys.size() == 0) {
			return new LinkedHashMap<>();
		}else {
			//키값에 해당하는 value를 가져와서 toMap으로 스까묵는것. Function.identity는 현재 돌아가고 있는 key값을 그대로 돌려준다고 보면 된다.
			//Map으로 스까묵기때문에 동일 key에 대해서는 나중의것이 덮어씌운다. 근데 동일key값에 다른 value가 있는것 부터가 잘못만든거다;
			return keys.stream().collect(Collectors.toMap(Function.identity(), key -> factory.get(key)));
		}
	}
	
	public Map<String, List<EnumMapperValue>> getAll(){
		return factory;
	}
}
