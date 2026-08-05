package AdapterDP;

public class Main {
    public static void main(String[] args) {
        CheckoutService service = new CheckoutService(new StripeAdapter());
        service.checkout();
    }
}
