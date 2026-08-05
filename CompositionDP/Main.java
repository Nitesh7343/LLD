import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Product Book = new Product("Maths",110);
        Product Iphone = new Product("Iphone X",79000);
        Product Bottle = new Product("Water Bottle",300);
        Product Macbook = new Product("Macbook",80000);
        Product Charger = new Product("Charger",1200);
        Product Earbuds = new Product("AirPods",20000);
        Product PenSet = new Product("PerSet", 80);
        Product HighLighter = new Product("HighLighter", 50);
        Product CricketBat = new Product("MRF", 6000);

        ProductBundel schoolKit = new ProductBundel("SchoolKit");
        schoolKit.addProduct(Bottle);
        schoolKit.addProduct(Book);
        schoolKit.addProduct(HighLighter);
        schoolKit.addProduct(PenSet);

        ProductBundel IphoneBundle = new ProductBundel("Iphone");
        IphoneBundle.addProduct(Iphone);
        IphoneBundle.addProduct(Macbook);
        IphoneBundle.addProduct(Charger);
        IphoneBundle.addProduct(Earbuds);

// -----------------------------------------Without Composition-----------------------------------------------------------------------------------------

        // // As Product and ProductBundle are two diffrent type objects so i have to make List of Object type.
        // List<Object> cartItems = new ArrayList<>();
        // cartItems.add(schoolKit);
        // cartItems.add(IphoneBundle);
        // cartItems.add(CricketBat);

        // // To get total price of the cart i have to iterate thorugh the cart and check whether it is a product or productBundle object..

        // double total = 0;
        // for(Object item : cartItems) {
        //     if(item instanceof Product) {
        //         Product product = (Product)item;
        //         product.display(" ");
        //         total += product.getPrice();
        //     }
        //     else if(item instanceof ProductBundel){
        //         ProductBundel product = (ProductBundel) item;
        //         product.display(" ");
        //         total += product.getPrice();
        //     }
        // }

        // System.out.println("Total Price: " + total);

// -----------------------------------------Without Composition-----------------------------------------------------------------------------------------


// -----------------------------------------Using Composition-----------------------------------------------------------------------------------------

        // As both Product and ProductBundle implemenrts CartItem interface so both are of same object type.
        List<CartItem> cartItems = new ArrayList<>();
        cartItems.add(schoolKit);
        cartItems.add(IphoneBundle);
        cartItems.add(CricketBat);

        // To get total price of the cart i have to iterate thorugh the cart and no need to check for type.

        double total = 0;
        for(CartItem item : cartItems) {
            total += item.getPrice();
            item.display(" ");
        }

        System.out.println("Total Price: " + total);

        //Here no type checks are required.
    }
}
