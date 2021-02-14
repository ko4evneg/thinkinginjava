package ch07_reusingclasses.exercise16;
//Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog. Put appropriate methods in
//the base class. In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.

import static thinkinginjava.Utils.print;

class Amphibian {
    void swim(Amphibian a) {
        print(a.getClass().getSimpleName() + ".swim() - Amphibian");
    }

    void crawl(Amphibian a) {
        print(a.getClass().getSimpleName() + ".crawl() - Amphibian");
    }
}

public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        new Frog().swim(frog);
        new Frog().crawl(frog);
    }
}
