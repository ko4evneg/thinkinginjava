package ch07_reusingclasses.exercise17;
//Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides new
//definitions using the same method signatures). Note what happens in main( ).

import static thinkinginjava.util.Utils.print;

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

    @Override
    void swim(Amphibian a) {
        print(a.getClass().getSimpleName() + ".crawl() - Frog");
        super.swim(a);
    }

    @Override
    void crawl(Amphibian a) {
        print(a.getClass().getSimpleName() + ".crawl() - Frog");
        super.crawl(a);
    }
}
