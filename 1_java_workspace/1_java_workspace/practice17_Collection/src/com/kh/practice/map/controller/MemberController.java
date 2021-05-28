package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	{
		map.put("rosemary4110", new Member("rosePark0114", "박신우"));
		map.put("healtyKang", new Member("rkdrjsrkd11", "강건강"));
		map.put("teacherRosemary", new Member("rm4110", "박신우"));
		map.put("lalaRyu4", new Member("lala44", "류라라"));
	}
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}
		else {
			map.put(id, m);
			return true;
		}
	}
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.put(id, new Member(newPw, map.get(id).getName()));
			return true;
		}
		else {
			return false;
		}
		
	}
	public void changeName(String id, String newName) {
		map.put(id, new Member(map.get(id).getPassword(), newName));
	}
	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> tMap = new TreeMap<>();
		
		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			if(map.get(key).getName().equals(name)) {
//				tMap.put(key, map.get(key));
//			}
//		}
		
		for (String s : set) {
			if(map.get(s).getName().equals(name)) {
				tMap.put(s, map.get(s));
			}
		}
		
		return tMap;
	}
}
