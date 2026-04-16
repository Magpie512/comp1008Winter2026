package Shopify;

public class Crypto implements PaymentMethod{
    @Override
    public boolean authorize(double amount){
        System.out.println("Crypto payment authorized for: " + amount);
        return true;
    }

    @Override
    public void process(double amount){
        System.out.println("Crypto payment processed: " + amount);
    }

    @Override
    public String getName(){
        return "Crypto";
    }
}
