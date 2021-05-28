package com.kh.test.chap01_Date.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberGenerator {

	private static NumberGenerator one;
	private static String date;
	private static int numbering;
	
	private NumberGenerator() {
		NumberGenerator.date = dateFormat();
		NumberGenerator.numbering = Integer.parseInt(txtReader("numbering.txt"));
	}

	public static NumberGenerator makeGenerator() {
		if(NumberGenerator.one != null) {
			return NumberGenerator.one;
		} else {
			NumberGenerator.one = new NumberGenerator();
			return NumberGenerator.one;
		}
	}
	
	private String dateFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(new Date());
		String checkDay = txtReader("numberingDate.txt");
		
		if(!today.equalsIgnoreCase(checkDay)) {
			System.out.println("======= dateForamt() : Date changed. numbering initializing... ========");
			txtWriter("numberingDate.txt", today);
			NumberGenerator.numbering = 1;
			txtWriter("numbering.txt", (Integer.toString(NumberGenerator.numbering)));
		}
		return today;
	}
	
	public String getNumber(String orgId, String codeMain, String codeSub, String date) {
		if(!NumberGenerator.date.equalsIgnoreCase(date)) {
			System.out.println("======= getNumber() : Date changed. numbering initializing... ========");
			NumberGenerator.date = date;
			txtWriter("numberingDate.txt", date);
			NumberGenerator.numbering = 1;
		}
		String numberFormat = String.format("%09d", NumberGenerator.numbering);
		String result = orgId + codeMain + codeSub + date + numberFormat;
		NumberGenerator.numbering++;
		txtWriter("numbering.txt", (Integer.toString(NumberGenerator.numbering)));
		
		return  result;
	}
	
	private String txtReader(String fileName) {
		String read = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			StringBuffer buffer = new StringBuffer();
			String value = "";
			while((value = br.readLine()) != null) {
				buffer.append(value);
			}
			read = buffer.toString();
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return read;
	}

	private void txtWriter(String fileName, String writeTarget) {
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
			bw.write(writeTarget);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
