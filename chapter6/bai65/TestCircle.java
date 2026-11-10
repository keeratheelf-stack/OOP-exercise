public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}