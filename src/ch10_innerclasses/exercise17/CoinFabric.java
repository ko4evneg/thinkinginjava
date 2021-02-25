package ch10_innerclasses.exercise17;

public class CoinFabric implements TossedItemFactory {
    @Override
    public TossedItem getNewTossedItem() {
        return new Coin();
    }
}
