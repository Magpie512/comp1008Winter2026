package Hard.One;

public class Main {
    static void main(String[] args) {
        Manager m = new Manager("Bob", 101, 2000);

        Developer d = new Developer("Alice", 202, 8000);

        Employee e = new Employee("Charlie", 303, 7000);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        System.out.println("Developer Bonus: " + d.calculateBonus());
        System.out.println("Employee Bonus: " + e.calculateBonus());

        // Polymorphism Demo
        Employee poly = new Manager("Dana", 404,10000000);
        System.out.println("Polymorphic Bonuserino: " + poly.calculateBonus());
    }
}
