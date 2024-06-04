package Visitor;

public class TestCompareTo {

    public static void compareStrings(String str1, String str2) {
        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " kommt vor " + str2);
        } else if (result > 0) {
            System.out.println(str2 + " kommt vor " + str1);
        } else {
            System.out.println(str1 + " und " + str2 + " sind gleich");
        }
    }

    public static void main(String[] args) {
        compareStrings("ABB", "AAA");
        compareStrings("PPPPP", "AAAAAAAAA");
    }
}
