package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int price;
	private Calendar date = Calendar.getInstance();
	private double discount;
	
	public Book() {}
	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
				
//		date = new GregorianCalendar(year, month, day);
//		Long milliseconds = date.getTimeInMillis();
		Date da = new Date(date.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String result = sdf.format(da);
		String print = String.format("%-10s %10s %10d %5s %5.1f", title, author, price, result, discount);
		//�̰� ��� �����ؾ� ��������;
		return print;
	}
	
	
	
	
}
