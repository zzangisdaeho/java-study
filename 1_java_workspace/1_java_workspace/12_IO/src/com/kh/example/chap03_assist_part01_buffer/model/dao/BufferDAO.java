package com.kh.example.chap03_assist_part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//보조스트림 클래스는 단독으로 객체 생성 불가능
//반드시 기본 스트림 클래스에 대한 객체 레퍼런스 필요

public class BufferDAO {
	public void output() {
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));) {
//			FileWriter fw = new FileWriter("c_buffer.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
		try(FileWriter fw = new FileWriter("c_buffer.txt");
			BufferedWriter bw = new BufferedWriter(fw);){
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void input() {
//		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
		try(BufferedReader br = new BufferedReader(new FileReader("C://Users//user//Documents//Automation Anywhere Files/SystemLog.xml"));) {
			String value = "";
			while((value = br.readLine()) != null) {
				System.out.println(value + "|| 1 buffer ||");
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
