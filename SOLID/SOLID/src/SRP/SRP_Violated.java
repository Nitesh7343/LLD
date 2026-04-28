//package SRP;

import java.util.*;

class Product {
   String name;
   int price;

   Product(String var1, int var2) {
      this.name = var1;
      this.price = var2;
   }
}

class ShoppingCart {
   private ArrayList<Product> cart = new ArrayList();

   public boolean addProduct(Product var1) {
      this.cart.add(var1);
      return true;
   }

   public void addProduct(String var1, int var2) {
      this.cart.add(new Product(var1, var2));
   }

   public ArrayList<Product> getProduct() {
      return this.cart;
   }

   public int calcPrice() {
      int total = 0;

      for(Product p : this.cart) {
         total += p.price;
      }

      return total;
   }

   public void printInvoic() {
      for(Product var2 : this.cart) {
         System.out.println("{ Product Name : " + var2.name + "Product Price : " + var2.price + " }");
      }

   }

   public void saveToDB() {
      System.out.println("Product Cart saved to DB");
   }
}

public class SRP_Violated{
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(new Product("Laptop",60_000));
        cart1.addProduct("Mobile",30_000);
        ArrayList<Product> product = cart1.getProduct();
        for(Product p : product) {
            System.out.println(p.name+" "+p.price);
        }
        System.out.println(cart1.calcPrice());
        cart1.printInvoic();
    }
   }
