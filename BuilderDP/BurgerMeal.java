package BuilderDP;

public class BurgerMeal {
    private final String patty;
    private final String bun;


    private final String sides;
    private final boolean hasCheese;
    private final String drink;

    private BurgerMeal(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.sides = builder.sides;
        this.hasCheese = builder.hasCheese;
        this.drink = builder.drink;
    }

    @Override
    public String toString() {
        return "BurgerMeal [patty=" + patty + ", bun=" + bun + ", sides=" + sides + ", hasCheese=" + hasCheese
                + ", drink=" + drink + "]";
    }

}
