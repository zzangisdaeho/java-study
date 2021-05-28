package kh.com.example.practice5.model.vo;

public class Lotto {
	private int[] lotto = new int[6];
	
	{
//	for (int i = 0; i< 6; i++) {
//		lotto[i] = (int)(Math.random()*44 + 1);
//		for (int j = 0; j < i; j++) {
//			if (lotto[j] == lotto[i]) {
//				i --;
//			}
//		}
//	}
	int count = 0;
	while (count<6) {
		boolean judge = false;
		int ran = (int)(Math.random()*44 + 1);
		System.out.print(ran + " ");
		for (int i = 0; i < 6; i++) {
			if (lotto[i] == ran) {
				judge = true;
			}
		}
		if (!judge) {
			lotto[count] = ran;
			count++;
		}
//		if (count == 6) {
//			break;
//		}
		
	}
	}
			
	
	public Lotto() {}


	
	public int[] getLotto() {
		return lotto;
	}
	
	public int getLotto1(int a) {
		return lotto[a];
	}

	public void setLotto(int a) {
		lotto[a] =(int)(Math.random()*44 + 1);
	}



	public void information() {
		System.out.println();
		for (int i =0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
}
