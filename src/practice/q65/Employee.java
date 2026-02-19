package practice.q65;
        //Question 6.5
        //Create an Employee class with:
        //private name
        //private salary
        //private department (enum)
        //Create an array of employees and calculate the average salary.
public class Employee {
    private String name;
    private double salary;
    private Department department;

    public enum Department {
        HR, IT, SALES, MARKETING
    }

    public Employee(String name, double salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
}
