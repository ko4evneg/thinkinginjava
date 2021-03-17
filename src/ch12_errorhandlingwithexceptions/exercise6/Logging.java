package ch12_errorhandlingwithexceptions.exercise6;
//Exercise 6: (1) Create two exception classes, each of which performs its own logging automatically. Demonstrate that
//these work.

import java.io.StringWriter;
import java.util.logging.Logger;

public class Logging {
    public static void main(String[] args) {
        try {
            throw new SmallException("The small error");
        } catch (SmallException e) {
        }
        try {
            throw new BigException("The big error");
        } catch (BigException e) {
        }
    }
}

class SmallException extends Exception {
    private Logger logger = Logger.getLogger("Small logger:");
    private StringWriter sWriter = new StringWriter();

    public SmallException(String s) {
        toLog(s);
    }

    public void toLog(String s){
        sWriter.write(s);
        logger.severe(sWriter.toString());
    }
}

class BigException extends Exception {
    private Logger logger = Logger.getLogger("Big logger:");
    private StringWriter sWriter = new StringWriter();

    public BigException(String message) {
        super(message);
        this.sWriter.write(message);
        logger.severe(sWriter.toString());
    }
}