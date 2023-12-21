package factory_and_abstractFatory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactory1 = new FactoryCercleVert();
        AbstractFactory abstractFactory2 = new FactoryRectangleViolet();


        Forme forme1 = abstractFactory1.dessinerUneForme();
        Couleur couleur1 = abstractFactory1.colorerLaForme();

        Forme forme2 = abstractFactory2.dessinerUneForme();
        Couleur couleur2 = abstractFactory2.colorerLaForme();



        forme2.dessiner();
        couleur1.colorier();

    }
}
