package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
	}
	public int printAll() {
		System.out.println(list);
		
//		Iterator<Music> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		return 1;
	}
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	public Music removeMusic(String title) {
		Music n = null;
//		for(Music m : list) {
//			if(m.getTitle().equals(title)) {
//				n = m;
//				list.remove(m);
//			}
//		}
//		return n;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				n=list.get(i);
				list.remove(i);
			}
		}
		return n;
	}
	public Music setMusic(String title, Music music) {
		Music m = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m = list.get(i);
				list.set(i, music);
			}
		}
		return m;
		
	}
	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		return 1;
	}
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
	
}
