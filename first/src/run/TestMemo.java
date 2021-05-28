package run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestMemo {

	public static void main(String[] args) {
		String[] arr = {"2011","2012", null, "2013", null};
		
//		String[] array = new String[]{"foo", "bar", "baz"};

		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == null) {
				list.remove(null);
			}
		}
		
//		System.out.println(list);
		
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		map.put("arr", list);
		
		System.out.println(map.get("arr"));
		
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------");
		System.out.println(list.size());

		// Creates a new array with the same size as the list and copies the list
		// elements to it.
		
		
//		array = list.toArray(new String[list.size()]);
//
//		System.out.println(Arrays.toString(array)); //[bar, baz]
	}

}
