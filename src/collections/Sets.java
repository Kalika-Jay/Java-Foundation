package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("Have orange? " + fruits.contains("Orange"));

        fruits.remove("Orange");
        System.out.println("Number of fruits left :"+fruits.size());

        Set moreFruit = Set.of("Pear","Grapes","Mango");
        moreFruit.add("Cranberry");
        moreFruit.remove("Pear");
        System.out.println(moreFruit);
    }

}
