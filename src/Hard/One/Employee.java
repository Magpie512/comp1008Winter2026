package Hard.One;

public class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double calculateBonus(){
        return salary * 0.05;
    }
}