package shapeFactory;

public class CircleCreator extends FactoryShapeCreator{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
