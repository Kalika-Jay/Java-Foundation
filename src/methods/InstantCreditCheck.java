package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        System.out.println("Enter your credit score:");
        int credit = input.nextInt();

        boolean qualified = isUserQualified(credit, salary);
        notifyUser(qualified);
    }

//    public static void isUserQualified(int credirScore, double salary) {
//        double requiredSalary = 25000;
//        int requiredCredit = 700;
//
//        if(credirScore >= requiredCredit && salary >= requiredSalary) {
//            System.out.println("You qualified!");
//        }
//        else {
//            System.out.println("Declined!");
//        }
//    }
    public static boolean isUserQualified(int creditScore, double salary) {
        double requiredSalary = 25000;
        int requiredCredit = 700;

        if(creditScore >= requiredCredit && salary >= requiredSalary) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean qualified) {
        if(qualified) {
            System.out.println("You have qualified");
        }
        else {
            System.out.println("You have not qualified");
        }
    }
}
