import factory.CircleFactory;
import factory.Factory;
import factory.SquareFactory;
import product.Shape;

public class TestDemo {
    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Shape circleShape = circleFactory.getShape();
        circleShape.draw();

        Factory squareFacory = new SquareFactory();
        Shape squareShape = squareFacory.getShape();
        squareShape.draw();
    }
}
