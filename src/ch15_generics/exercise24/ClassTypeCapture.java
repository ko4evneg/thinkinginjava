//Exercise 21: (4) Modify ClassTypeCapture.java by adding a Map<String,Class<?>>, a method
//addType(String typename, Class<?> kind), and a method createNew(String typename). createNew( ) will either
//produce a new instance of the class associated with its argument string, or produce an error message.

//Exercise 24: (3) Modify Exercise 21 so that factory objects are held in the Map instead of Class<?>.
package ch15_generics.exercise24;

import java.util.*;

interface Factory<T> {
		T create();
}

public class ClassTypeCapture {
		Map<String, Factory<?>> map = new HashMap<>();


		public void addType(String typename, Factory<?> val) {
				map.put(typename, val);
		}

		public <T> T createNew(String typename) {
				if (map.containsKey(typename)) {
						Factory<?> factory = map.get(typename);
						return (T) factory.create();
				}
				throw new RuntimeException("No such type");
		}

		public static void main(String[] args) {
				ClassTypeCapture ctt = new ClassTypeCapture();
				ctt.addType("string", new Factory<String>() {
						@Override
						public String create() {
								return new String();
						}
				});
				ctt.addType("house", new Factory<House>() {
						@Override
						public House create() {
								return new House();
						}
				});
				Object s = ctt.createNew("string");
				Object h = ctt.createNew("house");
				System.out.println(s instanceof String);
				System.out.println(h instanceof House);
		}
}

class House {

}