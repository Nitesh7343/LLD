//package SRP;

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
    private ShoppingCart cart;

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

class CartStorage{
    private ShoppingCart cart;

    public CartStorage(ShoppingCart cart) {
        this.cart = cart;
    }

    public void saveToDB() {
        System.out.println("Saved to DB");
    }
}

public class SRP_Follow {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 40_000));
        cart.addProduct("Mobile",35_000);

        System.out.println(cart.calcPrice());

        PrintInvoice print = new PrintInvoice(cart);
        print.print();

        CartStorage store = new CartStorage(cart);
        store.saveToDB();

    }
}
