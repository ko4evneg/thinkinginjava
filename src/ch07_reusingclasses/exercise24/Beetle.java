package ch07_reusingclasses.exercise24;
//Exercise 24: (2) In Beetle.java, inherit a specific type of beetle from class Beetle, following the same format as
//the existing classes. Trace and explain the output.

import static thinkinginjava.Utils.print;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}

class Cycad extends Beetle {
    private static int x3 = printInit("static Cycad.x3 initialized");
    private int m = printInit("Cycad.m initialized");

    public static void main(String[] args) {
        print("Cycad constructor");
        Cycad c = new Cycad();
    }
}