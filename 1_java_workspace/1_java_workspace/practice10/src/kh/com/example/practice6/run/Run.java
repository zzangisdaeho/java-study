package kh.com.example.practice6.run;

import kh.com.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book a = new Book();
		a.inform();
		Book b = new Book("������","���߻�","����");
		b.inform();
		Book c = new Book("������","���߻�","����",10000,20);
		c.inform();
	}

}
