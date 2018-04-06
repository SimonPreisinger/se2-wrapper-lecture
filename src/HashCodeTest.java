import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {
    public static void main(String... args) {
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());

        Set<String> strings = new HashSet<>();
        strings.add("Aa");
        strings.add("BB");

        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
    }
}
