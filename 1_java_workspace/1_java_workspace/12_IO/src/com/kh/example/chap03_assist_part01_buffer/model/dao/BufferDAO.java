package com.kh.example.chap03_assist_part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//������Ʈ�� Ŭ������ �ܵ����� ��ü ���� �Ұ���
//�ݵ�� �⺻ ��Ʈ�� Ŭ������ ���� ��ü ���۷��� �ʿ�

public class BufferDAO {
	public void output() {
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));) {
//			FileWriter fw = new FileWriter("c_buffer.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
		try(FileWriter fw = new FileWriter("c_buffer.txt");
			BufferedWriter bw = new BufferedWriter(fw);){
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			bw.write("����������\n");
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
