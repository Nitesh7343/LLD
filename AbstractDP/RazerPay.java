package AbstractDP;

public class RazerPay implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paying "+amount + " using Razerpay");
    }
}
