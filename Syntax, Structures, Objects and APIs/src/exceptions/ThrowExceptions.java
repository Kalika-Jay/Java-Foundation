package exceptions;

public class ThrowExceptions {
    public static void main(String[] args) throws NegativeInputException {
        System.out.println(calcullatePay(10,25));
    }
    public static double calcullatePay(double hours,double payRate) throws NegativeInputException {
       if(hours>40){
           throw new IllegalArgumentException("Hours worked cannot be more than 40");
       }
       if(hours<0 || payRate<0){
           throw new NegativeInputException();
       }
       return payRate * hours;
    }
}
