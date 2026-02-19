package practice.q11;
        //Question 11.5
        //Create a simple Person class with: name, age
        //Write JUnit tests to verify:
        //The constructor sets values correctly
        //Getters return the correct values
public class q115 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName()); // Should print "Alice"
        System.out.println("Age: " + person.getAge()); // Should print 30
    }
}
