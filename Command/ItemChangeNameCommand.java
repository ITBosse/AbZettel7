package Command;

import Observer.Item;

public class ItemChangeNameCommand extends Command{
    private final Item item;
    private String oldName;
    private final String newName;

    public ItemChangeNameCommand(Item item, String newName) {
        this.item = item;
        this.newName = newName;
    }

    @Override
    public void execute() {
        oldName = item.getName();
        item.setName(newName);
    }

    @Override
    public void undo() {
        item.setName(oldName);
    }

    @Override
    public void redo() {
        item.setName(newName);
    }
}
