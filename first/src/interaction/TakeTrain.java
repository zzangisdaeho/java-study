package interaction;

public class TakeTrain {

	public static void main(String[] args) {
		Student James = new Student("james", 5000); // 학생 틀로 James생산
		Student Tomas = new Student("tomas", 10000); // 학생 틀로 Tomas생산
		Student Edward = new Student("edward", 15000); // 학생 틀로 Edward생산
		Bus bus100 = new Bus(100); // 버스 틀로 100번 버스 생산
		Subway subwayGreen = new Subway("subwayGreen"); // 기차 틀로 초록색 기차 생산
		Taxi taxi10 = new Taxi(10); // 택시 틀로 10번 택시 생산
		
		
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
