package ch10_innerclasses.exercise17;
//Exercise 19: (3) Create a framework using Factory Methods that performs both coin tossing and dice tossing.

//Exercise 17: (1) Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes.

public class Exercise17 {
    public static void toss(TossedItemFactory factory) {
        TossedItem item = factory.getNewTossedItem();
        item.toss();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
        toss(new TossedItemFactory() {
                @Override
                public TossedItem getNewTossedItem() {
                    return new Coin();
                }
            });
            toss(new TossedItemFactory() {
                @Override
                public TossedItem getNewTossedItem() {
                    return new Dice();
                }
            });
        }
    }
}
