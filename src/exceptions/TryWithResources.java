package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        try (Scanner sc = new Scanner(inputFile);) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile.getAbsolutePath());
        } finally {
            // This block is optional and can be used for cleanup if needed
            System.out.println("Finished reading the file.");
        }
    }
}
