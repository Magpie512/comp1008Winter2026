package Shopify;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new RegularCustomer("C001"),
                new TechCustomer("C002")
        };

        for (Customer c : customers) {
            System.out.println("Customer ID: " + c.getID());

            PaymentMethod method = c.getPreferredMethod();
            System.out.println("Preferred Method: " + method.getName());

            method.authorize(100.00);
            method.process(100.00);

            System.out.println();
        }
    }
}
