package exceptions;

public class RethrowingExceptions {
    public static void main(String[] args) {

    }

    public static void rethrowException() throws Exception {
        try {
            throw new Exception("Original Exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e; // Rethrowing the caught exception
        }
    }
}
