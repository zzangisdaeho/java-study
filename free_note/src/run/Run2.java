package run;

import java.util.HashSet;
import java.util.Set;

public class Run2 {

	public static void main(String[] args) {
		
		//임의의 클래스를 가져오는 방법
		Class c = "foo".getClass();
		System.out.println(c);      //class java.lang.String
		
		//Array는 객체이므로 Array 인스턴스에서 클래스 정보를 로드할 수 있습니다.
		byte[] b = new byte[10];
		Class c1 = b.getClass();
		System.out.println(c1);     //class [B
		
		Set<String> s = new HashSet<>();
		Class c2 = s.getClass();
		System.out.println(c2);     //class java.util.HashSet
	}
}
