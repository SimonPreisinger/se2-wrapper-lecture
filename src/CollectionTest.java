import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionTest {
    public static void main (String... args){
        // different speeds
        // Collection<Integer> integers = new ArrayList<>();
         Collection<Integer> integers = new LinkedList<>();
        // Collection<Integer> integers = new HashSet<>();
        // Collection<Integer> integers = new TreeSet<>();

        for (int i = 1; i < 1_000_000; i++) {
            integers.add(i);
        }
        for (int i = 1; i < 1_000_000; i+=2){
            integers.remove(i);
        }
        System.out.println(integers.size());
    }
}
