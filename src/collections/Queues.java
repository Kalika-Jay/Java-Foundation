package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println(fruits);
        fruits.remove();
        System.out.println(fruits);

        System.out.println(fruits.peek());
    }
}
