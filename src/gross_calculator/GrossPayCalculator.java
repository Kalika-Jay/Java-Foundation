package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner input = new Scanner(System.in);
        hours = input.nextInt();

        double pay_rate = 0;
        System.out.println("What is your pay rate?");
        pay_rate = input.nextDouble();

        input.close();

        double grossPay = hours * pay_rate;
        System.out.println("Gross pay: "+grossPay);
    }
}
