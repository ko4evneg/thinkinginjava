package ch07_ReusingClasses;
//Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).

public class Exercise11 {
    private static String s = "Cleanser";

    public static void main(String[] args) {
        Detergent x = new Exercise11().new Detergent(new Exercise11().new Cleanser());
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        System.out.println(new Exercise11().new Cleanser());
    }

    class Cleanser {

        public void append(String a) {
            s += a;
        }

        public void dilute() {
            append(" dilute()");
        }

        public void apply() {
            append(" apply()");
        }

        public void scrub() {
            append(" scrub()");
        }

        public String toString() {
            return s;
        }

    }

    class Detergent {
        private Cleanser cleanser;
        public Detergent(Cleanser cleanser) {
            this.cleanser = cleanser;
        }

        // Change a method:
        public void scrub() {
            cleanser.append(" Detergent.scrub()");
            cleanser.scrub(); // Call base-class version
        }

        // Add methods to the interface:
        public void foam() {
            cleanser.append(" foam()");
        }
        public void dilute() {
            cleanser.append(" dilute()");
        }

        public void apply() {
            cleanser.append(" apply()");
        }
    }

}