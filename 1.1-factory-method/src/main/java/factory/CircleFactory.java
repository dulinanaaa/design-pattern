package factory;

import product.CircleShape;
import product.Shape;

public class CircleFactory implements Factory {
    public Shape getShape() {
        return new CircleShape();
    }
}
