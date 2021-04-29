//Exercise 22: (6) Use a type tag along with reflection to create a method that uses the argument version of
//newInstance( ) to create an object of a class with a constructor that has arguments.

package ch15_generics.exercise22;

import ch06_accesscontrol.exercise1.Init;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Initializer<T> {
		Class<T> clazz;

		public Initializer(Class<T> clazz) {
				this.clazz = clazz;
		}

		public T newInstance(Object...args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
				Constructor<T> constructor = null;
				List<Class> classArgs = new ArrayList<>();
				for (Object o : args) {
						classArgs.add(o.getClass());
				}
				try {
						constructor = clazz.getConstructor(classArgs.toArray(new Class[]{}));
				} catch (NoSuchMethodException e) {
						System.out.println("No such constructor");
				}
				return constructor.newInstance(args);
		}

		public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
				Initializer<String> initString = new Initializer<>(String.class);
				String s1 = initString.newInstance();
				String s2 = initString.newInstance(new String("da string"));
				System.out.println(s1 + "\n" + s2);
		}
}
