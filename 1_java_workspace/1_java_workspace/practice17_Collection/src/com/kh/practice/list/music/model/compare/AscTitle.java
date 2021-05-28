package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		String standard = o1.getTitle();
		String others = o2.getTitle();
		
		return standard.compareTo(others);
	}

}
