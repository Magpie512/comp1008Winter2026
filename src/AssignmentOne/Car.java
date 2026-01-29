package AssignmentOne;
public class Car {
// Attributes
 private String model;
 private double [] fuelUsed = new double[5];
 private double fuelConsum;

 //Method to calculate average fuel consumption
 public double calculateAverageFuelConsumption() {
    double totalFuel = 0.0;
    for (double fuel : fuelUsed) {
        totalFuel += fuel;
    }
    fuelConsum = totalFuel / fuelUsed.length;
    return fuelConsum;
 }

 //Method to assign Model
 public String setModel(String model){
    this.model = model;
    return model;
 }

 //Method to display car info
 public String displayCarInfo(){
    return "Model: " + model + ", Average Fuel Consumption: " + calculateAverageFuelConsumption();
 }
}
 