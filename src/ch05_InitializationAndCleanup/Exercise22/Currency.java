package ch05_InitializationAndCleanup.Exercise22;
//Exercise 22: (2) Write a switch statement for the enum in the previous example.
//For each case, output a description of that particular currency.
import static thinkinginjava.Utils.print;

public enum Currency {
    RUBLE, BAT, DONG, YEN, LIRA, FRANK;
    static Currency cur;

    public static void main(String... args) {
        cur = Currency.LIRA;

        switch (cur) {
            case BAT:
                print("This is Thai Bat.");
                break;
            case YEN:
                print("This is Japanese Yen.");
                break;
            case LIRA:
                print("This is Turkish Lira.");
                break;
            case RUBLE:
                print("This is Russian Ruble.");
                break;
            case DONG:
                print("This is Vietnamese Dong.");
                break;
            case FRANK:
                print("This is Swiss Frank.");
                break;
        }
    }
}

