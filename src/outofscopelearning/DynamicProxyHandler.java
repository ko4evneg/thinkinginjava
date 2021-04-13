package outofscopelearning;

import java.lang.reflect.*;

import static thinkinginjava.Utils.print;

class DynamicProxyHandler implements InvocationHandler {
		private Object proxied;

		public DynamicProxyHandler(Object proxied) {
				this.proxied = proxied;
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("**** proxy: " + proxy.getClass() +
								", method: " + method + ", args: " + args);
				if (args != null)
						for (Object arg : args)
								System.out.println(" " + arg);
				return method.invoke(proxied, args);
		}
}

class SimpleDynamicProxy {
		public static void consumer(Interface iface) {
				iface.doSomething();
				iface.somethingElse("SHIT");
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

		void somethingElse(String arg);
}

class RealObject implements Interface {
		public void doSomething() {
				print("doSomething");
		}

		public void somethingElse(String arg) {
				print("somethingElse " + arg);
		}
}