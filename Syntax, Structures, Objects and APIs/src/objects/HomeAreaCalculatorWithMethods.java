package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {
    public static void main(String[] args) {
        Rectangle kitchen =getRoom();
        Rectangle bathroom =getRoom();

        double totalArea = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + totalArea);
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea()+rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the room:");
        double length = input.nextDouble();
        System.out.println("Enter the width of the room:");
        double width = input.nextDouble();
        return new Rectangle(length, width);
    }
}
