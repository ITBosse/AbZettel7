package Strategy;

public class NamaAscendingComparatorStrategy implements ComparatorStrategy {

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (first instanceof Kunde f && second instanceof Kunde s) {
            return compareStrings(((Kunde) f).getName(), ((Kunde) s).getName());
        }
        return false;
    }

    // ob a<b
    public boolean compareStrings(String a, String b) {
        int result = a.compareTo(b);
        return result < 0;
    }
}
