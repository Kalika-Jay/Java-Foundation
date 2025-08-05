package methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetings();
    }
    public static void greetings() {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
