package ch12_errorhandlingwithexceptions.exercise9;
//Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
// call the method but only use a single catch clause that will catch all three types of exceptions.

import static thinkinginjava.Utils.print;

public class ThreeExceptions {
    public static void throwAll(int i) throws Exception {
        switch (i) {
            case 0:
                throw new SmlEx();
            case 1:
                throw new MedEx();
            case 2:
                throw new BigEx();
        }
    }

    public static void main (String[]args) throws Exception {
        for (int i = 0; i < 3; i++) {
            try {
                throwAll(i);
            } catch (SmlEx se) {
                print(se);
            } catch (MedEx me) {
                print(me);
            } catch (BigEx be) {
                print(be);
            }
        }
    }
}

class SmlEx extends Exception {

}

class BigEx extends Exception {

}

class MedEx extends Exception {

}
