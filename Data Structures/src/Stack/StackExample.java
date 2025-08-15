package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.push("Apple");
        deque.push("Banana");
        deque.push("Cherry");
        System.out.println(deque);

        System.out.println(deque.peek());
        deque.pop();
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
    }
}
