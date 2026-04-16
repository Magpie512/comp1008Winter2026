package Shopify;

class TechCustomer extends Customer {
    public TechCustomer(String id) {
        super(id);
    }

    @Override
    public PaymentMethod getPreferredMethod() {
        return new Crypto();
    }
}
