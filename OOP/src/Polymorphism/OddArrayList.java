package Polymorphism;

import java.util.ArrayList;

public class OddArrayList extends ArrayList<Integer> {
    @Override
    public void add(int index, Integer element) {
        if (element % 2 != 0) { // Check if the element is odd
            super.add(index, element);
        }// Call the superclass method to add the element
    }
}
