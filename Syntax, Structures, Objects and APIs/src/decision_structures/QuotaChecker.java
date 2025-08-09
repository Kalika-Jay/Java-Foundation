package decision_structures;

import java.util.*;

public class QuotaChecker {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();

        if(sales>quota){
            System.out.println("Congrats! You have met your quota.");
        }
        else {
            int shortSales = quota - sales;
            System.out.println("Sorry, you have not met your quota. You are "+shortSales+" sales short.");
        }
    }
}
