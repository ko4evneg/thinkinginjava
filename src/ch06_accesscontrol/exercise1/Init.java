package ch06_accesscontrol.exercise1;
//Exercise 1: (1) Create a class in a package. Create an instance of your class outside of that package.

import static thinkinginjava.Utils.print;

public class Init {
    public static void main(String[] args) {
        ch06_accesscontrol.exercise1.pkg.Exercise1 ex = new ch06_accesscontrol.exercise1.pkg.Exercise1();
        print(ex);
    }
}
