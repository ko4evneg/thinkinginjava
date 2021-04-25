package ch12_errorhandlingwithexceptions.exercise7;
//Exercise 3: (1) Write code to generate and catch an ArraylndexOutOfBoundsException.

//Exercise 7: (1) Modify Exercise 3 so that the catch clause logs the results.

import java.util.logging.Logger;

import static thinkinginjava.util.Utils.print;

public class CatchArrayBoundsException {
    private static Logger logger = Logger.getLogger("My logger");

    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Zero";
        strings[1] = "One";
        strings[2] = "Two";
        try {
            print(strings[3] = "Four");}
        catch (ArrayIndexOutOfBoundsException e) {
            print(e);
            logger.severe(e.getMessage());
        }
    }
}
