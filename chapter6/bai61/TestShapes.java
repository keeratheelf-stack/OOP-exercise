public class TestShapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);

        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // ERROR: Shape không khai báo getRadius()
        // System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // ERROR: không thể tạo trực tiếp đối tượng của abstract class
        // Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);

        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // ERROR: Shape không khai báo getLength()
        // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);

        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // ERROR: Shape không khai báo getSide()
        // System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        // ERROR: Rectangle không khai báo getSide()
        // System.out.println(r2.getSide());

        // Dùng kiểu Square để gọi getSide()
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        // Kiểm tra Square luôn giữ width và length bằng nhau
        sq1.setWidth(4.0);
        System.out.println("After setWidth: "
                + sq1.getWidth() + ", " + sq1.getLength());

        sq1.setLength(5.0);
        System.out.println("After setLength: "
                + sq1.getWidth() + ", " + sq1.getLength());
    }
}