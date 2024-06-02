package Observer;

public class Item extends Subject {
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        this.notifyChange(new CHangePriceCHangeEvent(this));
    }

    public void terminate() {
        this.notifyChange(new RemoveItemChangeEvent(this));
    }
}
