package practice.q61;

public class Main {
        //Question 6.1
        //Create a Car class with:
        //private brand
        //private year
        //Add getters and setters.
        //Create an object and print details.
    public static void main(String[] args) {
        Car myCar = new Car();
        // Car is the class
        // myCar is the object (instance o` Car)
        // new Car() creates a new instance of the Car class

        // Set the brand and year using setters
        myCar.setBrand("Toyota");
        myCar.setYear(2020);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
    }
}