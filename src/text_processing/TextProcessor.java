package text_processing;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Hello World");
        reverseText("hello");
    }

    public static void countWords(String text){
        String [] words = text.split(" ");
        int numberOfWords = words.length;
        System.out.println("The number of words is: " + numberOfWords);
        for(int i=0;i<numberOfWords;i++){
            System.out.println(words[i]);
        }

    }
    public static void reverseText(String text){
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
}
