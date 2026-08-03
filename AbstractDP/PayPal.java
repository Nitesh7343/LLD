package AbstractDP;

public class PayPal implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paying " + " using PayPal");
    }
}
