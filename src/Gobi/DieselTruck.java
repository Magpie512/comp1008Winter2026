package Gobi;

public class DieselTruck extends DeliveryVehicle implements FuelSystem{

    public DieselTruck(String id, double cargoWeight){
        super(id, cargoWeight);
    }

    @Override
    public void startRoute() {
        System.out.println("DieselTruck "+ ID + " started");
    }

    @Override
    public double calculateETA(double distance) {
        return distance / 40.0; // 40 km/h
    }

    @Override
    public double getMaxRange(){
        return 600.0;
    }

    @Override
    public String getFuelType(){
        return "Diesel";
    }
}
