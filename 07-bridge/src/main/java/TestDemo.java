import color.Color;
import color.GreenColor;
import color.RedColor;
import shape.CircleShape;
import shape.Shape;
import shape.SquareShape;

public class TestDemo {
    public static void main(String[] args) {
        Color red = new RedColor();
        Shape circle = new CircleShape();
        circle.setColor(red);
        circle.draw();

        System.out.println("----------------------");

        Color green = new GreenColor();
        Shape square = new SquareShape();
        square.setColor(green);
        square.draw();
    }
}
