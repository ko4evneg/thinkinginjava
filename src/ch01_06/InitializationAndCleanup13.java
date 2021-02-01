package ch01_06;

public class InitializationAndCleanup13 {
/*Exercise 13: (1) Verify the statements in the paragraph:

The static initializers for Cups run when either the access of the static object cup1 occurs on the line marked (1),
or if line (1) is commented out and the lines marked (2) are uncommented. If both (1) and (2) are commented out,
the static initialization for Cups never occurs, as you can see from the output. Also, it doesn’t matter if one or
both of the lines marked (2) are uncommented; the static initialization only occurs once.*/

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)
    }
    //static Cups cups1 = new Cups(); // (2)
    //static Cups cups2 = new Cups(); // (2)
}

