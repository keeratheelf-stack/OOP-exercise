public class TestMyTriangle {
    public static void main(String[] args) {
        // Thử constructor nhận tọa độ.
        // Ba cạnh là 3, 4, 5 nên đây là tam giác Scalene.
        MyTriangle triangle1 =
                new MyTriangle(0, 0, 3, 0, 0, 4);

        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());
        triangle1.printType();

        // Thử constructor nhận ba đối tượng MyPoint.
        // Hai cạnh bằng nhau nên đây là tam giác Isosceles.
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(4, 0);
        MyPoint point3 = new MyPoint(2, 3);

        MyTriangle triangle2 =
                new MyTriangle(point1, point2, point3);

        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
    }
}