package AdapterDP;

public class StripeAdapter implements PaymentGateway {
    Stripe stripe = new Stripe();
    public void pay() {
        stripe.stripePay();
    }
}
