package data;

public class WhileCondition {
	public void tryWhile() {
		int num = 1;
		int sum = 0;
		
		while (num<=10) {
			sum +=num;
			num++;
		}
		System.out.print(sum);
	}
	public void tryWhile2() {
		int num = 1;
		int sum = 0;
		
		while (num<=50) {
			sum += num++;
		}
		System.out.print(sum);
	}
	public void doWhile() {
		int num = 1;
		int sum = 0;
		
		do {
			sum = num++;
		} while (num < 1);
		System.out.println(sum); //do를 무조건 한번은 실행하기 때문에 1이 나옴
	}
	
}
