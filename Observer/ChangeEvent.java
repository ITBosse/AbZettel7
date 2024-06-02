package Observer;

public abstract class ChangeEvent {
    private Item item;

    public ChangeEvent(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
