public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(10.0);

        System.out.println("Before resize: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        circle.resize(50);

        System.out.println("After resize: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}