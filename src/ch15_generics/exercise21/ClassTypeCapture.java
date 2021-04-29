//Exercise 21: (4) Modify ClassTypeCapture.java by adding a Map<String,Class<?>>, a method
//addType(String typename, Class<?> kind), and a method createNew(String typename). createNew( ) will either
//produce a new instance of the class associated with its argument string, or produce an error message.
package ch15_generics.exercise21;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {
		Map<String, Class<?>> map = new HashMap<>();

		public void addType(String typename, Class<?> kind) {
						map.put(typename, kind);
		}

		public T createNew(String typename) {
				if (map.containsKey(typename)) {
						try {
								return (T) map.get(typename).newInstance();
						} catch (InstantiationException e) {
								e.printStackTrace();
						} catch (IllegalAccessException e) {
								e.printStackTrace();
						}
						return null;
				}
				else
						throw new RuntimeException("No such class in the map!");
		}


		public static void main(String[] args) {
				ClassTypeCapture<String> ctt = new ClassTypeCapture<>();
				ctt.addType("string", String.class);
				String s = ctt.createNew("string");
				System.out.println(s instanceof String);
		}
}