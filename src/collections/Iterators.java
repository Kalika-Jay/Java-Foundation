package collections;

import java.util.Set;
import java.util.HashSet;

public class Iterators {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
