package factory;

public class Main {
    public static void main(String[] args) {

        Sandwich sandwitch = SandwichFactory.createSandwich(SandwichFactory.beefBurger);
        System.out.println(sandwitch.preparing());

    }
}
