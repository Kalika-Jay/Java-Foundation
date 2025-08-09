package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ForEachWithLambdas {
    public  static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("grape");

        fruits.forEach(f ->System.out.println(f));
        System.out.println("--------------");
        fruits.forEach(System.out::println);
        System.out.println("--------------");
        fruits.forEach(f->{
            f = "Fruit: " + f;
            System.out.println(f);
        });


        Map <String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("banana", 1);
        fruitPrices.put("orange", 2);
        fruitPrices.put("apple", 3);
        fruitPrices.put("grape", 4);

        fruitPrices.forEach((k,v)->{
            System.out.println("Fruit: " + k + ", Price: " + v);
        });
    }
}
