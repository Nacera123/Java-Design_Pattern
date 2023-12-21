package shapeFactory;

public class SquareCreator extends FactoryShapeCreator{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
