package ch09_interfaces.exercise19;
//Exercise 19: (3) Create a framework using Factory Methods that performs both coin tossing and dice tossing.

public class Exercise19 {
    public static void toss(TossedItemFactory factory) {
        TossedItem item = factory.getNewTossedItem();
        item.toss();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            toss(new CoinFabric());
            toss(new DiceFabric());
        }
    }
}
