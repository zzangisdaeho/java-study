package com.kh.example.chap01_byte.run;

import com.kh.example.chap01_byte.mdel.dao.ByteDAO;

public class Run {

	public static void main(String[] args) {
		ByteDAO b = new ByteDAO();
//		b.fileOpen();
		b.fileSave();
	}

}
