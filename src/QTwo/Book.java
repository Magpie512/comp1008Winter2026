package QTwo;

public class Book implements Shippable{
    double weight = 1.5;
    double shippingCost;

    public double getShippingCost() {
        return weight * 1.5;
    }

    public Book(double weight) {
        this.weight = weight;
        getShippingCost();
    }
}