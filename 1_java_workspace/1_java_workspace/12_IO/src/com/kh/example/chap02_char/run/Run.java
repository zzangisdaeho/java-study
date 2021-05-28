package com.kh.example.chap02_char.run;

import com.kh.example.chap02_char.model.dao.CharDAO;

public class Run {

	public static void main(String[] args) {
		CharDAO c = new CharDAO();
//		c.fileSave();
		c.fileOpen();
	}

}
