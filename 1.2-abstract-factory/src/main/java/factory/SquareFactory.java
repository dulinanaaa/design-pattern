package factory;

import product.Element;
import product.Shape;
import product.SquareElement;
import product.SquareShape;

public class SquareFactory implements Factory {
    public Shape getShape() {
        return new SquareShape();
    }

    public Element getElement() {
        return new SquareElement();
    }
}
