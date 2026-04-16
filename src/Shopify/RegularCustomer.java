package Shopify;

class RegularCustomer extends Customer {
    public RegularCustomer(String id) {
        super(id);
    }

    @Override
    public PaymentMethod getPreferredMethod() {
        return new CreditCard();
    }
}
