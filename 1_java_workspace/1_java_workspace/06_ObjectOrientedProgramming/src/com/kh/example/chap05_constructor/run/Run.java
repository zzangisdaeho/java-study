package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.inform();
		
		User user2 = new User("rosemary4110");
		user2.inform();
		
		User user3 = new User("zzangisdaeho", "haha", "±Ë¥Î»£", new Date());
		user3.inform();
	}

}
