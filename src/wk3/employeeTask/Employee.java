package wk3.employeeTask;

public class Employee {

    //Attributes
    private int employeeId;
    private String name;
    private double salary;

    //Employee Assignment
    public Employee(int employeeId, String name, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    //Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}