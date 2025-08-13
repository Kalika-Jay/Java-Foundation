package Inheritance;

public class Analyst extends  Employee {
    public Analyst(String name,double salary,int age) {
        super(name,salary,age);
    }
    public double getAnnualBonus() {
        return getSalary() * 0.1; // 10% of the salary as annual bonus
    }
}
