public class Product implements CartItem {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display(String intent) {
        System.out.printf("%s Product: %s - ₹%.2f %n",intent,name,price);
    }
}
