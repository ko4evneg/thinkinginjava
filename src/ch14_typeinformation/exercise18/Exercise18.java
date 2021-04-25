package ch14_typeinformation.exercise18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static thinkinginjava.util.Utils.print;
//Exercise 18: (1) Make ShowMethods a non-public class and verify that the synthesized default constructor no longer
// shows up in the output.

public class Exercise18 {
    private static class ShowMethods {
        private static String usage =
                "usage:\n" +
                        "ShowMethods qualified.class.name\n" +
                        "To show all methods in class or:\n" +
                        "ShowMethods qualified.class.name word\n" +
                        "To search for methods involving ‘word’";
        private static Pattern p = Pattern.compile("(\\w+\\.)");
        public int test = 3;

        public static void testMethodName() {
        }

        public static void main(String[] args) {
            String className = "ch14_typeinformation.exercise18.Exercise18$ShowMethods";
            String matchedName = "";
            Exercise18.ShowMethods clazz = new Exercise18.ShowMethods();
            int lines = 0;
            try {
                Class<?> c = Class.forName(className);
                Method[] methods = c.getMethods();
                Constructor[] ctors = c.getConstructors();
                Field[] fields = c.getFields();
                if (matchedName.isEmpty()) {
                    for (Method method : methods)
                        print(
                                p.matcher(method.toString()).replaceAll(""));
                    for (Constructor ctor : ctors)
                        print(p.matcher(ctor.toString()).replaceAll(""));
                    lines = methods.length + ctors.length;
                } else {
                    for (Method method : methods)
                        if (method.toString().indexOf(matchedName) != -1) {
                            print(
                                    p.matcher(method.toString()).replaceAll(""));
                            lines++;
                        }
                    for (Constructor ctor : ctors)
                        if (ctor.toString().indexOf(matchedName) != -1) {
                            print(p.matcher(
                                    ctor.toString()).replaceAll(""));
                            lines++;
                        }
                }
            } catch (ClassNotFoundException e) {
                print("No such class: " + e);
            }
        }
    }
}