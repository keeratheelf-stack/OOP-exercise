public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(3.0);
        GeometricObject rectangle = new Rectangle(2.0, 5.0);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}