package run;

import callback_interface.CallbackCalc;
import user.User;

public class Run {

	/*
	 * �ݹ� ���� : ���� ����(�������̽� ����ü���� �ҷ��� ���)���� ����. �������̽��� ������ ������ ������ Ŭ���̾�Ʈ�� �����(���ؽ�Ʈ)��
	 * �Ѱ��ִ� ��Ŀ���.. Ŭ���̾�Ʈ�� �����(���ؽ�Ʈ)���� �͸� ���� Ŭ������ ����� �������̽��� ��ü������ �����ؼ� �Ѱ��ִ°�. ���
	 * ����ü���� �̸� ����� ���� �ʿ䰡 ����. �̶� �͸� ���� Ŭ������ �ѱ�� �����.. �ٸ� �ڵ��� �μ��ν� �޼���(Ŭ����)�� �ѱ�°Ͱ�
	 * ���� �ݹ� �����̶�� �θ���.
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
		
		user1.���ϱ�(2);
		user1.���ϱ�(5);
		user1.������(2.5);
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
		
		user2.���ϱ�(2);
		user2.���ϱ�(5);
		user2.������(2.5);
		user2.����(1);
	}

}
