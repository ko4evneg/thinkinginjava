package ch12_errorhandlingwithexceptions.exercise10;
//Exercise 10: (2) Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you
//define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second
//type that you define). Test your code in main( ).

public class ChainedException {
    public static void f() throws OuterException{
        try {
            g();
        } catch (InnerException e) {
            throw new OuterException(e);
        }
    }

    public static void g() throws InnerException {
        throw new InnerException();
    }

    public static void main(String[] args) throws Exception{
        f();
    }
}

class InnerException extends Exception {
}

class OuterException extends Exception {
    public OuterException(Throwable cause) {
        super(cause);
    }
}