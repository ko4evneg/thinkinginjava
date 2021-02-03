package ch05_InitializationAndCleanup.Exercise21;

import static thinkinginjava.Utils.print;

public enum Currency {
    RUBLE, BAT, DONG, YEN, LIRA, FRANK;

    public static void main(String... args) {
        for (Currency c : Currency.values()) {
            print(c + ": " + c.ordinal());
        }
    }
}

