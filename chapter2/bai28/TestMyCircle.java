import java.util.Arrays;

public class TestMyCircle{
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        System.out.println("Circle 1: " + circle1);

        MyCircle circle2 = new MyCircle(3, 4, 5);
        System.out.println("Circle 2: " + circle2);

        MyPoint point = new MyPoint(6, 8);
        MyCircle circle3 = new MyCircle(point, 2);
        System.out.println("Circle 3: " + circle3);

        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Center: " + circle2.getCenter());
        System.out.println("Center X: " + circle2.getCenterX());
        System.out.println("Center Y: " + circle2.getCenterY());
        System.out.println("Center coordinates: " + Arrays.toString(circle2.getCenterXY()));

        circle2.setRadius(6);
        circle2.setCenter(new MyPoint(1, 2));
        circle2.setCenterX(7);
        circle2.setCenterY(8);
        circle2.setCenterXY(9, 10);
        System.out.println("Circle 2 after changes: " + circle2);

        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());

        System.out.println("Distance between centers: " + circle2.distance(circle3));

    }
}