package ch05_initializationandcleanup.exercise21;

import static thinkinginjava.util.Utils.print;

public enum Currency {
    RUBLE, BAT, DONG, YEN, LIRA, FRANK;

    public static void main(String... args) {
        for (Currency c : Currency.values()) {
            print(c + ": " + c.ordinal());
        }
    }
}

