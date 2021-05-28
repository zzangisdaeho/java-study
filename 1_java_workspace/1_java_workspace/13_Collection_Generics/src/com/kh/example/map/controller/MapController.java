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
		Map<String, Snack> map = new HashMap<>(); // �ڿ� ���׸� ���� ���� <> ����� �������.
		
		// put(K key, V value) : Ű�� ���� �߰��ϴ� �޼ҵ�. �߰� ���� �� value ��ȯ
		map.put("�����", new Snack("§��", 1500));
		System.out.println(map.put("�����", new Snack("§��", 1500)));
		map.put("������", new Snack("�ܸ�", 2500));
		map.put("��������Ĩ", new Snack("§��", 1500));
		map.put("��ҹ�", new Snack("����� ��", 1000));
//		System.out.println(map);
		map.put("�����", new Snack("�ſ��", 1500));
//		System.out.println(map); // ���� key�� ���� value�� �־��ָ� ���ο� value�� ��ü
		
		
		// containsKey(Object key) : key�� ������ true��ȯ
		// containsValue(Object value) : value�� ������ true��ȯ
		System.out.println(map.containsKey("�����"));
		System.out.println("containsValue : " + map.containsValue(new Snack("§��", 1500))); // new�� ���ο� �ּҰ��̱� ������ ������ �˻� ����
		
		// get(Object key) : Ű�� ��(value) ��ȯ
//		System.out.println(map.get("�����"));
//		System.out.println(map.get("Ȩ����"));
		
		// map ������Ʈ �����ϱ�
		// 1. values() : ��� value���� Collection�� ��� ��ȯ
		System.out.println(map.values());
		
		
		// 2. keySet() : ��� Ű�� Set�� ��Ƽ� ��ȯ
		System.out.println(map.keySet());
		Set<String> set1 = map.keySet(); //map�� key���� String���� �߱� ������ String ���׸� ������ ��ȯ�Ѵ�.
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
//			System.out.printf("Ű : %s, �� : %s\n", key, map.get(key));
		}
		
		for(String key : map.keySet()) {
//			System.out.printf("Ű : %s, �� : %s\n", key, map.get(key));
		}
		// 3. entrySet() : ��� entry��ü��(Ű + ���� ��) set�� ��� ��ȯ
		Set<Entry<String, Snack>> set2 = map.entrySet();
		//Entry�� ��� Set�ָӴϿ� �ִµ�, �� Entry�� ������ String,Snack���� �Ǿ��ִ�.
		Iterator<Entry<String,Snack>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<String, Snack> e = it2.next();
//			System.out.printf("Ű : %s, �� : %s\n", e.getKey(), e.getValue());
		}
		
		for(Entry<String, Snack> e : set2) {
//			System.out.printf("Ű : %s, �� : %s\n", e.getKey(), e.getValue());
		}
		
		Map map2 = new TreeMap();
		map2.putAll(map);
//		System.out.println(map2); // key������ ����. StringŬ������ Comparable�� �����Ǿ� �ֱ⶧���� SnackŬ������ CompareTo ���� ���ص� �˾Ƽ� ���ĵȴ�.
	}
	
	public void doProperties() { // Ű�� ���� StringŸ������ ������ Map�÷���
		Properties prop = new Properties();
		
//		prop.put(1, 10);
//		System.out.println(prop);
//		
//		prop.setProperty("1", "10");
//		System.out.println(prop);
		
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		prop.setProperty("ä��", "�Ǹ�");
//		System.out.println(prop);
		
		// getProperty(String key) : key�� ���� value ��ȯ
		System.out.println(prop.getProperty("�λ�"));
		
		// getProperty(String key, String defaultValue) : key���� �ִٸ� value�� ��ȯ�ϰ�, key���� ������ ����defaultValue�� ��ȯ�ض�
		System.out.println(prop.getProperty("�߰�","����"));
		System.out.println(prop.getProperty("ä��","����"));
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
//			System.out.println("�� ����");
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
			
			// store(OutputStream out, String comments) : ����� ������ ����Ʈ ��Ʈ������ ���Ͽ� ��� ����
			// store(Writer writer, String comments) : ����� ������ ���� ��Ʈ������ ���Ͽ� ��� ����
//			prop.store(fos, "Properties Test File");
			
			// storeToXML(OutputStream os , String comment) : ����� ������ ����Ʈ ��Ʈ������ xml�� ��� ����
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
			System.out.println("**** test.properties ���� ���� ****");
			
			Properties prop = new Properties();
			// load(InputStream inStream) : ����Ʈ ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
			// load(Reader reader) : ���� ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
//			prop.load(fis);
			
			// loadFromXML(InputStream in) : ����Ʈ ��Ʈ������ ����� xml������ ������ �о�ͼ� Properties ��ü�� ����
			prop.loadFromXML(fis);
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
