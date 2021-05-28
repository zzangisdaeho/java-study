package run;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaAOP {

	public Daeho2 authenticateAOP() throws IOException {

		// proxy는 interface로 받아야 한다.
		Daeho2 proxy = (Daeho2) Proxy.newProxyInstance(
				DaehoImpl.class.getClassLoader(), new Class[] { Daeho.class, Daeho2.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						DaehoImpl imp = new DaehoImpl();
						
						System.out.println("===========AOP 시작");
						Object result = method.invoke(imp, args);
						System.out.println("===========AOP 끝");
						
						return result;
					}
				});
		
		return proxy;
		
	}
	
	public static void main(String[] args) {
		JavaAOP aop = new JavaAOP();
		Daeho2 daeho = null;
		try {
			daeho = aop.authenticateAOP();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		daeho.hello();
		daeho.hello2();
	}
}

interface Daeho {
	void hello();
}

interface Daeho2 extends Daeho {
	void hello2();
}

class DaehoImpl implements Daeho2{

	@Override
	public void hello() {
		System.out.println("sayHello");
	}

	@Override
	public void hello2() {
		System.out.println("sayHello2");
	}
	
}


