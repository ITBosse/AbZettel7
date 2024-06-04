package Strategy;

public class IntegerAscendingComparatorStrategy implements ComparatorStrategy {

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (first instanceof Integer f && second instanceof Integer s) {

            return f < s;
        } else {
            return false;
        }
    }
}
