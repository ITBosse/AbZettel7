package Observer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class test {

    @Test
    public void test1() {
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();

        Item Shokooo = new Item("Milka", 28.0f);
        Item Erdbeeer = new Item("Karl", 5.0f);
        Item Lippenstift = new Item("Sephora", 8.0f);

        shop1.addItem(Shokooo);
        shop1.addItem(Erdbeeer);

        shop2.addItem(Erdbeeer);
        shop2.addItem(Lippenstift);

        assertTrue(shop1.priceList.hasItem(Shokooo.getName()));
        assertTrue(shop1.priceList.hasItem(Erdbeeer.getName()));
        assertTrue(shop2.priceList.hasItem(Erdbeeer.getName()));
        assertTrue(shop2.priceList.hasItem(Lippenstift.getName()));

        Erdbeeer.setPrice(200.0f);

        assertEquals(200.0f, shop1.priceList.getPrice(Erdbeeer.getName()), 0.1);
        assertEquals(200.0f, shop2.priceList.getPrice(Erdbeeer.getName()), 0.1);

    }

}
