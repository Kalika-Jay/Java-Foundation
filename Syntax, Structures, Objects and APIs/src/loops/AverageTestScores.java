package loops;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numOfStudents = 24;
        int numOfTests = 4;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numOfTests; j++) {
                System.out.print("Enter score for Test "+(j+1)+" :");
                int score = input.nextInt();
                total += score;
            }
            System.out.println("The total score student "+(i+1)+" : " + total);
            System.out.println("The average score of student "+(i+1)+" : " + total/numOfTests);
        }
    }
}
