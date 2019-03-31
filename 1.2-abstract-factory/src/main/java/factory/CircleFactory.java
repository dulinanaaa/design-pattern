package factory;

import product.CircleElement;
import product.CircleShape;
import product.Element;
import product.Shape;

public class CircleFactory implements Factory {
    public Shape getShape() {
        return new CircleShape();
    }

    public Element getElement() {
        return new CircleElement();
    }
}
