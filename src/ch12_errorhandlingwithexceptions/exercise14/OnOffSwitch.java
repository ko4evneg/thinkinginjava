package ch12_errorhandlingwithexceptions.exercise14;
//Exercise 14: (2) Show that OnOffSwitch.java can fail by throwing a RuntimeException inside the try block.

import static thinkinginjava.util.Utils.print;

class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        print(this);
    }

    public void off() {
        state = false;
        print(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
}

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f()
            throws OnOffException1, OnOffException2 {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
