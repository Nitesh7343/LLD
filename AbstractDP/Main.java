package AbstractDP;

public class Main {
    public static void main(String[] args) {

        CheckoutService s1 = new CheckoutService(new IndiaFactory(), "razerpay");
        CheckoutService s2 = new CheckoutService(new UsFactory(), "stripe");
        CheckoutService s3 = new CheckoutService(new JapanFactory(), "jpay");

        s1.completeOrder(30000);
        s2.completeOrder(35000);
        s3.completeOrder(12000);
    }
}
