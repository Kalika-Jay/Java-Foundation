package loops;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        boolean letterFound = false;

        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            if(currentLetter=='A'||currentLetter=='a'){
                letterFound = true;
                break;
            }
        }
    }
}
