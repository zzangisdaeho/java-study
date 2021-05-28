package com.kh.practice.list.library.model.vo;

public class Book implements Comparable{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%s/%s/%s/%d", title, author, category, price);
	}
	@Override
	public int hashCode() {
		final int prime = 31; //31은 컴퓨터가 계산하기 좋은 소수
		int result = 1;
		result = prime * result + ((title == null)? 0 : title.hashCode());
		result = prime * result + ((author == null)? 0 : author.hashCode());
		result = prime * result + ((category == null)? 0 : author.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Book other = (Book)obj;
		if(title == null && other.title != null) return false;
		if(!title.equals(other.title)) return false;
		if(author == null && other.author != null) return false;
		if(!author.equals(other.author)) return false;
		if(category == null && other.author !=null) return false;
		if(!category.equals(other.category)) return false;
		if(price != other.price)return false;
		
		return true;
		
	}
	@Override
	public int compareTo(Object o) {
		String otherTitle =((Book)o).getTitle();
		return title.compareTo(otherTitle);
	}
	
	
}
