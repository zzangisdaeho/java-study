package run;

import java.util.HashSet;
import java.util.Set;

public class Run2 {

	public static void main(String[] args) {
		
		//������ Ŭ������ �������� ���
		Class c = "foo".getClass();
		System.out.println(c);      //class java.lang.String
		
		//Array�� ��ü�̹Ƿ� Array �ν��Ͻ����� Ŭ���� ������ �ε��� �� �ֽ��ϴ�.
		byte[] b = new byte[10];
		Class c1 = b.getClass();
		System.out.println(c1);     //class [B
		
		Set<String> s = new HashSet<>();
		Class c2 = s.getClass();
		System.out.println(c2);     //class java.util.HashSet
	}
}
