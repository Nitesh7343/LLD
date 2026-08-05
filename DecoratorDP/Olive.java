package DecoratorDP;

public class Olive extends PizzaDecorator {

    Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + "With Olive ";
    }

    @Override
    public double price() {
        return pizza.price() + 50.0;
    }
    
}
