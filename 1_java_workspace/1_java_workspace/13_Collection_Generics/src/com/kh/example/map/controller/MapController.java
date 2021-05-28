package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		Map<String, Snack> map = new HashMap<>(); // 뒤에 제네릭 생략 가능 <> 꺽쇄는 써줘야함.
		
		// put(K key, V value) : 키와 값을 추가하는 메소드. 추가 성공 시 value 반환
		map.put("새우깡", new Snack("짠맛", 1500));
		System.out.println(map.put("새우깡", new Snack("짠맛", 1500)));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한 맛", 1000));
//		System.out.println(map);
		map.put("새우깡", new Snack("매운맛", 1500));
//		System.out.println(map); // 같은 key를 가진 value를 넣어주면 새로운 value로 대체
		
		
		// containsKey(Object key) : key가 있으면 true반환
		// containsValue(Object value) : value가 있으면 true반환
		System.out.println(map.containsKey("새우깡"));
		System.out.println("containsValue : " + map.containsValue(new Snack("짠맛", 1500))); // new로 새로운 주소값이기 떄문에 같은지 검사 못험
		
		// get(Object key) : 키의 값(value) 반환
//		System.out.println(map.get("새우깡"));
//		System.out.println(map.get("홈런볼"));
		
		// map 엘리먼트 접근하기
		// 1. values() : 모든 value들을 Collection에 담아 반환
		System.out.println(map.values());
		
		
		// 2. keySet() : 모든 키를 Set에 담아서 반환
		System.out.println(map.keySet());
		Set<String> set1 = map.keySet(); //map의 key값을 String으로 했기 때문에 String 제네릭 형으로 반환한다.
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
//			System.out.printf("키 : %s, 값 : %s\n", key, map.get(key));
		}
		
		for(String key : map.keySet()) {
//			System.out.printf("키 : %s, 값 : %s\n", key, map.get(key));
		}
		// 3. entrySet() : 모든 entry객체를(키 + 값의 쌍) set에 담아 반환
		Set<Entry<String, Snack>> set2 = map.entrySet();
		//Entry를 담는 Set주머니에 넣는데, 이 Entry의 구조가 String,Snack으로 되어있다.
		Iterator<Entry<String,Snack>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<String, Snack> e = it2.next();
//			System.out.printf("키 : %s, 값 : %s\n", e.getKey(), e.getValue());
		}
		
		for(Entry<String, Snack> e : set2) {
//			System.out.printf("키 : %s, 값 : %s\n", e.getKey(), e.getValue());
		}
		
		Map map2 = new TreeMap();
		map2.putAll(map);
//		System.out.println(map2); // key값으로 정렬. String클래스는 Comparable이 구현되어 있기때문에 Snack클래스에 CompareTo 구현 안해도 알아서 정렬된다.
	}
	
	public void doProperties() { // 키와 값을 String타입으로 제한한 Map컬렉션
		Properties prop = new Properties();
		
//		prop.put(1, 10);
//		System.out.println(prop);
//		
//		prop.setProperty("1", "10");
//		System.out.println(prop);
		
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망");
//		System.out.println(prop);
		
		// getProperty(String key) : key를 통해 value 반환
		System.out.println(prop.getProperty("인생"));
		
		// getProperty(String key, String defaultValue) : key값이 있다면 value를 반환하고, key값이 없으면 지정defaultValue로 반환해라
		System.out.println(prop.getProperty("견과","땅콩"));
		System.out.println(prop.getProperty("채소","땅콩"));
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
//			System.out.println("왠 에러");
			String key = (String)e.nextElement();
			System.out.println(key + "/" + prop.getProperty(key));
		}
	}
	
	public void fileSave() {
		Properties prop = new Properties();
		prop.setProperty("title", "Properties Practice");
		prop.setProperty("width", "1920");
		prop.setProperty("height", "1080");
		prop.setProperty("language", "kor");
		
		try(FileOutputStream fos = new FileOutputStream("test.xml");) {
			
			// store(OutputStream out, String comments) : 저장된 정보를 바이트 스트림으로 파일에 출력 저장
			// store(Writer writer, String comments) : 저장된 정보를 문자 스트림으로 파일에 출력 저장
//			prop.store(fos, "Properties Test File");
			
			// storeToXML(OutputStream os , String comment) : 저장된 정보를 바이트 스트림으로 xml로 출력 저장
			prop.storeToXML(fos, "storeToXML Test");
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public void fileOpen() {
		try(FileInputStream fis = new FileInputStream("test.xml");) {
			System.out.println("**** test.properties 파일 열기 ****");
			
			Properties prop = new Properties();
			// load(InputStream inStream) : 바이트 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
			// load(Reader reader) : 문자 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
//			prop.load(fis);
			
			// loadFromXML(InputStream in) : 바이트 스트림으로 저장된 xml파일의 내용을 읽어와서 Properties 객체에 저장
			prop.loadFromXML(fis);
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
