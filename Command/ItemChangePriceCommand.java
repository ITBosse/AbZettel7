package Command;

import Observer.Item;

public class ItemChangePriceCommand extends Command {
    private final Item item;
    private float oldPrice;
    private final float newPrice;

    public ItemChangePriceCommand(Item item, float newPrice) {
        this.item = item;
        this.newPrice = newPrice;
    }

    @Override
    public void execute() {
        oldPrice = item.getPrice();
        item.setPrice(newPrice);
    }

    @Override
    public void undo() {
        item.setPrice(oldPrice);
    }

    @Override
    public void redo() {
        item.setPrice(newPrice);
    }
}
