package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		// '파일'에 '문자'를 저장하기
		try (FileWriter fw = new FileWriter("b_char.txt");){
			// 파일이 존재하지 않으면 파일 자동 생성
			
			fw.write("와 ~ IO 진짜 재밌잖아?!");
			fw.write('A');
			fw.write(' ');
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen(){
		try(FileReader fr = new FileReader("b_char.txt");){
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
