//Tester 
package AssignmentOne;

public class Tester{
    static void main(String[] args){
        Car[] model = {
            new Car("Toyota"),
            new Car("Sedan"),
            new Car("Honda")
        }; 
        
        Car[] fuelUsed= {
            new Car(8.5),
            new Car(7.2),
            new Car(9.1)
        };

        //Initialize the Car
        Car myCar = new Car(model, fuelUsed);

        //Display results
        System.out.println("Average Fuel Consumption: " + myCar.getAverageFuelConsumption());


    }
}