package shapeAbstractFactory;


public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Dessiner un cercle");
    }
}
