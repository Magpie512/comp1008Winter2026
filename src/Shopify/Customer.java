package Shopify;

public abstract class Customer {
    protected String ID;

    public Customer(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public abstract PaymentMethod getPreferredMethod();
}
