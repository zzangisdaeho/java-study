package com.kh.example.chap03_assist_part03_object.run;

import com.kh.example.chap03_assist_part03_object.model.DAO.ObjectDAO;

public class Run {

	public static void main(String[] args) {
		ObjectDAO odao = new ObjectDAO();
//		odao.fileSave();
		odao.fileOpen();
	}

}
