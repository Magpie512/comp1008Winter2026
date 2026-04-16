package Gobi;

public class Drone extends DeliveryVehicle implements FuelSystem{
    public Drone(String ID, double cargoWeight) {
        super(ID, cargoWeight);
    }

    @Override
    public double calculateETA(double distance) {
        return distance / 100.0; // 100 km/h
    }

    @Override
    public double getMaxRange() {
        return 1000.0; // 1000 km
    }

    @Override
    public String getFuelType() {
        return "Electric";
    }

    @Override
    public void startRoute() {
        System.out.println("Drone " + ID + " started");
    }
}
