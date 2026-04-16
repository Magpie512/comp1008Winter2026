package Gobi;

public class ElectricVan extends DeliveryVehicle implements FuelSystem{
    public ElectricVan(String ID, double cargoWeight) {
        super(ID, cargoWeight);
    }

    @Override
    public void startRoute() {
        System.out.println("ElectricVan " + ID + " started");
    }

    @Override
    public double calculateETA(double distance) {
        return distance / 60.0; // 60 km/h
    }

    @Override
    public String getFuelType(){
        return "Electric";
    }

    @Override
    public double getMaxRange() {
        return 400.0; // 400 km
    }
}
