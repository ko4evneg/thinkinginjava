package ch14_typeinformation.exercise19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static thinkinginjava.Utils.print;

//Exercise 19: (4) In ToyTest.java, use reflection to create a Toy object using the non-default constructor.

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    private int i;
    // Comment out the following default constructor
// to see NoSuchMethodError from (*1*)
    public Toy () {}
    public Toy(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Toy init value: " + i;
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ch14_typeinformation.exercise19.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can’t find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
// Requires default constructor:
            Constructor[] cons = up.getConstructors();
            Object o = cons[1].newInstance(5);
            print(o);
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        } catch (InvocationTargetException e) {
            print("Cannot target");
            System.exit(1);
        }
    }
}