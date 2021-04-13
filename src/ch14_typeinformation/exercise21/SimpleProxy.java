package ch14_typeinformation.exercise21;

import java.util.Date;

import static thinkinginjava.Utils.print;
//Exercise 21: (3) Modify SimpleProxyDemo.java so that it measures method-call times.

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

public class SimpleProxy implements Interface {
		private Interface proxied;

		public SimpleProxy(Interface proxied) {
				this.proxied = proxied;
		}

		public void doSomething() {
				long time = new Date().getTime();
				proxied.doSomething();
				try {
						Thread.sleep(10);
				} catch (Exception e) {
				}
				print(new Date().getTime() - time);
		}

		public void somethingElse(String arg) {
				long time = new Date().getTime();
				proxied.somethingElse(arg);
				try {
						Thread.sleep(5);
				} catch (Exception e) {
				}
				print(new Date().getTime() - time);
		}
}

class SimpleProxyDemo {
		public static void consumer(Interface iface) {
				iface.doSomething();
				iface.somethingElse("bonobo");
		}

		public static void main(String[] args) {
				consumer(new RealObject());
				consumer(new SimpleProxy(new RealObject()));
		}
}