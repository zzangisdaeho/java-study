package run;

import callback_interface.CallbackCalc;
import user.User;

public class Run {

	/*
	 * 콜백 패턴 : 전략 패턴(인터페이스 구현체들을 불러와 사용)에서 발전. 인터페이스를 구현한 전략들 가져와 클라이언트가 사용자(컨텍스트)에
	 * 넘겨주는 방식에서.. 클라이언트가 사용자(컨텍스트)에게 익명 내부 클래스를 사용해 인터페이스를 자체적으로 구현해서 넘겨주는것. 고로
	 * 구현체들을 미리 만들어 놓을 필요가 없다. 이때 익명 내부 클래스로 넘기는 방법이.. 다른 코드의 인수로써 메서드(클래스)를 넘기는것과
	 * 같아 콜백 패턴이라고 부른다.
	 */
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setCalc(new CallbackCalc() {
			
			@Override
			public double plus(double a, double b) {
				return a+b;
			}
			
			@Override
			public double multi(double a, double b) {
				return a*b;
			}
			
			@Override
			public double minus(double a, double b) {
				return a/b;
			}
			
			@Override
			public double divide(double a, double b) {
				return a/b;
			}
		});
		
		user1.더하기(2);
		user1.곱하기(5);
		user1.나누기(2.5);
		System.out.println("========================");
		
		
		User user2 = new User();
		user2.setCalc(new CallbackCalc() {
			
			@Override
			public double plus(double a, double b) {
				return a+b+b;
			}
			
			@Override
			public double multi(double a, double b) {
				return a*b*b;
			}
			
			@Override
			public double minus(double a, double b) {
				return a-b-b;
			}
			
			@Override
			public double divide(double a, double b) {
				return a/b/b;
			}
		});
		
		user2.더하기(2);
		user2.곱하기(5);
		user2.나누기(2.5);
		user2.빼기(1);
	}

}
