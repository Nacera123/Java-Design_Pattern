package shapeAbstractFactory;

public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Remplir en rouge");
    }
}
