import java.util.*;


class Product{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}

class ShoppingCart{
    private List<Product> cart = new ArrayList<>();

   public boolean addProduct(Product var1) {
      this.cart.add(var1);
      return true;
   }

   public void addProduct(String var1, int var2) {
      this.cart.add(new Product(var1, var2));
   }

   public List<Product> getProducts() {
      return this.cart;
   }

   public int calcPrice() {
      int total = 0;

      for(Product p : this.cart) {
         total += p.getPrice();
      }

      return total;
   }
   
}

class PrintInvoice {
    ShoppingCart cart;

    public PrintInvoice(ShoppingCart cart) {
        this.cart = cart;
    }

    public void print() {
        System.out.println("----- Invoice -----");

        for (Product p : cart.getProducts()) {
            System.out.println("Product: " + p.getName() +
                               ", Price: " + p.getPrice());
        }
        System.out.println("-------------------");
        System.out.println("Total: " + cart.calcPrice());
    }
}

interface Storage {
    void save(ShoppingCart cart);
}

class SQLStorage implements Storage{
    public void save(ShoppingCart cart) {
        System.out.println("Saved to SQL");
    }
}

class MongoStorage implements Storage{
    public void save(ShoppingCart cart) {
        System.out.println("Saved to Mongo");
    }
}

class FileStorage implements Storage{
    public void save(ShoppingCart cart) {
        System.out.println("Saved to File");
    }
}

public class OCP_Follows {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 40_000));
        cart.addProduct("Mobile",35_000);

        System.out.println(cart.calcPrice());

        PrintInvoice print = new PrintInvoice(cart);
        print.print();

        Storage store = new SQLStorage();
        store.save(cart);
        
        store = new MongoStorage();
        store.save(cart);

        store = new FileStorage();
        store.save(cart);
    }
}
