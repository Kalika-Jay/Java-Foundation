package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(300);
        set.add(47);
        set.add(6);

        System.out.println(set);
        set.add(6);
        System.out.println(set);

        Set<String> stringSet = new TreeSet<>(Comparator.comparing(String::length));
        stringSet.add("Tiger");
        stringSet.add("Lion");
        stringSet.add("Elephant");

        System.out.println(stringSet);
    }
}
