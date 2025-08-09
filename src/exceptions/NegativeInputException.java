package exceptions;

public class NegativeInputException extends  Exception {
    public NegativeInputException() {
        this("Input cannot be negative.");
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
