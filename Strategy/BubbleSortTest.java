package Strategy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void intBubbleSortTestIntegerAscending() {
        BubbleSort bubbleSort = new BubbleSort(new IntegerAscendingComparatorStrategy()::isFirstBeforeSecond);
        List<Object> a = Arrays.asList(1, 3, 2);
        // List<Object> a = Arrays.asList("1", "3", "2");
        List<Object> sortedList = bubbleSort.sort(a);
        assertEquals(Arrays.asList(1, 2, 3), sortedList);
        bubbleSort.setComparatorStrategy(
                (first, second) -> {
                    int f = (int) first;
                    int s = (int) second;
                    return f > s;
                });
        sortedList = bubbleSort.sort(a);
        assertEquals(Arrays.asList(3, 2, 1), sortedList);
    }

    @Test
    public void intBubbleSortTestKundennummerAscending() {
        BubbleSort bubbleSort = new BubbleSort(new KundenNrAscendingComparatorStrategy()::isFirstBeforeSecond);

        Kunde kunde1 = new Kunde("Name", "AAA", 2);
        Kunde kunde2 = new Kunde("Nama", "BBB", 5);
        Kunde kunde0 = new Kunde("Vase", "KKK", 0);
        List<Object> kunden = Arrays.asList(kunde0, kunde2, kunde1);
        List<Object> kundenSort = Arrays.asList(kunde0, kunde1, kunde2);

        List<Object> sortedList = bubbleSort.sort(kunden);

        assertEquals(kundenSort, sortedList);

    }

    @Test
    public void intBubbleSortTestNameAscending() {
        BubbleSort bubbleSort = new BubbleSort(new NamaAscendingComparatorStrategy()::isFirstBeforeSecond);

        Kunde kunde1 = new Kunde("Name", "AAA", 2);
        Kunde kunde2 = new Kunde("Nama", "BBB", 5);
        Kunde kunde0 = new Kunde("Vase", "KKK", 0);
        List<Object> kunden = Arrays.asList(kunde0, kunde2, kunde1);
        List<Object> kundenSort = Arrays.asList(kunde2, kunde1, kunde0);

        List<Object> sortedList = bubbleSort.sort(kunden);

        assertEquals(kundenSort, sortedList);

    }

    @Test
    public void intBubbleSortTestNachnameAscending() {
        BubbleSort bubbleSort = new BubbleSort(new NachnameAscendingComparatorStrategy()::isFirstBeforeSecond);

        Kunde kunde1 = new Kunde("Name", "AAA", 2);
        Kunde kunde2 = new Kunde("Nama", "BBB", 5);
        Kunde kunde0 = new Kunde("Vase", "KKK", 0);
        List<Object> kunden = Arrays.asList(kunde0, kunde2, kunde1);
        List<Object> kundenSort = Arrays.asList(kunde1, kunde2, kunde0);

        List<Object> sortedList = bubbleSort.sort(kunden);

        assertEquals(kundenSort, sortedList);
    }

    @Test
    public void mitSortKdNr() {

        Kunde kunde1 = new Kunde("Name", "AAA", 2);
        Kunde kunde2 = new Kunde("Nama", "BBB", 5);
        Kunde kunde0 = new Kunde("Vase", "KKK", 0);

        List<Object> kunden = Arrays.asList(kunde0, kunde2, kunde1);

        List<Object> kundenSort = Arrays.asList(kunde0, kunde1, kunde2);

        Collections.sort(kunden, (o1, o2) -> {
            if (o1 instanceof Kunde k1 && o2 instanceof Kunde k2) {
                return k1.getKundenummer() - k2.getKundenummer();
            } else {
                throw new ClassCastException("keine Kunde, böse");
            }
        });

        assertEquals(kundenSort, kunden);
    }
}
