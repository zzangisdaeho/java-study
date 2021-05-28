package com.kh.example.chap01_String.controller;

public class StringController {
//	double a = 3.33D;
//	public static String b = Double.toString(a);
	
	public void method1() {
		String s1 = "�ڹ�";
		String s2 = "����";
		String s3 = s1 + s2;
		System.out.println(s3);
		
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1 == str2 : " + (str1 == str2)); // ��Ʈ��Ǯ�� �ִ�  "java"�� �����Ѵ�. -> �ּҰ��� ����
		// String pool(==Literal pool == Constant pool)�� ����� "java" ��ġ�� ���� ������
		// str1�� str2�� �ּҰ� ����
		
		System.out.println("str1 == str3 : " + (str1 == str3)); // 
		// String pool�� �ּҿ� ��ü�� �ּҸ� ���ϴ� ���̱� ������ �ּҰ� �ٸ�
		// String ���� ���ϱ� ���ؼ� equals() �޼ҵ� ���
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		
		
		// hashCode()
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		new Object().hashCode();
		
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		
		str2 += "oracle"; // str2 : javaoracle
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		// String�� ���ڰ� �����Ǵ� ���� �ƴϰ� ���ο� ������ ����� ���ڿ��� �����ϱ� ������
		// �ּ� ���� �ٸ��� ����
	}
	public void method2() {
		// StringBuffer Test
		// ���� ���� ������ �����鼭 �д� ���� ���� ���� �Һ� Ŭ������ StringŬ������ �� ����
		// ���� ���� ������ ���� ��� StringBuffer�� StringBuilder�� �ϴ°� �� ����
		
		StringBuffer buffer1 = new StringBuffer();
		// StringBuffer�� lang��Ű���ν� ��ü�� �����ص� import ���� �ʴ´�. lang��Ű���ε� ��ü�� �����Ѱ��� ������ġ�� buffer�̱� ������ ���� ��ɵ��� ����ϱ� �����̴�.
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ����ִ� ���� ���� ���� : " + buffer1.length());
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100); // �ʱ� ���뷮 ����
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length());
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());
		System.out.println();
		
		// append(String str) : StringBuffer
//		buffer3.append("abc");
//		System.out.println("abc �߰� ���� buffer : " + buffer3);
//		System.out.println("abc �߰� ���� buffer3 �뷮 : " + buffer3.capacity());
//		System.out.println("abc �߰� ���� buffer3 ���� : " + buffer3.length());
//		
//		buffer3.append("def");
//		System.out.println("def �߰� ���� buffer : " + buffer3);
//		System.out.println("def �߰� ���� buffer3 �뷮 : " + buffer3.capacity());
//		System.out.println("def �߰� ���� buffer3 ���� : " + buffer3.length());
		
		buffer3.append("abc").append("def"); // �޼ҵ� ü�̴�
		//------------------- ��ȯ���� StringBuffer. �׷��� ������ �ٽ� .append�ص� StringBuffer.append�� �Ǵ°�
		System.out.println("def �߰� ���� buffer : " + buffer3);
		System.out.println("def �߰� ���� buffer3 �뷮 : " + buffer3.capacity());
		System.out.println("def �߰� ���� buffer3 ���� : " + buffer3.length());
		System.out.println();
		
		
		//insert(int offset, String str) : StringBuild
		buffer3.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz �߰� ���� buffer3 : " + buffer3);
		
		System.out.println();
		
		// delete(int start, int end) : StringBuffer
		buffer3.delete(2, 5); // start <= index < end
		System.out.println("�ε��� 2���� �ε��� 5���� ���� ���� buffer3 : " + buffer3);
		
		System.out.println();
		
		buffer3.reverse();
		System.out.println("reverse ���� buffer3 : " + buffer3);
		
	}
	public void method3() {
		// String method test
		String str = "Hello world";
		
		// 1. charAt(int index) : char
		//		String�� index��°�� char ��ȯ
		
		// 2. concat(String str) : String
		//		�Ű������� ���� str�� ���� ���� ���� �̾� �ٿ� String ��ȯ
		
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		str += "!!!";
		System.out.println("str : " + str);
		
		// 3. equlas(String str) : boolean
		//		�̰ǻ���
		
		// 4. subString(int beginIndex) : String
		//		beginIndex ��°���� �߶� String ��ȯ
		//    subString(int beginIndex, int endIndex) : String
		//		beginIndex ��°���� endIndex���� �߶� String ��ȯ
		//		beginIndex <= Index < endIndex
		System.out.println("str.subString(6) : "+ str.substring(6));
		System.out.println("str.subString(0, 5) : "+str.substring(0, 5));
		
		// 5. replace(char old, char new) : String
		//		���ڿ� �ȿ� old ���ڸ� new���ڷ� ��ü
		System.out.println("str.replace('1', 'e') : " + str.replace('l', 'e'));
		
		// 6. toUpperCase() / toLowerCase() : String
		//		��� �빮�ڷ�, ��� �ҹ��ڷ� ��ȯ
		System.out.println("upper : " + str.toUpperCase());
		
		// 7. equalsIgnoreCase() : boolean
		//		��ҹ��� �������ʰ� ��
		
		// 8. trim() : String
		//		�翷 ���� ���� (���ڿ� �� ������ �������� �ʴ´�)
		String str1 = "     Java";
		String str2 = "Java     ";
		String str3 = "    Ja  va    ";
		System.out.println(str1 + " : " + str1.trim());
		System.out.println(str2 + " : " + str2.trim()+"!");
		System.out.println(str3 + " : " +"!"+ str3.trim()+"!");
		
		// 9. split(String str) : String[]
		//		������ �����ڷ� ���ڿ��� �и��Ͽ� ���ڿ� �迭 ��ȯ
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("splitArr�� ���� : " + splitArr.length);
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println("splitArr["+i+"] : " + splitArr[i]);
		}
		
	}
	public void method4() {
		
		double a = 3.33D;
		String b = Double.toString(a);
		System.out.println(a);
		System.out.println(b);
		
		
	}
		
}
