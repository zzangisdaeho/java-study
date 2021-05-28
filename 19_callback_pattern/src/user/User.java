package user;

public class User extends AbstractUser {

	public void 더하기(double a) {
		setResult(calc.plus(result, a));
		System.out.println("결과값 :" + result);
	}
	public void 빼기(double a) {
		setResult(calc.minus(result, a));
		System.out.println("결과값 :" + result);
	}
	public void 곱하기(double a) {
		setResult(calc.multi(result, a));
		System.out.println("결과값 :" + result);
	}
	public void 나누기(double a) {
		setResult(calc.divide(result, a));
		System.out.println("결과값 :" + result);
	}
}
