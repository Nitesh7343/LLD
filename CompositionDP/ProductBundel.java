import java.util.List;
import java.util.ArrayList;
public class ProductBundel implements CartItem {
    private String bundleName;
    private List<CartItem> products = new ArrayList<>();

    public ProductBundel(String bundleName) {
        this.bundleName = bundleName;
    }

    public void addProduct(CartItem product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(CartItem p : products) total += p.getPrice();
        return total;
    }

    @Override
    public void display(String intent) {
        System.out.println(intent + " Bundle: " + bundleName);
        for(CartItem p : products) {
            p.display(intent+" ");
        }
    }
}
