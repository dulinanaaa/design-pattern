package factory;

import product.Shape;
import product.SquareShape;

public class SquareFactory implements Factory {
    public Shape getShape() {
        return new SquareShape();
    }
}
