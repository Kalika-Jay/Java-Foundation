package List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

        list.add(1,"Mango");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        List<String> synchList = Collections.synchronizedList(list);
        System.out.println(synchList);
    }
}
