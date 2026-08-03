package AbstractDP;

public class JapanFactory implements RegionFactory {

    public PaymentGateway createPaymentGateway(String type) {
        return switch(type.toLowerCase()) {
            case "jpay" -> new jpay();
            default -> throw new IllegalArgumentException("Invalid Gateway " + type);
        };
    }

    public Invoice createInvoice() {
        return new japanInvoice();
    }
}
