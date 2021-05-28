package kh.com.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		pName = "Ä­ÃÝ";
		price = 1000;
		brand = "ÇØÅÂ";
	}
	
	
	public void information() {
		System.out.printf("name : %s, price : %d, brand : %s\n"
				,pName,price,brand);
	}
}
