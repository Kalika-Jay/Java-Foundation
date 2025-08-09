package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch(Exception e){
            System.out.println("Sorry an error occurred while creating the file : "+e.getMessage());
            e.printStackTrace();
        }
    }
}
