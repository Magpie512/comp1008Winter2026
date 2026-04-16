package Shopify;

interface PaymentMethod {
    boolean authorize(double amount);
    void process(double amount);
    String getName();
}
