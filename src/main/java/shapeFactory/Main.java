package shapeFactory;

public class Main {

    public static void main(String[] args) {
        FactoryShapeCreator creator = new CircleCreator();
        Shape shape = creator.createShape();
        shape.draw();

    }
}
