package com.kh.example.chap03_assist_part02_to.model.vo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamChangeDAO {
	public void input() {
		try(FileInputStream fis = new FileInputStream("a_byte.txt");
			InputStreamReader isr = new InputStreamReader(fis);) {
			int value;
			while ((value=isr.read()) != -1) {
				System.out.print((char)value + " - ");
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
