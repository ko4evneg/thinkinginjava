package ch14_typeinformation.exercise17;

import java.lang.reflect.*;
import java.util.regex.Pattern;
import static thinkinginjava.util.Utils.print;
//Exercise 17: (2) Modify the regular expression in ShowMethods.java to additionally strip off the keywords
//native and final (hint: use the OR operator’|’)-

public class ShowMethods {
    private ShowMethods(int i){}
    ShowMethods(){}
    private static String usage =
            "usage:\n" +
                    "ShowMethods qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving ‘word’";
    private static Pattern p = Pattern.compile("((\\w+\\.)|native |final )");
    public int test = 3;
    public static void testMethodName(){}
    public static void main(String[] args) {
        String className = "ch14_typeinformation.exercise17.ShowMethods";
        String matchedName = "";
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