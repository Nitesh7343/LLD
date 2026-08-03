package AbstractDP;

public class jpay implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paying "+amount+" using jpay from japan");
    }
}
