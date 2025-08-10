package Encapsulation.Bank;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public double withdraw(double amount){
        if(amount <=balance){
            balance -= amount;
            return amount;
        } else {
            System.out.println("Insufficient funds");
            return 0;
        }
    }
    public double deposit(double amount){
        if(amount>0){
            balance += amount;
            return amount;
        } else {
            System.out.println("Deposit amount must be positive");
            return 0;
        }
    }
}


