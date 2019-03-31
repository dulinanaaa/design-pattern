package director;

import builder.CircleBuilder;
import product.Circle;
import product.Coor;

public class TestDemo {
    public static void main(String[] args) {
        Circle circle = new CircleBuilder().setRadius(10.0).setCoor(2.5, 3.5).build();

        System.out.println("半径：" + circle.getRadius());
        Coor coor = circle.getCoor();
        System.out.println("坐标x:" + coor.getX());
        System.out.println("坐标y:" + coor.getY());
    }
}
