package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.set(2, "Mango"); // Replace "Orange" with "Mango"
        fruits.add("Banana");

        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println("First Index of Banana: " + fruits.indexOf("Banana"));
        System.out.println("Last Index of Banana: " + fruits.lastIndexOf("Banana"));
    }
}
