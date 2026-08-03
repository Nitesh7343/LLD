package AbstractDP;

public interface RegionFactory {
    PaymentGateway createPaymentGateway(String type);
    Invoice createInvoice();
}