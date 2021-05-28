package run;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TwiceAOP {

	public static void main(String[] args) {
		Twice twice = new TwiceImpl();
		Class<? extends Twice> twiceGetClass = twice.getClass();
		Twice twiceProxy = (Twice) Proxy.newProxyInstance(
		        twiceGetClass.getClassLoader(),
		        twiceGetClass.getInterfaces(),
		        new JavaProxyHandler(twice));
		System.out.println(twiceProxy.twice(5));
		
		Twice2 twice2 = new TwiceImpl();
		Class<? extends Twice> twiceGetClass2 = twice2.getClass();
		Twice2 twiceProxy2 = (Twice2) Proxy.newProxyInstance(
				twiceGetClass2.getClassLoader(),
				twiceGetClass2.getInterfaces(),
				new JavaProxyHandler(twice2));
		System.out.println(twiceProxy2.twice(5));
		System.out.println(twiceProxy2.twice2(5));
	}
}

class TwiceImpl implements Twice2 {

    @Override
    public int twice(int x) {
        return x * 2;
    }

	@Override
	public int twice2(int x) {
		return x * 3;
	}
}

interface Twice {
    int twice(int x);
}
interface Twice2 extends Twice {
	int twice2(int x);
}

class JavaProxyHandler implements InvocationHandler {
    private Object target;

    public JavaProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("메소드 호출 전");
        int result = (int) method.invoke(target, args);
        System.out.println("메소드 호출 후");
        return result;
    }

}
