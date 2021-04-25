package ch12_errorhandlingwithexceptions.exercise13;
//Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
// call the method but only use a single catch clause that will catch all three types of exceptions.

//Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally clause is executed, even if a
//NullPointerException is thrown.

import static thinkinginjava.util.Utils.print;

public class ThreeExceptions {
    public static void throwAll(int i) throws Exception {
        Integer nullInt = null;
        switch (i) {
            case 0:
                throw new SmlEx();
            case 1:
                throw new MedEx();
            case 2:
                throw new BigEx();
            default:
                nullInt++;
        }
    }

    public static void main (String[]args) throws Exception {
        for (int i = 0; i < 4; i++) {
            try {
                throwAll(i);
            } catch (SmlEx se) {
                print(se);
                throw new SmlEx();
            } catch (MedEx me) {
                print(me);
            } catch (BigEx be) {
                print(be);
            } finally {
                print("Finally block execution...");
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
