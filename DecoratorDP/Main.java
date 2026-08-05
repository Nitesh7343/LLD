package DecoratorDP;

public class Main {
    public static void main(String[] args) {
        // Customer1 wants simple margherita pizza
        Pizza Customer1 = new MargheritaPizza(); //completed

        // Customer2 wants simple margherita pizza
        Pizza Customer2 = new MargheritaPizza(); //completed

        // Customer1 changed his mind now he want pizza with olive and extra cheese

        // ohh okok i'm using decorator pattern so i can handle this even after object created
        Customer1 = new ExtraCheese(new Olive(Customer1)); // added extra chess and olive on already created Customer1 pizza 
        // completed

        // hey listen Customer2 wants his pizza with StuffedCrust....
        // umm okay it is good with decorator pattern.
        Customer2 = new StuffedCrust(Customer2); //completed

        //Both customer loved the service they're asking for bill now

        //ohh sure
        System.out.println(Customer1.getDesc() +": "+Customer1.price());
        System.out.println(Customer2.getDesc() + ": "+Customer2.price());
    }
}
