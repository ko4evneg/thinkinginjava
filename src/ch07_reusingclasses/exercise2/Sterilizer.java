package ch07_reusingclasses.exercise2;
//Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).

public class Sterilizer extends Detergent{
    @Override
    public void scrub() {
        append("Sterilizer.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" Sterilize");
    }

    public static void main(String[] args) {
        Sterilizer sterilizer = new Sterilizer();
        sterilizer.scrub();
        sterilizer.sterilize();
        System.out.println(sterilizer);
    }
}
