package ch07_ReusingClasses;
//Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default
// constructors. Write a constructor for C and perform all initialization within C’s constructor.
public class Exercise7 {
    public Exercise7 (){
        System.out.println("Exercise 7 start");
    }
    public static void main(String[] args) {
        Exercise7 ex = new Exercise7();
        C c = ex.new C();
    }

    class A {
        private int i;
        A(int i) {
            System.out.println("A i1 = " + this.i);
            this.i = i;
            System.out.println("A constructor!");
            System.out.println("A i2 = " + this.i);

        }
    }

    class B {
        private int i;
        B(int i) {
            System.out.println("B constructor!");
        }
    }

    class C extends A {
        C () {
            super(1);
        }
        private B b = new B(2);
    }
}
