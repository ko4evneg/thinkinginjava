package ch10_innerclasses.exercise17;

public class DiceFabric implements TossedItemFactory {
    @Override
    public TossedItem getNewTossedItem() {
        return new Dice();
    }
}
