package factory;

public class SandwichFactory {
    public  static final  int cheeseBurger = 1;
    public  static final  int beefBurger = 2;
    public static Sandwich createSandwich(int sandwichId){
            switch (sandwichId){
                case cheeseBurger:
                    return new CheeseBurger();
                case beefBurger:
                    return new BeefBurger();
                default:
                    throw new IllegalArgumentException("Ce sandwich est en cours de rupture, revenez plus tard !");
            }
    }
}
