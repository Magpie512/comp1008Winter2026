package wk3.employeeTask;

public class Company {
    private int numEmployees;
    private Employee[] employees;

    public Company(int numEmployees, Employee[] employees) {
        this.numEmployees = numEmployees;
        this.employees = employees;
    }

    // Method to find the lowest salary
    public double getLowestSalary() {
        if (numEmployees == 0 || employees == null) {
            return 0.0;
        }

        double minSalary = employees[0].getSalary();
        for (int i = 1; i < numEmployees; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    // Method to find the highest salary
    public double getHighestSalary() {
        if (numEmployees == 0 || employees == null) {
            return 0.0;
        }

        double maxSalary = employees[0].getSalary();
        for (int i = 1; i < numEmployees; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }
}