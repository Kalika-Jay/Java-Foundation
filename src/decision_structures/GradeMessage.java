package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner input = new Scanner(System.in);
        String grade = input.next();
        input.close();

//        String message;

//        switch (grade) {
//            case "A":
//                message="Excellent job!!!";
//                break;
//                case "B":
//                    message="Good job!!!";
//                    break;
//                    default:
//                        message="Incorrect grade. Try again";
//                        break;
//        }
//        System.out.println(message);

        String message = switch (grade){
            case "A" -> "Excellent Job!!!";
            case "B" -> "Good Job!";
            default -> "Error!!!";
        };
        System.out.println(message);
    }
}
