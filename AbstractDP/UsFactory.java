package AbstractDP;

public class UsFactory implements RegionFactory {
    public PaymentGateway createPaymentGateway(String type) {
        
        return  switch(type.toLowerCase()) {
            case "stripe" -> new Stripe();
            case "paypal" -> new PayPal();
            default -> throw new IllegalArgumentException("Unsupprted payment gateway " + type);
        };
        
    }

    public Invoice createInvoice() {
        return new USInvoice();
    }
}
