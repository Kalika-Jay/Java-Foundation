package Inheritance;

public class Salesperson extends Employee{
    private double commissionPrecentage;
    public Salesperson(String name,double salary,int age,double commissionPrecentage){
        super(name,salary,age);
        this.commissionPrecentage = commissionPrecentage;
    }
    public double getCommissionPrecentage() {
        return commissionPrecentage;
    }
    public void raiseCommission(){
        this.commissionPrecentage = this.commissionPrecentage * 1.1;
    }
}
