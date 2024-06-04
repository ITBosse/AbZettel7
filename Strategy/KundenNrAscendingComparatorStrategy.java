package Strategy;

public class KundenNrAscendingComparatorStrategy implements ComparatorStrategy {

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (first instanceof Kunde f && second instanceof Kunde s) {

            return f.getKundenummer() < s.getKundenummer();
        } else {
            return false;
        }
    }
}
