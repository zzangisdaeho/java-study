package com.kh.example.chap01_String.controller;

public class StringController {
//	double a = 3.33D;
//	public static String b = Double.toString(a);
	
	public void method1() {
		String s1 = "자바";
		String s2 = "만세";
		String s3 = s1 + s2;
		System.out.println(s3);
		
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1 == str2 : " + (str1 == str2)); // 스트링풀에 있는  "java"를 공유한다. -> 주소값이 같다
		// String pool(==Literal pool == Constant pool)에 저장된 "java" 위치가 같기 때문에
		// str1과 str2의 주소가 같음
		
		System.out.println("str1 == str3 : " + (str1 == str3)); // 
		// String pool의 주소와 객체의 주소를 비교하는 것이기 때문에 주소가 다름
		// String 값을 비교하기 위해선 equals() 메소드 사용
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		
		
		// hashCode()
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		new Object().hashCode();
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		
		str2 += "oracle"; // str2 : javaoracle
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		// String은 문자가 수정되는 것이 아니고 새로운 공간을 만들어 문자열을 저장하기 때문에
		// 주소 값이 다르게 나옴
	}
	public void method2() {
		// StringBuffer Test
		// 값에 대한 변경이 적으면서 읽는 것이 많을 때는 불변 클래스인 String클래스가 더 용이
		// 값에 대한 변경이 많은 경우 StringBuffer나 StringBuilder로 하는게 더 나음
		
		StringBuffer buffer1 = new StringBuffer();
		// StringBuffer은 lang패키지로써 객체를 생성해도 import 되지 않는다. lang패키지인데 객체를 생성한것은 저장위치가 buffer이기 때문에 관련 기능들을 사용하기 위함이다.
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어있는 실제 값의 길이 : " + buffer1.length());
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100); // 초기 수용량 지정
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length());
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());
		System.out.println();
		
		// append(String str) : StringBuffer
//		buffer3.append("abc");
//		System.out.println("abc 추가 후의 buffer : " + buffer3);
//		System.out.println("abc 추가 후의 buffer3 용량 : " + buffer3.capacity());
//		System.out.println("abc 추가 후의 buffer3 길이 : " + buffer3.length());
//		
//		buffer3.append("def");
//		System.out.println("def 추가 후의 buffer : " + buffer3);
//		System.out.println("def 추가 후의 buffer3 용량 : " + buffer3.capacity());
//		System.out.println("def 추가 후의 buffer3 길이 : " + buffer3.length());
		
		buffer3.append("abc").append("def"); // 메소드 체이닝
		//------------------- 반환값이 StringBuffer. 그렇기 때문에 다시 .append해도 StringBuffer.append가 되는것
		System.out.println("def 추가 후의 buffer : " + buffer3);
		System.out.println("def 추가 후의 buffer3 용량 : " + buffer3.capacity());
		System.out.println("def 추가 후의 buffer3 길이 : " + buffer3.length());
		System.out.println();
		
		
		//insert(int offset, String str) : StringBuild
		buffer3.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz 추가 후의 buffer3 : " + buffer3);
		
		System.out.println();
		
		// delete(int start, int end) : StringBuffer
		buffer3.delete(2, 5); // start <= index < end
		System.out.println("인덱스 2부터 인덱스 5까지 삭제 후의 buffer3 : " + buffer3);
		
		System.out.println();
		
		buffer3.reverse();
		System.out.println("reverse 후의 buffer3 : " + buffer3);
		
	}
	public void method3() {
		// String method test
		String str = "Hello world";
		
		// 1. charAt(int index) : char
		//		String의 index번째의 char 반환
		
		// 2. concat(String str) : String
		//		매개변수로 들어온 str을 원래 값의 끝에 이어 붙여 String 반환
		
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		str += "!!!";
		System.out.println("str : " + str);
		
		// 3. equlas(String str) : boolean
		//		이건생략
		
		// 4. subString(int beginIndex) : String
		//		beginIndex 번째부터 잘라낸 String 반환
		//    subString(int beginIndex, int endIndex) : String
		//		beginIndex 번째부터 endIndex까지 잘라낸 String 반환
		//		beginIndex <= Index < endIndex
		System.out.println("str.subString(6) : "+ str.substring(6));
		System.out.println("str.subString(0, 5) : "+str.substring(0, 5));
		
		// 5. replace(char old, char new) : String
		//		문자열 안에 old 문자를 new문자로 교체
		System.out.println("str.replace('1', 'e') : " + str.replace('l', 'e'));
		
		// 6. toUpperCase() / toLowerCase() : String
		//		모두 대문자로, 모두 소문자로 변환
		System.out.println("upper : " + str.toUpperCase());
		
		// 7. equalsIgnoreCase() : boolean
		//		대소문자 가리지않고 비교
		
		// 8. trim() : String
		//		양옆 공백 제거 (문자열 내 공백은 지워지지 않는다)
		String str1 = "     Java";
		String str2 = "Java     ";
		String str3 = "    Ja  va    ";
		System.out.println(str1 + " : " + str1.trim());
		System.out.println(str2 + " : " + str2.trim()+"!");
		System.out.println(str3 + " : " +"!"+ str3.trim()+"!");
		
		// 9. split(String str) : String[]
		//		지정된 구분자로 문자열을 분리하여 문자열 배열 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("splitArr의 길이 : " + splitArr.length);
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
