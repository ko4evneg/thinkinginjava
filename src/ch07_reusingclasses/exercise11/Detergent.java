package ch07_reusingclasses.exercise11;
//Exercise 11: (3) Modify Detergent.java so that it uses delegation.

import static thinkinginjava.Utils.print;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}

public class Detergent {
    private Cleanser cleanser = new Cleanser();
    // Change a method:
    public void scrub() {
        cleanser.append(" Detergent.scrub()");
        cleanser.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        cleanser.append(" foam()");
    }
    public void dilute() {
        cleanser.dilute();

    }
    public void apply() {
        cleanser.apply();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }


}