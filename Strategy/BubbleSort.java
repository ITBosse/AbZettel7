package Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BubbleSort {

    private BiFunction<Object, Object, Boolean> comparatorStrategy;

    // (first, second) -> bool
    public BubbleSort(BiFunction<Object, Object, Boolean> comparatorStrategy) {
        this.comparatorStrategy = comparatorStrategy;
    }

    public void setComparatorStrategy(BiFunction<Object, Object, Boolean> comparatorStrategy) {
        this.comparatorStrategy = comparatorStrategy;
    }

    public List<Object> sort(List<Object> inputList) {
        List<Object> a = new ArrayList<>(inputList);
        for (int lastIndex = a.size() - 1; lastIndex >= 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (comparatorStrategy.apply(a.get(i + 1), a.get(i))) {
                    swap(a, i, i + 1);
                }
            }
        }
        return a;
    }

    public void swap(List<Object> a, int i, int j) {
        Object temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }
}
