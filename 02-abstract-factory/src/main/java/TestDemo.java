import factory.CircleFactory;
import factory.Factory;
import factory.SquareFactory;
import product.Element;
import product.Shape;

public class TestDemo {
    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Shape circleShape = circleFactory.getShape();
        circleShape.draw();
        Element circleElement = circleFactory.getElement();
        circleElement.element();

        Factory squraeFactory = new SquareFactory();
        Shape squraeShape = squraeFactory.getShape();
        squraeShape.draw();
        Element squraeElement = squraeFactory.getElement();
        squraeElement.element();
    }
}
