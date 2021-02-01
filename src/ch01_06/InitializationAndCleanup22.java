package ch01_06;
//Exercise 22: (2) Write a switch statement for the enum in the previous example.
//For each case, output a description of that particular currency.
public class InitializationAndCleanup22 {
    public enum PaperCurrency {
        RUBLE, BAT, LIRA, YEN, DOLLAR, EURO
    }

    public static void main(String...args) {
        PaperCurrency paperCurrency;
        paperCurrency = PaperCurrency.BAT;
        switch (paperCurrency) {
            case RUBLE:
                System.out.println("Rub");
                break;
            case BAT:
                System.out.println("Bat");
                break;
            case LIRA:
                System.out.println("Lr");
                break;
            case YEN:
                System.out.println("Yen");
                break;
            case DOLLAR:
                System.out.println("USD");
                break;
            case EURO:
                System.out.println("Eur");
                break;
        }
    }
}
