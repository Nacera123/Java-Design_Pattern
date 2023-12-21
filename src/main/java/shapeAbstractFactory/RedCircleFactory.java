package shapeAbstractFactory;

public class RedCircleFactory implements AbstractFactory {

    @Override
    public Color createColor() {
        return new Red();
    }

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
