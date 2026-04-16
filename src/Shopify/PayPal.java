package Shopify;

public class PayPal implements PaymentMethod{
    @Override
    public boolean authorize(double amount) {
        System.out.println("PayPal authorization for: " + amount);
        return true;
    }

    @Override
    public void process(double amount) {
        System.out.println("PayPal processed: " + amount);
    }

    @Override
    public String getName() {
        return "PayPal";
    }
}
