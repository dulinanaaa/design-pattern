package factory;

import product.Element;
import product.Shape;

public interface Factory {
    Shape getShape();

    Element getElement();
}
