package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	{
		lottery.add(new Lottery("�ڽſ�", "01011112222"));
		lottery.add(new Lottery("�ۼ���", "01022223333"));
		lottery.add(new Lottery("���̹�", "01033334444"));
		lottery.add(new Lottery("���ǰ�", "01044445555"));
		lottery.add(new Lottery("������", "01055556666"));
		lottery.add(new Lottery("�����", "01066667777"));
		System.out.println(lottery);
	}
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	public boolean deleteObject(Lottery l) {
		win.remove(l);
		return lottery.remove(l);
	}
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<Lottery>();
		list.addAll(lottery);
		
		while(win.size() < 4) {
			int ran = (int)(Math.random()*(lottery.size()));
			System.out.println(ran);
			win.add(list.get(ran));
//			win.add(list.get((int)Math.random()*lottery.size()));
//			System.out.println(win);
		}
		return win;
	}
	public TreeSet<Lottery> sortedWinObject(){
		TreeSet<Lottery> ts = new TreeSet<Lottery>(new SortedLottery());
		ts.addAll(win);
		return ts;
		
	}
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
