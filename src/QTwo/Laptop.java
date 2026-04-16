package QTwo;

public class Laptop implements Shippable {
    double insuranceFee = 50;
    double shippingCost;

    public double getShippingCost() {
        return insuranceFee + shippingCost;
    }

    public Laptop(double insuranceFee, double shippingCost) {
        this.insuranceFee = insuranceFee;
        this.shippingCost = shippingCost;
    }
}

