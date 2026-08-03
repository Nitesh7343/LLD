package AbstractDP;

public class CheckoutService {
    PaymentGateway gateway;
    Invoice invoice;
    String gatewayType;

    CheckoutService(RegionFactory factory , String gatewayType) {
        this.gatewayType = gatewayType;
        this.gateway = factory.createPaymentGateway(gatewayType);
        this.invoice = factory.createInvoice();
    }

    public void completeOrder(double amount) {
        gateway.pay(amount);
        invoice.generateInvoice();
    }
}
