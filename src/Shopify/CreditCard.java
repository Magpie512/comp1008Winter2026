package Shopify;

public class CreditCard implements PaymentMethod{
    @Override
    public boolean authorize(double amount) {
        System.out.println("Credit card authorization for: " + amount);
        return true;
    }

    @Override
    public void process(double amount) {
        System.out.println("Credit card processed: " + amount);
    }

    @Override
    public String getName() {
        return "Credit Card";
    }
}
