package practice.q65classes;
        //Question 6.5
        //Create an Employee class with:
        //private name
        //private salary
        //private department (enum)
        //Create an array of employees and calculate the average salary.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 50000, Employee.Department.IT),
                new Employee("Bob", 60000, Employee.Department.HR),
                new Employee("Charlie", 55000, Employee.Department.SALES),
                new Employee("Diana", 70000, Employee.Department.MARKETING)
        };

        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }

        double averageSalary = totalSalary / employees.length;
        System.out.println("Average Salary: " + averageSalary);
    }
}
