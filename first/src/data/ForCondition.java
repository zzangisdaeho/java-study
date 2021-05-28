package data;

public class ForCondition {
	public void tryFor() {
		int num;
		for(num=1;num<=5;++num) {
			System.out.println(num);
		}
	}
	public void tryFor2() {
		int i;
		int sum;
		for (i=1, sum=0; i<=10; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
	public void tryFor3() {
		int num;
		for (num = 1; num <= 10; num+=1) {
			System.out.println("¾È³çÇÏ¼¼¿ä"+num);
		}
	}
	public void tryFor4() {
		int dan;
		int times;
		for (dan =2 ; dan <=9; dan++) {
			for (times = 1; times<=9; times++) {
				System.out.println(dan + " X " + times + " = " + (dan * times));
			}
			System.out.println();
		}
		
	}
	public void tryFor5() {
		int total = 0;
		int num = 1;
		
		for (;num<=100;num++) {
			if (num%2 == 0) {
				 continue;
			}
				 total += num;
		}
		System.out.println(total);
	}
	public void tryFor6() {
		int total = 0;
		int num =1;
		
		for (;num<=100;num++) {
			if (num%2 == 1) {
				 total+=num;
			}
		}
		System.out.println(total);
	}
	public void tryFor7() {
		int num = 1;
		
		for(;num<=100;num++) {
			if (num%3 == 0) {
				System.out.println(num);
			}
		}
	}
}
