package factory_and_abstractFatory;

public class FactoryCercleVert implements AbstractFactory{

    @Override
    public Forme dessinerUneForme(){
        return new Cercle();
    }    @Override
    public Couleur colorerLaForme(){
        return new Vert();
    }
}
