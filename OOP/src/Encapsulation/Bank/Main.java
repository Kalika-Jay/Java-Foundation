package Encapsulation.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        account1.withdraw(500.0);
        System.out.println(account1.getBalance());
        account1.deposit(200.0);
        System.out.println(account1.getBalance());

    }
}
