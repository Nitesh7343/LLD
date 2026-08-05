package DecoratorDP;

public class StuffedCrust extends PizzaDecorator {

    StuffedCrust(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + "Stuffed Crust ";
    }

    @Override
    public double price() {
        return pizza.price() + 30.0;
    }

    
}
