package ch01_06;

//Exercise 12: (4) Create a class called Tank that can be filled and emptied, and has a termination condition that it
// must be empty when the object is cleaned up. Write a finalize( ) that verifies this termination condition. In main( ),
// test the possible scenarios that can occur when your Tank is used.
public class InitializationAndCleanup12 {
    private class Tank {
        boolean filled = false;

        void fill() {
            filled = true;
        }

        void empty() {
            filled = false;
        }

        protected void finalize() {
            if (filled)
                System.out.println("bitching finala");
            else
                System.out.println("la finala");
        }
    }

    public static void main(String[] args) {
        Tank t34 = (new InitializationAndCleanup12()).new Tank();
        t34.fill();
        t34.finalize();
        t34.empty();
        t34.finalize();
    }
}
