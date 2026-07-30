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

    public static class BurgerBuilder{
        private final String patty;
        private final String bun;

        private String sides;
        private boolean hasCheese;
        private String drink;

        public BurgerBuilder(String patty, String bun) {
            this.patty = patty;
            this.bun = bun;
        }

        public BurgerBuilder hasCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder hasSides(String sides) {
            this.sides = sides;
            return this;
        }

        public BurgerBuilder hasDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }

}
