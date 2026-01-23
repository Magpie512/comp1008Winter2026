package wk3.employeeTask;

public class Main {
    static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] staff = {
                new Employee(101, "Elowen Shadowstep", 45000.0),
                new Employee(102, "Kaelen Frost", 72000.0),
                new Employee(103, "Thorne Ironfoot", 31000.0)
        };

        // Initialize the Company
        Company myCompany = new Company(staff.length, staff);

        // Display results
        System.out.println("Lowest Salary: " + myCompany.getLowestSalary());
        System.out.println("Highest Salary: " + myCompany.getHighestSalary());
    }
}