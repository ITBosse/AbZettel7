package Observer;

public class RemoveItemChangeEvent extends ChangeEvent {

    public RemoveItemChangeEvent(Item item) {
        super(item);
    }
}
