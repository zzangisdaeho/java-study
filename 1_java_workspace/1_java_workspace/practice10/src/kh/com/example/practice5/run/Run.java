package kh.com.example.practice5.run;

import kh.com.example.practice5.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		Lotto a = new Lotto();
		a.information();
		System.out.println();
//		System.out.println(a.getLotto1(0));
//		System.out.println(a.getLotto1(1));
//		System.out.println(a.getLotto1(2));
//		System.out.println(a.getLotto1(3));
//		System.out.println(a.getLotto1(4));
//		System.out.println(a.getLotto1(5));
		for (int i = 0; i<6; i++) {
			System.out.print(a.getLotto1(i) + " ");
			
			
			
			
		}
		System.out.println(a.getLotto());
	}

}
