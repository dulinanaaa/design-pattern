package builder;

import product.Circle;
import product.Coor;

public class CircleBuilder {

    private Circle circle = new Circle();

    public CircleBuilder setRadius(double radius) {
        circle.setRadius(radius);
        return this;
    }

    public CircleBuilder setCoor(double x, double y) {
        Coor coor = new Coor();
        coor.setX(x);
        coor.setY(y);
        circle.setCoor(coor);
        return this;
    }

    public Circle build() {
        return circle;
    }
}
