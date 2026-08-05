package DecoratorDP;

public class ExtraCheese extends PizzaDecorator {

    ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    public String getDesc() {
        return pizza.getDesc() + "With Extra Cheese ";
    }

    public double price() {
        return pizza.price() + 40.0;
    }
}
