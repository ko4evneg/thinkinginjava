package thinkinginjava;

import java.io.PrintStream;
import java.util.LinkedList;

public class Utils {
    public static void print (String s) {
        System.out.println(s);
    }

    public static void print () {
        System.out.println();
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
