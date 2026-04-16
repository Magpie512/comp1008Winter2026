package QTwo;

public class Main {
    static void main(String[] args) {
        Shippable[] shipment = {
                new Book(12),
                new Laptop(50, 100)
        };

        for (Shippable item : shipment) {
            System.out.println(item.getShippingCost());
        }
    }
}
