package interaction;

public class Taxi {
	int taxiNum;
	int taxiPassengerNum;
	int money;
	
	public Taxi(int taxiNum) {
		this.taxiNum=taxiNum;
	}
	
	public void take(int money) {
		this.money = money;
		taxiPassengerNum++;
	}
	
	public void showInfo() {
		System.out.printf("택스 %d번의 승객은 %d명이고, 수입은 %d입니다.\n",
				taxiNum, taxiPassengerNum, money);
	}
	
	
	
	
}
