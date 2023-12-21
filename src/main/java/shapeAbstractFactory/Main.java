package shapeAbstractFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new RedCircleFactory();
        Shape shape = abstractFactory.createShape();
        Color color = abstractFactory.createColor();


        //shape.draw();
        color.fill();

    }
}
