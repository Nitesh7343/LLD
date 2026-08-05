package AdapterDP;

public class CheckoutService {
    PaymentGateway gateway;
    CheckoutService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void checkout() {
        gateway.pay();
    }
}
