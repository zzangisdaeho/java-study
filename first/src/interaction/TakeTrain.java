package interaction;

public class TakeTrain {

	public static void main(String[] args) {
		Student James = new Student("james", 5000); // �л� Ʋ�� James����
		Student Tomas = new Student("tomas", 10000); // �л� Ʋ�� Tomas����
		Student Edward = new Student("edward", 15000); // �л� Ʋ�� Edward����
		Bus bus100 = new Bus(100); // ���� Ʋ�� 100�� ���� ����
		Subway subwayGreen = new Subway("subwayGreen"); // ���� Ʋ�� �ʷϻ� ���� ����
		Taxi taxi10 = new Taxi(10); // �ý� Ʋ�� 10�� �ý� ����
		
		
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Tomas.takeSubway(subwayGreen);
		Tomas.showInfo();
		subwayGreen.showInfo();
		
		Edward.takeTaxi(taxi10);
		Edward.showInfo();
		taxi10.showInfo();
		
	}

}
