package ch14_typeinformation.exercise22;

import static thinkinginjava.util.Utils.print;
import java.lang.reflect.*;
import java.util.Date;

//Exercise 22: (3) Modify SimpleDynamicProxy.java so that it measures method-call times.

class DynamicProxyHandler implements InvocationHandler {
		private Object proxied;

		public DynamicProxyHandler(Object proxied) {
				this.proxied = proxied;
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				long time = new Date().getTime();
				System.out.println("**** proxy: " + proxy.getClass() +
								", method: " + method + ", args: " + args);
				if (args != null)
						for (Object arg : args)
								System.out.println(" " + arg);
				Object o = method.invoke(proxied, args);
				print ("Call-time: " + (new Date().getTime() - time));
				return o;
		}
}

public class SimpleDynamicProxy {
		public static void consumer(Interface iface) {
				iface.doSomething();
				iface.doSomething2();
				iface.somethingElse("crap");
		}

		public static void main(String[] args) {
				RealObject real = new RealObject();
				consumer(real);
// Insert a proxy and call again:
				Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
								new Class[]{Interface.class}, new DynamicProxyHandler(real));
				consumer(proxy);
		}
}

interface Interface {
		void doSomething();
		void doSomething2();
		void somethingElse(String arg);
}

class RealObject implements Interface {
		public void doSomething() {
				print("doSomething");
		}

		public void doSomething2() {
				print("doSomething2");
		}

		public void somethingElse(String arg) {
				print("somethingElse " + arg);
		}
}