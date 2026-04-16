package Gobi;

public abstract class DeliveryVehicle {
    protected String ID;
    protected double cargoWeight;

    public DeliveryVehicle(String ID, double cargoWeight) {
        this.ID = ID;
        this.cargoWeight = cargoWeight;
    }

    public abstract void startRoute();
    public abstract double calculateETA(double distance);

    public String getID(){
        return ID;
    };
    public double getCargoWeight(){
        return cargoWeight;
    };
}
