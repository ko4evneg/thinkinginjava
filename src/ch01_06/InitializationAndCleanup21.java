package ch01_06;
//Exercise 21: (1) Create an enum of the least-valuable six types of paper currency.
//Loop through the values( ) and print each value and its ordinal( ).
public class InitializationAndCleanup21 {
    public enum PaperCurrency {
        RUBLE, BAT, LIRA, YEN, DOLLAR, EURO
    }

    public static void main(String[] args) {
        for (PaperCurrency p : PaperCurrency.values()) {
            System.out.println(p + ", ordinal: " + p.ordinal());
        }

    }
}
