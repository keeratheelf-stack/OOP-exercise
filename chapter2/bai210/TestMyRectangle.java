public class TestMyRectangle {
    public static void main(String[] args) {
        // Thử constructor nhận hai đối tượng MyPoint
        MyPoint point1 = new MyPoint(2, 8);
        MyPoint point2 = new MyPoint(7, 3);

        MyRectangle rectangle1 = new MyRectangle(point1, point2);

        System.out.println(rectangle1);
        System.out.println("Top-left: " + rectangle1.getTopLeft());
        System.out.println("Bottom-right: "
                + rectangle1.getBottomRight());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: "
                + rectangle1.getPerimeter());

        // Thử thay đổi hai góc
        rectangle1.setTopLeft(new MyPoint(1, 9));
        rectangle1.setBottomRight(new MyPoint(9, 1));

        System.out.println("After changing corners:");
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());

        // Thử constructor nhận tọa độ
        MyRectangle rectangle2 = new MyRectangle(0, 10, 6, 4);
        System.out.println("Rectangle 2: " + rectangle2);
    }
}