package AdapterDP;

public class RazerPayAdapter implements PaymentGateway {
    RazerPay razerpay = new RazerPay();
    public void pay() {
        razerpay.makePyament();
    }
}
