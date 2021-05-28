package com.kh.practice.file.controller;

import com.kh.practice.file.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	public void fileSave(String file, StringBuilder sb) {
		String s = sb.toString();
		fd.fileSave(file, s);
		
	}
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
		
	}
	public void fileEdit(String file, StringBuilder sb) {
		String s = sb.toString();
		System.out.println(s);
		fd.fileEdit(file, s);
	}
}
