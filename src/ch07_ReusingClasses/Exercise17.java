package ch07_ReusingClasses;

//Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class
// (provides new definitions using the same method signatures). Note what happens in main( ).

public class Exercise17 {
    public static void main(String[] args) {
        Exercise17 ex = new Exercise17();
        Frog frog = ex.new Frog();
        frog.print(frog);
    }

    class Amphibian {
        protected String name;

        void print(Amphibian am) {
            System.out.println("That's amphibia " + am.name);
        }
    }

    class Frog extends Amphibian {
        Frog() {
            super.name = "la frogga";
        }

        @Override
        void print(Amphibian am) {
            System.out.println("That's frog " + am.name);
            super.print(am);
        }
    }
}
