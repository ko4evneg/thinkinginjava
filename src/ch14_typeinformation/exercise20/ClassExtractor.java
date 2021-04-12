package ch14_typeinformation.exercise20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static thinkinginjava.Utils.print;

public class ClassExtractor {
    private static String className = "ch14_typeinformation.exercise17.ShowMethods";

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName(className);
        for (Constructor constructor : c.getDeclaredConstructors()) {
            print(constructor.toString());
        }
        for (Method method : c.getDeclaredMethods()) {
            print(method);
        }

    }
}
