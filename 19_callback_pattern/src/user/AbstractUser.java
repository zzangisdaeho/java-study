package user;

import callback_interface.CallbackCalc;

public abstract class AbstractUser {

	protected CallbackCalc calc;
	
	protected double result = 0;
	
	public void init(double a) {
		this.result = a;
	}
	
	public CallbackCalc getCalc() {
		return calc;
	}

	public void setCalc(CallbackCalc calc) {
		this.calc = calc;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public abstract void ���ϱ�(double a);
	public abstract void ����(double a);
	public abstract void ���ϱ�(double a);
	public abstract void ������(double a);
//	public abstract void �׽�Ʈ(double a);
}
