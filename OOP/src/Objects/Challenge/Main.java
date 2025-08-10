package Objects.Challenge;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "Hokandara",100000,21);
        Employee employee2 = new Employee("Jane Smith", "Colombo", 120000, 25);

        System.out.println(employee2.salary);
        employee2.raiseSalary();
        System.out.println(employee2.salary);

    }

}
