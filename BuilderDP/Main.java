package BuilderDP;

public class Main {
    public static void main(String[] args) {
        BurgerMeal bm1 = new BurgerMeal.BurgerBuilder("Butter", "Allo").build();
        BurgerMeal bm2 = new BurgerMeal.BurgerBuilder("Butter", "Allo")
                            .hasCheese(true).hasDrink("Espresso").hasSides("Cheese Nuggets").build();

        System.out.println(bm1);
        System.out.println(bm2);
    }
}
