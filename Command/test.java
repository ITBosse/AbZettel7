package Command;

import Observer.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class test {

    @Test
    public void testExecute() {
        Invoker invoker = new Invoker();
        Shop shop1 = new Shop();

        Item Erdbeeer = new Item("Karl", 5.0f);

        shop1.addItem(Erdbeeer);

        ItemChangePriceCommand itemChangePriceCommand = new ItemChangePriceCommand(Erdbeeer, 200f);
        invoker.execute(itemChangePriceCommand);
        assertEquals(200.0f, shop1.priceList.getPrice(Erdbeeer.getName()), 0.1);

        ItemChangeNameCommand itemChangeNameCommand = new ItemChangeNameCommand(Erdbeeer, "Erdbär");
        invoker.execute(itemChangeNameCommand);
        assertEquals("Erdbär", Erdbeeer.getName());
    }

    @Test
    public void TestUndoRedo() {
        Invoker invoker = new Invoker();
        Shop shop1 = new Shop();
        Item Erdbeeer = new Item("Karl", 5.0f);
        shop1.addItem(Erdbeeer);

        ItemChangeNameCommand itemChangeNameCommand = new ItemChangeNameCommand(Erdbeeer, "a");
        invoker.execute(itemChangeNameCommand);
        itemChangeNameCommand = new ItemChangeNameCommand(Erdbeeer, "b");
        invoker.execute(itemChangeNameCommand);
        itemChangeNameCommand = new ItemChangeNameCommand(Erdbeeer, "c");
        invoker.execute(itemChangeNameCommand);

        assertEquals("c", Erdbeeer.getName());
        invoker.undo();
        assertEquals("b", Erdbeeer.getName());
        invoker.undo();
        assertEquals("a", Erdbeeer.getName());
        invoker.redo();
        assertEquals("b", Erdbeeer.getName());
        invoker.redo();
        assertEquals("c", Erdbeeer.getName());

        invoker.undo();
        invoker.undo();
        assertEquals("a", Erdbeeer.getName());
        itemChangeNameCommand = new ItemChangeNameCommand(Erdbeeer, "h");
        invoker.execute(itemChangeNameCommand);
        invoker.redo();
        assertEquals("h", Erdbeeer.getName());
        invoker.undo();
        assertEquals("a", Erdbeeer.getName());
        invoker.redo();
        assertEquals("h", Erdbeeer.getName());

    }
}