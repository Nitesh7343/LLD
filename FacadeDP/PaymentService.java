package FacadeDP;

public class PaymentService {
    public void pay(int accountID, double price) {
        System.out.printf("Paying %.2f for %d... %n",price,accountID);
    }
}
