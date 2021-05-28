package interaction;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //버스 클래스와 연결 (Bus) bus는 참조변수이나 다른 Bus 인스턴스의 참조변수로 가변 가능함. 여기선 계산식용
		bus.take(1000);				//Bus bus 는 int num 과 같은것. 추후 메서드 사용시 num에  int자료형을 넣으면 되는 것 처럼  Bus자료형을 넣으면 되는것.
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
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다");
	}
}
