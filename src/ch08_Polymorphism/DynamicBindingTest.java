package ch08_Polymorphism;

public class DynamicBindingTest {
    public static void main(String[] args) {
        Test child = new Test();
        DynamicBindingTest parent = new Test();
        System.out.println("PARENT CLASS CALL\n------------------------------------------");

        System.out.println("Child/Child");
        child.dynPrint();
        child.print();
        child.print(1);
        //child.printPrivate();
        child.printStatic();

        System.out.println("Parent/Child");
        parent.dynPrint();
        parent.print();
        parent.print(1);
        parent.printPrivate();
        parent.printStatic();
        parent.printFinal();

        Test.main(null);
    }

    //private (final)
    private void printPrivate () {
        System.out.println("Parent: print private");
    }

    //static
    static void printStatic () {
        System.out.println("Parent: print static");
    }

    //final
    final public void printFinal () {
        System.out.println("Parent: print final");
    }

    //overloaded
    public void print () {
        System.out.println("Parent: print overloaded");
    }

    public void print (int i) {
        System.out.println("Parent: print overloaded int");
    }

    //Dynamic binding

    public void dynPrint () {
        System.out.println("Parent: dynamic print");
    }
}

class Test extends DynamicBindingTest {
    public static void main(String[] args) {
        Test child = new Test();
        DynamicBindingTest parent = new Test();
        System.out.println("TEST CLASS CALL\n------------------------------------------");

        System.out.println("Child/Child");
        child.dynPrint();
        child.print();
        child.print(1);
        child.printPrivate();
        child.printStatic();

        System.out.println("Parent/Child");
        parent.dynPrint();
        parent.print();
        parent.print(1);
        //parent.printPrivate();
        parent.printStatic();
        parent.printFinal();
    }

    @Override
    public void print() {
        System.out.println("Child: print overloaded");
    }

    @Override
    public void print(int i) {
        System.out.println("Child: print overloaded int");
    }

    @Override
    public void dynPrint() {
        System.out.println("Child: dynamic print");
    }

    //brand new method
    //@Override - not working
    private void printPrivate () {
        System.out.println("Child: print private");
    }

    //brand new method
    //@Override - not working
    static void printStatic () {
        System.out.println("Child: print static");
    }

    //brand new method - can't override explicit final
    //even can't compile

//    public void printFinal () {
//        System.out.println("Child: print final");
//    }
}

