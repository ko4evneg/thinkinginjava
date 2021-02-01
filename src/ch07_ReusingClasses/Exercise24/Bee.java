package ch07_ReusingClasses.Exercise24;
//Exercise 24: (2) In Beetle.java, inherit a specific type of beetle from class Beetle,
//following the same format as the existing classes. Trace and explain the output.

public class Bee extends Beetle{
    static int o = printInit("static Bee.o init");
    private int p = printInit("Bee.p initialized");

    Bee () {
        System.out.println("Bee constructor");
    }
}
