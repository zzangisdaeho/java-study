package user;

public class User extends AbstractUser {

	public void ���ϱ�(double a) {
		setResult(calc.plus(result, a));
		System.out.println("����� :" + result);
	}
	public void ����(double a) {
		setResult(calc.minus(result, a));
		System.out.println("����� :" + result);
	}
	public void ���ϱ�(double a) {
		setResult(calc.multi(result, a));
		System.out.println("����� :" + result);
	}
	public void ������(double a) {
		setResult(calc.divide(result, a));
		System.out.println("����� :" + result);
	}
}
