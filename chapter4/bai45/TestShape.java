public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Filled: " + shape1.isFilled());

        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1);

        Shape shape2 = new Shape("purple", true);
        System.out.println(shape2);

        // Test Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "blue", false);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());

        circle3.setRadius(4.0);
        System.out.println("After setRadius: " + circle3);

        // Test Rectangle
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.0, 3.0);
        Rectangle rectangle3 =
                new Rectangle(4.0, 5.0, "yellow", false);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());

        rectangle3.setWidth(6.0);
        rectangle3.setLength(7.0);
        System.out.println("After changing dimensions: " + rectangle3);

        // Test Square
        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0, "red", false);

        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println("Side: " + square3.getSide());
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());

        square3.setSide(6.0);
        System.out.println("After setSide: " + square3);

        square3.setWidth(7.0);
        System.out.println("After setWidth: " + square3);
        System.out.println("Width: " + square3.getWidth()
                + ", length: " + square3.getLength());

        square3.setLength(8.0);
        System.out.println("After setLength: " + square3);
        System.out.println("Width: " + square3.getWidth()
                + ", length: " + square3.getLength());
    }
}