package kh.com.example.practice6.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		this(null,null,null,0,0.0);
	}
	public Book(String title, String publisher, String author) {
		this(title, publisher, author,0,0.0);
	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.printf("title : %s, publisher : %s, author : %s, price : %d, discountRate : %f\n",
				title, publisher, author, price, discountRate);
	}
}
