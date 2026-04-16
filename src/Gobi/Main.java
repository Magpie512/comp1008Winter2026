package Gobi;

public class Main {
    static void main(String[] args) {

        DeliveryVehicle[] fleet = {
            new ElectricVan("EV-01", 300),
            new DieselTruck("DT-88", 1200),
            new Drone("DR-12", 90)
        };
        double distance = 150;

        for (DeliveryVehicle v : fleet){
            v.startRoute();

            FuelSystem fs = (FuelSystem) v;
            System.out.println("Fuel type: " + fs.getFuelType());
            System.out.println("Max range: " + fs.getMaxRange());
            System.out.println("ETA: " + v.calculateETA(distance));
            System.out.println();
        }
    }
}
