package interaction;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //���� Ŭ������ ���� (Bus) bus�� ���������̳� �ٸ� Bus �ν��Ͻ��� ���������� ���� ������. ���⼱ ���Ŀ�
		bus.take(1000);				//Bus bus �� int num �� ������. ���� �޼��� ���� num��  int�ڷ����� ������ �Ǵ� �� ó��  Bus�ڷ����� ������ �Ǵ°�.
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�");
	}
}
