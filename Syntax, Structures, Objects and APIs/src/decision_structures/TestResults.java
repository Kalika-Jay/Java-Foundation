package decision_structures;
import java.util.*;
public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your test score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        input.close();

        char grade;
        if(score>=75){
            grade = 'A';
        }
        else if(score>=65){
            grade = 'B';
        }
        else if(score>=55){
            grade = 'C';
        } else if (score>=35) {
            grade = 'S';
        }else{
            grade = 'F';
        }
        System.out.println("Your grade: "+grade);
    }
}
