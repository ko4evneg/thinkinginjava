package ch14_typeinformation.exercise23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

import static thinkinginjava.Utils.print;

//Exercise 23: (3) Inside invoke( ) in SimpleDynamicProxy.java, try to print the proxy argument and explain what happens.

class DynamicProxyHandler implements InvocationHandler {
		private Object proxied;

		public DynamicProxyHandler(Object proxied) {
				this.proxied = proxied;
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("**** proxy: " + proxy.getClass() +
								", method: " + method + ", args: " + args);
				// Recursion, as call through interface is redirected back to proxy
				// print(proxy);
				if (args != null)
						for (Object arg : args)
								System.out.println(" " + arg);
				return method.invoke(proxied, args);
		}
}

public class SimpleDynamicProxy {
		public static void consumer(Interface iface) {
				iface.doSomething();
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