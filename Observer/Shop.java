package Observer;

public class Shop {

    PriceList priceList = new PriceList();

    public void addItem(Item item) {
        priceList.addItem(item);
    }

    public void changePrice(Item item, Float newPrice) {
        item.setPrice(newPrice);
    }

    public void removeItem(Item item) {
        item.terminate();
    }
}
