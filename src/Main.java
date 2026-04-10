public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Janice", 1000);

        Employee m = new Manager("Bob", 10000, "IT");

        System.out.println(e);
        System.out.println(m);
    }
}
