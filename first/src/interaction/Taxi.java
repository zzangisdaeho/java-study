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
		System.out.printf("�ý� %d���� �°��� %d���̰�, ������ %d�Դϴ�.\n",
				taxiNum, taxiPassengerNum, money);
	}
	
	
	
	
}
