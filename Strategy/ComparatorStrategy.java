package Strategy;

@FunctionalInterface
public interface ComparatorStrategy {
    boolean isFirstBeforeSecond(Object first, Object second);
}
