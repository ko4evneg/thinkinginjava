package ch12_errorhandlingwithexceptions.exercise27;
//Exercise 3: (1) Write code to generate and catch an ArraylndexOutOfBoundsException.

//Exercise 27: (1) Modify Exercise 3 to convert the exception to a RuntimeException.

import static thinkinginjava.Utils.print;

public class CatchArrayBoundsException {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Zero";
        strings[1] = "One";
        strings[2] = "Two";
        try {
            print(strings[3] = "Four");}
        catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
