package ch14_typeinformation.exercise20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static thinkinginjava.Utils.print;
import static thinkinginjava.Utils.printf;
//Exercise 20: (5) Look up the interface for java.lang.Class in the JDK documentation from http://java.sun.com. Write
//a program that takes the name of a class as a command-line argument, then uses the Class methods to dump all the
//information available for that class. Test your program with a standard library class and a class you create.

public class ClassExtractor {
		private static String className = "ch14_typeinformation.exercise17.ShowMethods";

		public static void main(String[] args) throws ClassNotFoundException {
				Class c = Class.forName(className);
				StringBuilder classesString = new StringBuilder(""),
								dClassesString = new StringBuilder(""),
								constructorsString = new StringBuilder(""),
								dConstructorsString = new StringBuilder(""),
								methodsString = new StringBuilder(""),
								dMethodsString = new StringBuilder(""),
								fieldsString = new StringBuilder(""),
								dFieldsString = new StringBuilder("");


				Arrays.stream(c.getClasses()).forEach(str -> classesString.append(str + "\n"));
				Arrays.stream(c.getDeclaredClasses()).forEach(str -> dClassesString.append(str + "\n"));
				Arrays.stream(c.getDeclaredConstructors()).forEach(str -> dConstructorsString.append(str + "\n"));
				Arrays.stream(c.getConstructors()).forEach(str -> constructorsString.append(str + "\n"));
				Arrays.stream(c.getMethods()).forEach(str -> methodsString.append(str + "\n"));
				Arrays.stream(c.getDeclaredMethods()).forEach(str -> dMethodsString.append(str + "\n"));
				Arrays.stream(c.getFields()).forEach(str -> fieldsString.append(str + "\n"));
				Arrays.stream(c.getDeclaredFields()).forEach(str -> dFieldsString.append(str + "\n"));

				printf("descriptorString(): %s\ngetCanonicalName(): %s\ngetClasses(): \n%sgetDeclaredClasses(): \n%s" +
												"getConstructors(): \n%sgetDeclaredConstructors(): \n%sgetMethods(): \n%sgetDeclaredMethods(): \n%s" +
												"getFields(): \n%sgetDeclaredFields(): \n%s",
								c.descriptorString(), c.getCanonicalName(), classesString, dClassesString,
								constructorsString, dConstructorsString, methodsString, dMethodsString,
								fieldsString, dFieldsString);


		}
}
