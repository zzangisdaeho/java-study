package interaction;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d입니다.\n",
				busNumber, passengerCount, money);
	}
}
