package ch14_typeinformation.exercise25;

import ch14_typeinformation.exercise25.hiddenclass.HiddenMethods;
import java.lang.reflect.Method;
import java.util.Arrays;

//Exercise 25: (2) Create a class containing private, protected and package-access methods. Write code to access these
//methods from outside of the class’s package.

public class Init {
		public static void main(String[] args) {
				HiddenMethods h = new HiddenMethods();
				Class hClass = h.getClass();
				Method[] methods = hClass.getDeclaredMethods();
				Arrays.stream(methods).forEach(m -> {
						m.setAccessible(true);
						try {
								m.invoke(h);
						} catch (Exception e) {
						}
				});

		}
}
