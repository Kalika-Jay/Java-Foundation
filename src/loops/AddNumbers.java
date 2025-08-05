package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int runAgain = 0;
        do{
            System.out.print("Enter the first number: ");
            double firstNumber = input.nextDouble();

            System.out.print("Enter the second number: ");
            double secondNumber = input.nextDouble();

            double total = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + total);;
            System.out.println("Would you like to add another number? 1 for yes and 2 for no");
            runAgain = input.nextInt();

        }while (runAgain == 1);
    }
}
