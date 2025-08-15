package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>();

        queue1.offer("Alice");
        queue1.offer("Bob");
        queue1.offer("Charlie");
        System.out.println(queue1);

        System.out.println(queue1.peek());
        queue1.poll();
        System.out.println(queue1);
    }
}
