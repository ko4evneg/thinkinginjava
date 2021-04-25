package ch07_reusingclasses.exercise23;
//Exercise 23: (2) Prove that class loading takes place only once. Prove that loading may be caused by either the
//creation of the first instance of that class or by the access of a static member.


import static ch07_reusingclasses.exercise23.Side.outSide;
import static thinkinginjava.util.Utils.print;

final class Side {
    static {
        print("Side class STATIC init...");
    }
    {
        print("Side class instance init...");
    }
    public Side() {
        print("Side class constructing...");
    }

    static String outSide(){
        print("Side class out()");
        return "Side class out()";
    }
}

class Base {
    static {
        print("Base class STATIC init...");
    }
    {
        print("Base class instance init...");
    }
    public Base() {
        print("Base class constructing...");
    }

    static String outBase(){
        print("Base class out()");
        return "Base class out()";
    }
}

public class Derived extends Base {
    static {
        print("Derived class STATIC init...");
    }

    {
        print("Derived class instance init...");
    }

    static String out(){
        print("Derived class out()");
        return "Derived class out()";
    }

    public Derived() {
        print("Derived class constructing...");
    }

    //Static members initialized on the first static call
    static String str = outSide();
    Side s = new Side();

    public static void main(String[] args) {
        //Constructors work after members initialization
        Derived d = new Derived();
        print("------------");
        Derived dTwo = new Derived();
    }
}
