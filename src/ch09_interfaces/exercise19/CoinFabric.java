package ch09_interfaces.exercise19;

public class CoinFabric implements TossedItemFactory {
    @Override
    public TossedItem getNewTossedItem() {
        return new Coin();
    }
}
