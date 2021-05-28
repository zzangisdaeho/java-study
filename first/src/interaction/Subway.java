package interaction;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("%s의 승객은 %d명이고, 수입은  %d입니다.\n",
				lineNumber, passengerCount, money);
	}
		
	
}
