package thinkinginjava;

import static thinkinginjava.Utils.print;

public class Test {
    private void print(){
        System.out.println("void");
    }
}

class TestTwo {
    public static void main(String[] args) {
        Test t = new Test();
        //Error!
        //t.print();
    }
}

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
                print(s);
        return 47;
    }
}
class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 =
            4;
    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}