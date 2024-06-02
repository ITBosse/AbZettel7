package Observer;

import java.util.HashMap;
import java.util.Map;

public class PriceList extends Observer {
    private Map<String, Float> priceMap = new HashMap<String, Float>();

    public float getPrice(String itemName) {
        return priceMap.get(itemName);
    }

    public boolean hasItem(String itemName) {
        return priceMap.containsKey(itemName);
    }

    public void addItem(Item item) {
        priceMap.put(item.getName(), item.getPrice());
        item.attach(this);
    }

    @Override
    public void update(ChangeEvent event) {
        if (event instanceof RemoveItemChangeEvent) {
            Item item = event.getItem();
            item.detach(this);
            priceMap.remove(item.getName());
        } else if (event instanceof CHangePriceCHangeEvent) {
            Item item = event.getItem();
            float oldPrice = priceMap.get(item.getName());
            priceMap.replace(item.getName(), oldPrice, item.getPrice());
        }
    }
}
