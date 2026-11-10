public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(10, 20);

        System.out.println(point);
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        point.setX(30);
        point.setY(40);
        System.out.println("After setX and setY: " + point);

        point.setXY(100, 10);
        System.out.println("After setXY: " + point);
    }
}