package ch09_interfaces.exercise19;

public class DiceFabric implements TossedItemFactory {
    @Override
    public TossedItem getNewTossedItem() {
        return new Dice();
    }
}
