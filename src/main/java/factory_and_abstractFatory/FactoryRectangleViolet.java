package factory_and_abstractFatory;

public class FactoryRectangleViolet implements AbstractFactory{

    @Override
    public Couleur colorerLaForme() {
        return new Violet();
    }

    @Override
    public Forme dessinerUneForme() {
        return new Rectangle();
    }
}
