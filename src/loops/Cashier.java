package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Please enter the number of items you would like to buy:");
        Scanner input = new Scanner(System.in);
        int items = input.nextInt();

        double total = 0;
        for(int i=0;i<items;i++){
            System.out.println("Enter the cost of the item: ");
            double cost = input.nextDouble();
            total += cost;
        }
        System.out.println("The total price is " + total);
    }
}
