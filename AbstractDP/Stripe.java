package AbstractDP;

public class Stripe implements PaymentGateway {
     public void pay(double amount) {
        System.out.println("Paying " + " using Stripe");
    }
}
