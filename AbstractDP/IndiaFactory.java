package AbstractDP;

public class IndiaFactory implements RegionFactory {

    public PaymentGateway createPaymentGateway(String type) {

        return switch(type.toLowerCase()) {
            case "razerpay" -> new RazerPay();
            case "payu" -> new PayU();
            default -> throw new IllegalArgumentException("Unsupprted payment gateway " + type);
        };
        
    }

    public Invoice createInvoice() {
        return new GSTInvoice();
    }
}
