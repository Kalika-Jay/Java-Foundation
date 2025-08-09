package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("Banana", 105);
        fruitCalories.put("Orange", 62);
        fruitCalories.put("Grapes", 62);
        fruitCalories.put("Orange", 80); // Overwrites the previous value for Orange
        fruitCalories.putIfAbsent("Orange", 55); // This will not change the value since "Orange" already exists

        System.out.println(fruitCalories);
        System.out.println("Calories in Banana: " + fruitCalories.get("Banana"));
    }
}
