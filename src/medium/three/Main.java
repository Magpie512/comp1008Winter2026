package medium.three;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(50000);
        Manager m = new Manager(70000, 10000);

        System.out.println("Employee salary: " + e.calculateSalary());
        System.out.println("Manager salary: " + m.calculateSalary());
    }
}
