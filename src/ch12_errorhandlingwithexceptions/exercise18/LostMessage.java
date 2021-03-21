package ch12_errorhandlingwithexceptions.exercise18;
//Exercise 18: (3) Add a second level of exception loss to LostMessage.java so that the HoHumException is itself
//replaced by a third exception.

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}
class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class ExExc extends Exception {
    public String toString() {
        return "Exercise exception";
    }
}
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void exExc() throws ExExc {
        throw new ExExc();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.exExc();
                lm.dispose();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}