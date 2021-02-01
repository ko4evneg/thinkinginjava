package ch02_EverythingIsAnObject.Exercise7;
//Exercise 7: (1) Turn the Incrementable code fragments into a working program.

public class Exercise7 {
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}