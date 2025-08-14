package Array;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(weekdays));

        for (String day : weekdays) {
            System.out.println("Week day: " + day);
        }

        for(int i =0;i<weekdays.length;i++){
            System.out.println("Week day: " + weekdays[i].toUpperCase());
        }
    }
}
